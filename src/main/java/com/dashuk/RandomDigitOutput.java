package com.dashuk;

import java.util.Random;
import java.util.Scanner;

public class RandomDigitOutput {

    public static int getNumber() {
        System.out.print("Enter numbers for line: ");
        Scanner inputLine = new Scanner(System.in);
        return inputLine.nextInt();
    }

    public static void outToConsole(Boolean withNewLine) {
        Random randomDigit = new Random();
        int countLine = getNumber();
        System.out.println("Output numbers: ");
        for (int i = 0; i < countLine; i++) {
            if (withNewLine) {
                System.out.println(randomDigit.nextInt(100));
            } else {
                System.out.print(randomDigit.nextInt(100) + " ");
            }
        }
    }
}
