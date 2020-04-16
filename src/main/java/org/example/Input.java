package org.example;

import java.util.Scanner;

public class Input {
    private static Scanner numObj = new Scanner(System.in);

    public static String userInput() {
        String numInput = numObj.nextLine();
        return numInput;

    }
    public static int checkIntNumber(String input) {
        int num = 0;
        boolean runUntil =true;
    while(runUntil){
        try {
             num = Integer.valueOf(input); runUntil = false;
        } catch (NumberFormatException e) {
            System.out.println(e);
            break;
        }
        }
        return num;
    }
}


