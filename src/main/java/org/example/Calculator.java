package org.example;
/* Simple calculator */
public class Calculator {

    public static void main(String[] args)  {

        String input;
        String first ="";
        String second ="";
            boolean runUntil =true;
            int result;

       do {
            System.out.println("Choose your calculation");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Division");
            System.out.println("4: Multiplication");
            System.out.println("5: Close application");
            System.out.print(">:");
               input = Input.userInput();

               if (Input.checkIntNumber(input) == 0) {
                    System.out.println("Unknown selection, try again");

               } else if (Integer.parseInt(input) <= 4 ) {
                   System.out.print("Number 1: ");
                        first = Input.userInput();
                                Input.checkIntNumber(first);
                   System.out.print("Number 2: ");
                       second = Input.userInput();
                                Input.checkIntNumber(second);

               } else if (Integer.parseInt(input) == 5 ) {
                   System.out.println("Application terminated");
                   runUntil =false;
                }

               switch(input){

                   case "1" :
                       result = Calc.addition(Integer.parseInt(first), Integer.parseInt(second));
                       System.out.println("Result "+first+" + "+second+" = "+result);
                   break;
                   case "2" :
                       result = Calc.subtraction(Integer.parseInt(first), Integer.parseInt(second));
                       System.out.println("Result "+first+" - "+second+" = "+result);
                   break;
                   case "3" :
                       result = Calc.division(Integer.parseInt(first), Integer.parseInt(second));
                       System.out.println("Result "+first+" / "+second+" = "+result);
                   break;
                   case "4" :
                       result = Calc.multiplication(Integer.parseInt(first), Integer.parseInt(second));
                       System.out.println("Result "+first+" * "+second+" = "+result);
                   break;
                   default:
                       System.out.println("Unknown selection, try again");
               }
       }while (runUntil);
    }
}

