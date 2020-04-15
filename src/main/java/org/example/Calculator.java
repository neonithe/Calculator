package org.example;

import java.util.Scanner;

/* Simple calculator */
public class Calculator {

    public static void main(String[] args) throws InterruptedException {
        Scanner numObj = new Scanner(System.in);
        String input;
        boolean runUntil =true;
        do {
            System.out.println("Choose your calculation");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Division");
            System.out.println("4: Multiplication");
            System.out.println("X: Close application");
            System.out.print(">:");
                input = numObj.nextLine();

            switch (input.toUpperCase()) {
                case "1":
                    Calc.calculation(Integer.parseInt(input));
                    Thread.sleep(800);
                    break;
                case "2":
                    Calc.calculation(Integer.parseInt(input));
                    Thread.sleep(800);
                    break;
                case "3":
                    Calc.calculation(Integer.parseInt(input));
                    Thread.sleep(800);
                    break;
                case "4":
                    Calc.calculation(Integer.parseInt(input));
                    Thread.sleep(800);
                    break;
                case "X":
                    System.out.println("Application terminated");
                    runUntil =false;
                    break;
                default:
                    System.out.println("Not recognized character, please try again:");
                    Thread.sleep(500);
            }
        }while (runUntil) ;
    }
}

