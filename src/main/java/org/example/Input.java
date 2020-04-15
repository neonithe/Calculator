package org.example;

import java.util.Scanner;

public class Input {
    private static Scanner numObj = new Scanner(System.in);

    public static String userInput() {
        String numInput = numObj.nextLine();
        return numInput;

    }
    public static int checkIntNumber() {
        int num = 0;
        boolean until =true;
    while(until){
        try {
            String input = userInput();
             num = Integer.valueOf(input); until = false;
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.out.print("Enter number: ");
        }
        }
        return num;
    }
}


