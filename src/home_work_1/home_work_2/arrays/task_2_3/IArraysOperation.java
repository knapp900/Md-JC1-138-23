package home_work_2.arrays.task_2_3;
/*
2.3* Выполнить задание 2.2 иным способом. Создать интерфейс IArraysOperation с методами из задания, каждый метод должен
принимать массив с которым он будет работать. Написать 4 отдельных класса и реализовать данный интерфейс:
		2.3.1. DoWhileOperation - во всех методах можно использовать только do....while
		2.3.2. WhileOperation - во всех методах можно использовать только while
		2.3.3. ForOperation - во всех методах можно использовать только for
		2.3.4. ForEachOperation - во всех методах можно использовать только foreach
 */

public interface IArraysOperation {
    void printAllElements(int[] array);

    void printEverySecondElement(int[] array);

    void printElementsInReverseOrder(int[] array);
}
