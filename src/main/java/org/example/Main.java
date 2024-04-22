package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Task one
        int[] money = {151,23,346,34,112};
        int total = 0;
        for (int j : money) {
            total += j;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

        // Task two
        int[] money2 = {151,23,346,34,112};
        int min = -1;
        int max = -1;
        for (int j : money2) {
            if (max < j) {
                max = j;
            }
            if (min > j || min < 0) {
                min = j;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");

        // Task three
        float[] money3 = {151,23,346,34,112};
        float total3 = 0;
        for (float v : money3) {
            total3 += v;
        }
        float averageExpense = total3/ money3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей");

        // Task four
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}