package org.example;

import java.util.Scanner;

public class Input {
   private static Scanner numObj = new Scanner(System.in);

    public static String userInput() {
        String numInput = numObj.nextLine();
        return numInput;
    }
  /*  public static NumberFormatException checkInt(String s) {
      int integer =0;
        try{
            integer = Integer.parseInt(Input.userInput());
        }catch (NumberFormatException e) {
            System.out.println(e);

        }
        return integer; */
    }

