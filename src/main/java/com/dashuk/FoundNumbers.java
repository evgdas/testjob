package com.dashuk;

import java.util.*;

public class FoundNumbers {

    public static int[] generateRandomArrayNumbers(int sizeArray) {
        Random random = new Random();
        int[] randomNumbersArray = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            randomNumbersArray[i] = random.nextInt(100);
        }
        return randomNumbersArray;
    }

    public static int findMinimumNumberInArray(int[] NumbersArray) {
        int minimumNumber = NumbersArray[0];
        for (int i : NumbersArray) {
            if (minimumNumber > i) {
                minimumNumber = i;
            }
        }
        return minimumNumber;
    }

    public static int findMaximumNumberInArray(int[] NumbersArray) {
        int maximumNumber = NumbersArray[0];
        for (int i : NumbersArray) {
            if (maximumNumber < i) {
                maximumNumber = i;
            }
        }
        return maximumNumber;
    }

    public static int findLenghtNumber(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] sortArrayByBigLenght(int[] arrayForSort) {
        for (int i = arrayForSort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (findLenghtNumber(arrayForSort[j]) < findLenghtNumber(arrayForSort[j + 1])) {
                    int bigNumber = arrayForSort[j];
                    arrayForSort[j] = arrayForSort[j + 1];
                    arrayForSort[j + 1] = bigNumber;
                }
            }
        }
        return arrayForSort;
    }

    public static int findAverageDigit(int[] arrayForAverage) {
        int summmaDigits = 0;
        for (int i = 0; i < arrayForAverage.length; i++) {
            summmaDigits += findLenghtNumber(arrayForAverage[i]);

        }
        return summmaDigits / arrayForAverage.length;
    }

    public static List<Integer> findNumbersWithMoreDigitAverageDigit(int[] arrayForSearch) {
        List<Integer> biggerNumbers = new ArrayList<>();
        int averageDigitInArray = findAverageDigit(arrayForSearch);
        for (int i = 0; i < arrayForSearch.length; i++) {
            if (findLenghtNumber(arrayForSearch[i]) > averageDigitInArray) {
                biggerNumbers.add(new Integer(arrayForSearch[i]));
            }
        }

        return biggerNumbers;
    }

    public static int findNumberDifferentDigit(int number) {
        int count = 0;
        Set<Integer> differentNumbers = new HashSet<>();
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            differentNumbers.add(digit);
        }
        return differentNumbers.size();

    }

    public static int findNumberWithMinimumDigit(int[] arrayForSearch) {
        int minimumDigitNumber = arrayForSearch[0];
        for (int i = 1; i < arrayForSearch.length; i++) {
            if (findNumberDifferentDigit(minimumDigitNumber) > findNumberDifferentDigit(arrayForSearch[i])) {
                minimumDigitNumber = arrayForSearch[i];
            }
        }
        return minimumDigitNumber;
    }

}




