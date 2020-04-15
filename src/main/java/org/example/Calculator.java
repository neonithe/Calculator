package org.example;

import java.util.Scanner;

/* Simple calculator */
public class Calculator {

    public static void main(String[] args) {
        Scanner numObj = new Scanner(System.in);
  /*      Scanner numObj = new Scanner(System.in);
        System.out.print("Enter number:");
        String num = numObj.nextLine();

        try {
            int integer = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }


    }
}*/

        int input = 0;

     //   do {
            System.out.println("Choose your calculation");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Division");
            System.out.println("4: Multiplication");
            System.out.println("5: Close application");
            input = numObj.nextInt();
            Calc.addition(input);
    }
}
   /*     input = Integer.parseInt(Input.userInput());


    try{
        int integer = Integer.parseInt(String.valueOf(input));
    }catch (NumberFormatException e) {
        System.out.println(e);
    }

    switch(input) {
        case 1:
            Calc.addition();
            break;
        case 2:
            System.out.println("2");
            break;
        case 3:
            System.out.println("3");
            break;
        case 4:
            System.out.println("4");
            break;
        case 5:
            System.out.println("Application terminated");
            break;
        default:
            System.out.println("Invalid input, try again");


    }
        }while (input != 5);
    }
}
*/

        /*

        int input;                                                                   //Choice input from list
        int num1;                                                                    //First number to calc
        int num2;                                                                    //Second number to calc
        int result;                                                                  //The calculation result

        do {                                                                                //do until choice 5 is selected
            Scanner numObj = new Scanner(System.in);

            System.out.println("Choose your calculation");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Division");
            System.out.println("4: Multiplication");
            System.out.println("5: Close application");
            input = numObj.nextInt();                                               //Read line (read selection)
            //        Character.isLetter(string.charAt(index))
            switch (input) {                                                            //Do selection 1 - 5
                case 1:
                    System.out.println("Addition: Submit two numbers:");
                    num1 = numObj.nextInt();                                     //Read first number
                    num2 = numObj.nextInt();                                     //Read second number
                    result = num1 + num2;                                           //Calculate the submitted numbers
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);      //Print the calculation and submitted numbers
                    Thread.sleep(1000);                                       //Pause the application, before next menu selection
                    break;
            /*case 2:
                System.out.println("Subtraction: Submit two numbers:");
                    num1 = numObj.nextDouble();
                    num2 = numObj.nextDouble();
                    result = num1 - num2;
                System.out.println("Result: "+num1+" - "+num2+" = " + result);
                    Thread.sleep(1000);
            break;
            case 3:
                System.out.println("Division: Submit two numbers:");
                    num1 = numObj.nextDouble();
                    num2 = numObj.nextDouble();
                    result = num1 / num2;
                System.out.println("Result: "+num1+" / "+num2+" = " + result);
                    Thread.sleep(1000);
            break;
            case 4:
                System.out.println("Multiplication: Submit two numbers:");
                    num1 = numObj.nextDouble();
                    num2 = numObj.nextDouble();
                    result = num1 * num2;
                System.out.println("Result: "+num1+" * "+num2+" = " + result);
                    Thread.sleep(1000);
            break;
                case 5:
                    System.out.println("Application terminated");
                    break;

                default:
                    System.out.println("Not valid choice, please select another number"); //Show if not a valid choice have been made
                    Thread.sleep(1000);
            }
        } while (input != 5);                                                          //Do, run until 5 is selected
    }
}
    }
}   */
