package home_work_1;
/*
4. Разбираемся с операторами ветвления. Каждую задачу в отдельном классе.
   Пояснения по задачам сотреть в презентации и на сайте по ссылке в презентации.
	4.1 Определить нечётное число
	4.2 Среди трёх чисел найти среднее
	4.3 Проверка делимости одного числа на другое
	4.4 Перевести байты в килобайты или наоборот
	4.5 Буква или иной символ
	4.6 Определить високосный год или нет
 */

public class Task_4_1 {

    public boolean isNotEvenNumber(int numberForCheck) {
        return (numberForCheck % 2 != 0) ? true : false;
    }
}
