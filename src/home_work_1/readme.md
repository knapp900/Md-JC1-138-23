### Task1
* Побитовые операции:Метериал: http://developer.alexanderklimov.ru/android/java/bitwise.php
  * 1.1 Создать класс и написать код с вводом двух чисел через консоль и применением побитовых операций И и ИЛИ к этим двум числам. Результат операций распечатать.
  * 1.2 В комментариях напротив каждого ввода значений написать пример выбранного числа в двоичном коде (8 бит), также написать комметарии напротив каждой операции на примере этих двух чисел.
  * 1.3 В отдельном классе попробуйте сделать побитовую операцию с литералом 42.5, опишите результат в комментариях в классе с заданием.

### Task_2
* Изучить приоритетность операторов по таблице в презентации. Сначала посчитать результаты всех ниже приведённых примеров устно, а потом проверить в IDE (в случае ошибок свериться с таблицей приоритетов, повторять просчёт примеров до полного соответствия). Результатом МОЖЕТ БЫТЬ ОШИБКА компиляции, МОЖЕТ БЫТЬ ОШИБКА выполнения программы или корректный результат. Все значения в этих переменных должны быть записаны в int и boolean переменные. Напротив каждой строчки нужно написать комментарий с результатом и объяснением почему вы получили такой результат.
Пояснение: ВНИМАНИЕ --8 значит что вам нужно создать переменную, например а, и проинициализировать её 8, а дальше её использовать как --а. Данная переменная во всех выражениях должна равняться 8;
```aidl 
        2.1 5 + 2 / 8
        2.2 (5 + 2) / 8
        2.3 (5 + 2++) / 8
        2.4 (5 + 2++) / --8
        2.5 (5 * 2 >> 2++) / --8
        2.6 (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
        2.7 (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
        2.8 6 - 2 > 3 && 12 * 12 <= 119
        2.9 true && false
```
### Task_3
* Изучить библиотеку (класс) Math из jdk. (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html). Отразить эксперименты в сданной домашней работе. Материалов в интернете очень много

### Task_4
* Разбираемся с операторами ветвления. Каждую задачу в отдельном классе. Пояснения по задачам сотреть в презентации и на сайте по ссылке в презентации.
  *  4.1 Определить нечётное число
  * 4.2 Среди трёх чисел найти среднее
  * 4.3 Проверка делимости одного числа на другое
  * 4.4 Перевести байты в килобайты или наоборот
  * 4.5 Буква или иной символ
  * 4.6 Определить високосный год или нет

### Task_5
* Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято с https://codingbat.com/prob/p187868).
  * 5.1 Данный метод будет принима два параметра
  * 5.2 Будет отвечать на вопрос спать ли дальше (да\нет) (возвращать true либо false).
  * 5.3 Первый параметр boolean weekday обозначает рабочий день
  * 5.4 Второй параметр boolean vacation обозначает отпуск.
  * 5.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
  * 5.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу

### Task_6
 * Запросить у пользователя через консоль его имя. В данном задании у вас должно получиться 3 класса.
   Что в итоге надо сделать (общее условие):
   * 1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке, а на второй "Я тебя так долго ждал".
   * 2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
   * 3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
    Как это сделать:
    *  6.1 Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи if else
    *  6.2 Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи if else if
    *  6.3 Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи switch
    ВНИМАНИЕ! В примерах c if для сравнения имён использовать код вида Objects.equals("Имя1", "Имя2").

### Task_7
 *  7.* Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main, данный метод будет принимает один параметр и будет возвращать строку в отформатированном виде. В метод будет передаваться массив из 10 цифр (от 0 до 9). Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX. Например передан массив: {1,2,3,4,5,6,7,8,9,0}, возвращаемый результат: (123) 456-7890. (Взято с https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java). В задании нельзя использовать колекции, стрима.
### Task_8 
 * 8.** Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number) и возвращает двоичное представление числа. В методе можно использовать только обычную математику которая описана в теории. Если число отрицательное то вернуть дополнительный код. Теория https://planetcalc.ru/747. Пример:
    * 8.1 Вводим: 42.  Возвращает: 00101010
    * 8.2 Вводим: 15.  Возвращает: 00001111
    * 8.3 Вводим: -42. Возвращает: 11010110
    * 8.4 Вводим: -15. Возвращает: 11110001

!!!!! Далее задания выполнять только после прохождения темы "Тестирование" на курсе !!!!!!
### Task_9
   * 9 Переделать задание 6.
   * 9.1 Создать интерфейс ICommunicationPrinter. В данном интерфейсе должен быть объявлен метод String welcom(String name)
   * 9.2 Классы созданные ранее должны реализовывать интерфейс ICommunicationPrinter выполняя поставленную задачу в задании 6 и более не иметь точки входна внутри себя.
### Task_10
 * 10 Протестировать классы созданные в 4-7 задании. Если не выполнили задачи с *, то выполнить