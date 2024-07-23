package ru.netology.services;

public class FreelancerRestService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3; //уменьшаем деньги на траты и траты на отдых
            } else {
                money = money + income - expenses; //увеличиваем деньги на отдых и уменьшаем траты
            }
        }
        return count;
    }
}
