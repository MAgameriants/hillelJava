/**
 * Created by x230 on 29.09.2015.
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double firstNumber;
        System.out.println("Enter the first number");
        Scanner in = new Scanner(System.in);
        firstNumber = in.nextDouble();
        double secondNumber;
        System.out.println("Enter the second number");
        secondNumber = in.nextDouble();
        String operation;
        System.out.println("Enter operation");
        operation = in.next();
        switch (operation) {
            case "+":
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            case "/":
                System.out.println("Result: " + (firstNumber / secondNumber));
                break;
        }

        double thirdNumber;
        System.out.println("Enter third number");
        thirdNumber = in.nextDouble();
        String operation2;
        System.out.println("Enter operation with the double");
        operation2 = in.next();

       switch (operation2) {
            case "trunk":
                double d1;
                d1 = Math.floor(thirdNumber);
                int d2 = (int) d1;
                System.out.println("Result: " + d2);
                break;
            case "fract":
                d1 = Math.floor(thirdNumber);
                System.out.println("Result: " + (thirdNumber - d1));
                break;
        }
    }
}


/**
 * byte, short, int, long или double
 * 1) ввести число
 * 2) ввести операцию
 * 3) ввести еще одно число
 * 4) результат
 */