package home_work_1;
/*
5.* Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято с https://codingbat.com/prob/p187868).
	5.1 Данный метод будет принима два параметра
	5.2 Будет отвечать на вопрос спать ли дальше (да\нет) (возвращать true либо false).
	5.3 Первый параметр boolean weekday обозначает рабочий день
	5.4 Второй параметр boolean vacation обозначает отпуск.
	5.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
	5.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу
 */

public class Task_5 {

    public static void main(String[] args) {

        boolean weekday = true; // false означает не рабочий день
        boolean vocation = false; // false означает что мы не в отпуске

        System.out.println(printAnswer(weekday, vocation));

    }

    public static String printAnswer(boolean weekday,boolean vocation){
        return sleepIn(weekday, vocation) ? "Можно спать дальше!" : "Пора идти на работу!";
    }

    /*
    Метод sleepIn работает на принципах логического оператора ИЛИ.
    Если первый операнд || равен true, то второй не вычисляется, так как уже понятно, что || вернёт true.
    true || true == true
    false || false == false
    true || false == true
    false || true == true
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {

        return vacation || !weekday;
    }
}
