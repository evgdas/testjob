package com.dashuk;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class App {


    public static void main(String[] argumentsCommandLine) {
        System.out.println("Enter jon number, from 1-9: ");
        Scanner inputJobNumber = new Scanner(System.in);
        int jobNumber = inputJobNumber.nextInt();

        switch (jobNumber) {
            case 1:
//1.     Приветствовать любого пользователя при вводе его имени через командную строку.
                System.out.println("Hello, mister " + ParseCommandLine.findNameInCommandLineArguments(argumentsCommandLine) + ".");
                break;
            case 2:
//2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
                System.out.println("Reverse command line arguments " + Arrays.toString(ParseCommandLine.reverseCommandLineArguments(argumentsCommandLine)));
                break;
//3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
            case 3:
                RandomDigitOutput.outToConsole(true);
                RandomDigitOutput.outToConsole(false);
                break;
            case 4:
//4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
                System.out.println("Summa all arguments command line = " + ParseCommandLine.countSummaFromCommandLine(argumentsCommandLine));
                break;
            case 5:
                //5.   Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
                System.out.println("Month name is " + MonthName.getMonthName(MonthName.getNumber()));
                break;
            case 6:
//Дополнительные задачи
// 1-6.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
                int[] randomArrayNumbers = FoundNumbers.generateRandomArrayNumbers(10);

                int lenghtNumberInMininmum = FoundNumbers.findLenghtNumber(FoundNumbers.findMinimumNumberInArray(randomArrayNumbers));
                int lenghtNumberInMaximum = FoundNumbers.findLenghtNumber(FoundNumbers.findMaximumNumberInArray(randomArrayNumbers));
                System.out.println(Arrays.toString(randomArrayNumbers));
                System.out.println("Minimum number is " + FoundNumbers.findMinimumNumberInArray(randomArrayNumbers) + "and lenght is " + lenghtNumberInMininmum);
                System.out.println("Maximum number is " + FoundNumbers.findMaximumNumberInArray(randomArrayNumbers) + "and lenght is " + lenghtNumberInMaximum);
                System.out.println();
                break;
            case 7:
//1-7.     Вывести числа в порядке возрастания (убывания) значений их длины.
                int[] testArray = {1, 222, 333, 444, 555};
                out.println(Arrays.toString(FoundNumbers.sortArrayByBigLenght(testArray)));
                break;
            case 8:
                //1-8.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
                int[] testArrayNumber = {1, 222, 888, 9999999, 88888888};
                for (Integer i : FoundNumbers.findNumbersWithMoreDigitAverageDigit(testArrayNumber)) {
                    System.out.println("Number = " + i + " count = " + FoundNumbers.findLenghtNumber(i));
                }
                break;
            case 9:
//1-9.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
//найти количество разных цифр в числе
                int[] arrayForFindMininmumDigitNumber = {221, 2322, 333, 444, 555, 1234,1};
                System.out.println(FoundNumbers.findNumberWithMinimumDigit(arrayForFindMininmumDigitNumber));
                break;
            default:
                out.println("programm terminate without any work. Enter number from 1-9.");
        }
    //Task Class    
        List<Student> students= new ArrayList<> ();
        students.add(new Student(
                1,
                "Ivanov",
                "Ivan",
                "Ivanovich",
                "1900.01.01",
                "Moscow",
                "IT",
                "1",
                "1",
                "1"));
        students.add(new Student(
                2,
                "Petrov",
                "Petr",
                "Petrovich",
                "2000.02.02",
                "Peterburg",
                "Accounter",
                "2",
                "2",
                "2"));
        students.add(new Student(
                3,
                "Smirnov",
                "Smir",
                "Petrovich",
                "3000.03.03",
                "Tallin",
                "Stroy",
                "3",
                "3",
                "3"));

        Student.getStudentOfFacultet(students,"1").forEach(s-> System.out.println(s));
        Student.getStudentOfKurs(students,"2").forEach(s-> System.out.println(s));
        Student.getStudentOfFacultetAndKurs(students,"3","3").forEach(s-> System.out.println(s));
        Student.getStudentsOlderDate(students,"2000.01.01").forEach(s-> System.out.println(s));

//task linkedlist
        LinkedList<String> datafromFile = new LinkedList<>(WorkWithFile.readDataFile("D:\\Project_java\\github-automation-master\\github-automation-master\\java\\students\\java\\text"));
        WorkWithFile.writeDataFile("D:\\Project_java\\github-automation-master\\github-automation-master\\java\\students\\java\\text",
                datafromFile);
    }
}



