package com.dashuk;

public class ParseCommandLine {
    public static String[] reverseCommandLineArguments(String[] commandLineArguments) {
        String[] commandLineArgumentsReverse = new String[commandLineArguments.length];
        for (int i = 0; i < commandLineArguments.length; i++) {
            commandLineArgumentsReverse[i] = commandLineArguments[commandLineArguments.length - i - 1];
        }
        return commandLineArgumentsReverse;
    }

    public static String findNameInCommandLineArguments(String[] commandLineArguments) {
        String userName = "";
        for (int i = 0; i < commandLineArguments.length; i++) {
            if (commandLineArguments[i].compareTo("/name") == 0) {
                try {
                    userName = commandLineArguments[i + 1];
                } catch (Exception ArrayIndexOutOfBoundsException) {
                    userName = "Zero";
                }
            }
        }
        return userName;
    }

    public static int countSummaFromCommandLine(String[] commandLineArguments) {
        int summa = 0;
        for (int i = 0; i < commandLineArguments.length; i++) {
            try {
                summa = summa + Integer.parseInt(commandLineArguments[i]);
            } catch (Exception NumberFormatException) {
                System.out.println("found text in command line");
            }
        }
        return summa;
    }
}
