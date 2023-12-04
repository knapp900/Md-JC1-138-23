package home_work_6.searchEngine;

public interface ISearchEngine {
    /**
     * ����� ���������� ���������� � ���������� ��� ������� ����������� �����
     * � ������. ������ �������� ����� � ������� ����, ������ �������� ��� ���� � ������.
     *
     * @param text - ������ �������� ����� � ������� ����.
     * @param word - ������ �������� ��� ���� � ������.
     * @return - ���������.
     */
    long search(String text, String word);
}
