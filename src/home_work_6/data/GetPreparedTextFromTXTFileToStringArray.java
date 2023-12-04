package home_work_6.data;
/*
2. Работа с коллекциями:
	2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set.
		Более подробное описание задачи, для понимания чего я хочу: Для решения данной задачи необходимо прочитать
		текстовый файл и поместить текст из данного текстового файла
		в строку. Далее данную строку необходимо обработать таким образом чтобы из неё можно было бы считывать слова.
		Далее каждое полученное слово поместить в Set.
		Благодаря возможностям Set'ов в итоге мы получим коллекцию содержащую набор слов который был использован при
		написании данного текста. В конце выводим в консоль количество использованных слов.
	2.2 Найти в тексте топ N (настраиваемое значение) слов и вывести количество этих слов используя Map и List.
	Отсортировать по количеству. Распечатать в консоль.
		Пример: Война - 200 раз, Мир - 100 раз и так далее. Знаки препинания, пробелы и переводы строк - это не слова.
		Более подробное описание задачи, для понимания чего я хочу: Для решения данной задачи необходимо прочитать
		текстовый файл  и поместить текст из данного текстового файла в строку.  Далее данную строку необходимо
		обработать таким образом чтобы из неё можно было бы считывать слова. Далее каждое полученное слово поместить
		как ключ в Map, а количество повторений в тексте ставить как значение. Для того чтобы это работало вам
		необходимо постоянно проверять наличие ключа в Map, и если нужный нам ключ уже присутсвует в нашей коллекции
		то мы должны увеличить уже имеющееся значение в коллекции на еденицу. После наполнения данной коллекции мы
		получим набор слов и их количество в тексте. Далее нам нужно придумать как отсортировать получившуюся коллекцию
		но к сожалению непосредственно эту коллекцию отсортировать не получится, придётся создавать для этого List и
		наполнять лист Entry из Map. В итоге из получившегося отсортированного набора данных вывести первые N записей.
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetPreparedTextFromTXTFileToStringArray implements Supplier<String[]> {

    private final String PATH_TO_FILE;
    private static final String SPLIT_BY_SPACE = "[\\s]";

    private static final Pattern WORD_PATTERN = Pattern.compile("[A-Za-zА-Яа-я\\d]+");

    public GetPreparedTextFromTXTFileToStringArray(String pathToFile) {
        this.PATH_TO_FILE = pathToFile;
    }

    @Override
    public String[] get() {
        try {
            return prepareStringToStringArrayWords(getStringFromFile());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Получение слов из файла без знаков пунктуации разделенными пробелами
     *
     * @return - строку с результатом
     * @throws IOException
     */
    private String getStringFromFile() throws IOException {

        StringBuilder builder = new StringBuilder();
        InputStream inputStream = new FileInputStream(PATH_TO_FILE);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

        while (reader.ready()) {
            String text = reader.readLine();
            Matcher matcher = WORD_PATTERN.matcher(text);

            while (matcher.find()) {
                builder.append(matcher.group() + " ");
            }
        }

        return builder.toString();
    }

    /**
     * Преобразует строку в String[]
     *
     * @param source - String
     * @return - String[]
     */
    private String[] prepareStringToStringArrayWords(String source) {

        return source.split(SPLIT_BY_SPACE);
    }


}
