package com.dashuk;

import java.util.Scanner;

public class MonthName {

    static String[] monthNames = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};

    public static int getNumber() {
        System.out.print("Enter numbers month (1-12) (default=1): ");
        Scanner inputLine = new Scanner(System.in);
        try {
            return inputLine.nextInt();
        } catch (Exception InputMismatchExceptio) {
            System.out.println("Number must be from 1-12, will be set default 1");
            return 1;
        }
    }

    public static String getMonthName(Integer numberMonth) {
        if (numberMonth < 1 | numberMonth > 12) {
            System.out.print("Wrong number, will be use default =1 ");
            numberMonth = 1;
        }
        return monthNames[numberMonth - 1];
    }

}
