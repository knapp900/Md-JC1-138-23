package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

import java.util.ArrayList;
import java.util.List;

/*
14**. Написать класс CalculatorStringExpression. Данное задание направлено на изучение паттера Адаптер.
        14.0 О адаптерах можно прочитать по ссылкам:
        14.0.1 https://refactoring.guru/ru/design-patterns/adapter
        14.0.2 https://www.wikiwand.com/ru/%D0%90%D0%B4%D0%B0%D0%BF%D1%82%D0%B5%D1%80_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)
        14.1 реализующий разбор (парсинг) СТРОКИ с математическим выражением:
        14.2 Класс должен понимать операторы: + - \ * ^ ||
        14.3 Класс должен понимать ( )
        14.4 Класс должен строго учитывать приоритеты в данном выражении
        14.5 Класс должен уметь парсить в строке константные значение: PI, E (Экспонента)
        14.6 Класс должен контролировать что в строке могут быть только допустие символы (числа, операторы, скобки,
        константы)
        14.7 Класс должен контролировать чтобы выражение было валидным (2 + 2 - хорошо, 2 + - плохо)
        14.8 Создать класс CalculatorStringExpressionMain в котором будет точка входа (main метод).
        В main методе требуется создать экземпляр калькулятора CalculatorStringExpression и используя методы из
        данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */

/**
 * Код взят из видеоурока https://github.com/Arhiser/java_tutorials/blob/master/src/ru/arhiser/parser/Main.java и
 * доработан под задачу. Адаптер работает с любым классом имплементирующим интерфейс ICalculator. Есть проблема с
 * приоритетностью POW!
 */

public class CalculatorStringExpression {

    private ICalculator calculator;

    public CalculatorStringExpression(ICalculator calculator) {

        this.calculator = calculator;

    }

    /**
     * Принимает стоку с математическим выражением и возвращает результат
     *
     * @param expressionText - выражение
     * @return - результат
     */
    public double calculate(String expressionText) {
        List<Lexeme> lexemes = lexAnalyze(expressionText);
        LexemeBuffer lexemeBuffer = new LexemeBuffer(lexemes);
        return expr(lexemeBuffer);
    }

    /**
     * Анализирует строку и возвращает список лексем
     * @param expText - выражение
     * @return - список лексем
     */
    private List<Lexeme> lexAnalyze(String expText) {
        ArrayList<Lexeme> lexemes = new ArrayList<>();
        int pos = 0;
        while (pos < expText.length()) {
            char c = expText.charAt(pos);
            switch (c) {
                case '(':
                    lexemes.add(new Lexeme(LexemeType.LEFT_BRACKET, c));
                    pos++;
                    continue;
                case ')':
                    lexemes.add(new Lexeme(LexemeType.RIGHT_BRACKET, c));
                    pos++;
                    continue;
                case '+':
                    lexemes.add(new Lexeme(LexemeType.OP_PLUS, c));
                    pos++;
                    continue;
                case '-':
                    lexemes.add(new Lexeme(LexemeType.OP_MINUS, c));
                    pos++;
                    continue;
                case '*':
                    lexemes.add(new Lexeme(LexemeType.OP_MUL, c));
                    pos++;
                    continue;
                case '/':
                    lexemes.add(new Lexeme(LexemeType.OP_DIV, c));
                    pos++;
                    continue;
                case 'E':
                    lexemes.add(new Lexeme(LexemeType.E, Double.toString(Math.E)));
                    pos++;
                    continue;
                case 'P':
                    lexemes.add(new Lexeme(LexemeType.Pi, Double.toString(Math.PI)));
                    pos++;
                    continue;
                case '^':
                    lexemes.add(new Lexeme(LexemeType.OP_POW, c));
                    pos++;
                    continue;
                default:
                    if (c <= '9' && c >= '0') {
                        StringBuilder sb = new StringBuilder();
                        do {
                            sb.append(c);
                            pos++;
                            if (pos >= expText.length()) {
                                break;
                            }
                            c = expText.charAt(pos);
                        }
                        while (c <= '9' && c >= '0' || c == '.');
                        if (c == '.') {
                            do {
                                sb.append(c);
                                pos++;
                                if (pos >= expText.length()) {
                                    break;
                                }
                                c = expText.charAt(pos);
                            } while (c <= '9' && c >= '0');
                        }
                        lexemes.add(new Lexeme(LexemeType.NUMBER, sb.toString()));
                    } else {
                        if (c != ' ') {
                            throw new RuntimeException("Unexpected character: " + c);
                        }
                        pos++;
                    }
            }
        }
        lexemes.add(new Lexeme(LexemeType.EOF, ""));
        return lexemes;
    }


