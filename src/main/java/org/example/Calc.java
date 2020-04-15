package org.example;

public class Calc {

    public static void calculation(int input) {

        int first;
        int second;
        int result;

            System.out.print("Number 1: ");
                first = Input.checkIntNumber();
            System.out.print("Number 2: ");
                second = Input.checkIntNumber();
            switch (input) {
                case 1:
                    result = first + second;
                    System.out.println("Result : " + first + " + " + second + " = " + result);
                    break;
                case 2:
                    result = first - second;
                    System.out.println("Result : " + first + " - " + second + " = " + result);
                    break;
                case 3:
                    result = first / second;
                    System.out.println("Result : " + first + " / " + second + " = " + result);
                    break;
                case 4:
                    result = first * second;
                    System.out.println("Result : " + first + " * " + second + " = " + result);
                    break;
            }
    }
}





