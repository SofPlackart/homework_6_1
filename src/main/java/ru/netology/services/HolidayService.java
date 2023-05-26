package ru.netology.services;

public class HolidayService {

    public int calcHoliday(int income, int expenses, int threshold) {
        int money = 0; //количество денег на счету
        int count = 0; //счётчик месяцев отдыха
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
