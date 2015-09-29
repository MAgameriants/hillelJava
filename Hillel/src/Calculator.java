/**
 * Created by x230 on 29.09.2015.
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber;
        System.out.println("Enter the first number");
        Scanner in = new Scanner(System.in);
        firstNumber = in.nextInt();
        int secondNumber;
        System.out.println("Enter the second number");
        secondNumber = in.nextInt();
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
    }
}


/**
 * 1) ввести число
 * 2) ввести операцию
 * 3) ввести еще одно число
 * 4) результат
 */