    private double expr(LexemeBuffer lexemes) {
        Lexeme lexeme = lexemes.next();
        if (lexeme.type == LexemeType.EOF) {
            return 0;
        } else {
            lexemes.back();
            return plusminus(lexemes);
        }
    }


    private double plusminus(LexemeBuffer lexemes) {
        double value = multdiv(lexemes);
        while (true) {
            Lexeme lexeme = lexemes.next();
            switch (lexeme.type) {
                case OP_PLUS:
                    value = calculator.add(value, multdiv(lexemes));
                    break;
                case OP_MINUS:
                    value = calculator.subtract(value, multdiv(lexemes));
                    break;
                case EOF:
                case RIGHT_BRACKET:
                    lexemes.back();
                    return value;
                default:
                    throw new RuntimeException("Unexpected token: " + lexeme.value
                            + " at position: " + lexemes.getPos());
            }
        }
    }


    private double multdiv(LexemeBuffer lexemes) {
        double value = factor(lexemes);
        while (true) {
            Lexeme lexeme = lexemes.next();
            switch (lexeme.type) {
                case OP_POW:
                    value = calculator.power(value, (int) factor(lexemes));
                    break;
                case OP_MUL:
                    value = calculator.multiply(value, factor(lexemes));
                    break;
                case OP_DIV:
                    value = calculator.divide(value, (int) factor(lexemes));
                    break;
                case EOF:
                case RIGHT_BRACKET:
                case OP_PLUS:
                case OP_MINUS:
                    lexemes.back();
                    return value;
                default:
                    throw new RuntimeException("Unexpected token: " + lexeme.value
                            + " at position: " + lexemes.getPos());
            }
        }
    }

    private double factor(LexemeBuffer lexemes) {
        Lexeme lexeme = lexemes.next();
        switch (lexeme.type) {
            case NUMBER:
                return Double.parseDouble(lexeme.value);
            case LEFT_BRACKET:
                double value = plusminus(lexemes);
                lexeme = lexemes.next();
                if (lexeme.type != LexemeType.RIGHT_BRACKET) {
                    throw new RuntimeException("Unexpected token: " + lexeme.value
                            + " at position: " + lexemes.getPos());
                }
                return value;
            case E:
                return Double.parseDouble(lexeme.value);
            case Pi:
                return Double.parseDouble(lexeme.value);
            default:
                throw new RuntimeException("Unexpected token: " + lexeme.value
                        + " at position: " + lexemes.getPos());
        }
    }

    /**
     * Класс сущность лексемы
     */
    public class Lexeme {
        private LexemeType type;
        private String value;

        public Lexeme(LexemeType type, String value) {
            this.type = type;
            this.value = value;
        }

        public Lexeme(LexemeType type, Character value) {
            this.type = type;
            this.value = value.toString();
        }

        @Override
        public String toString() {
            return "Lexeme{" +
                    "type=" + type +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    /**
     * Класс буфер лексем
     */
    public static class LexemeBuffer {
        private int pos;

        public List<Lexeme> lexemes;

        public LexemeBuffer(List<Lexeme> lexemes) {
            this.lexemes = lexemes;
        }

        public Lexeme next() {
            return lexemes.get(pos++);
        }

        public void back() {
            pos--;
        }

        public int getPos() {
            return pos;
        }
    }

    /**
     * Перечисление представлений лексем
     */
    public enum LexemeType {
        LEFT_BRACKET, RIGHT_BRACKET,
        OP_PLUS, OP_MINUS, OP_MUL, OP_DIV, OP_POW,
        NUMBER,
        E, Pi,
        EOF;

    }
}
