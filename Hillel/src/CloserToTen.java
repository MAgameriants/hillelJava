/**
 * Created by x230 on 28.09.2015.
 */

import java.util.Scanner;

public class CloserToTen {
    public static void main(String args[]) {
        int firstInt;
        System.out.println("Enter the first integer greater than 10");
        Scanner in = new Scanner(System.in);
        firstInt = in.nextInt();
        int difference1 = Math.abs(firstInt - 10);
        int secondInt;
        System.out.println("Enter the second integer greater than 10");
        secondInt = in.nextInt();
        int difference2 = Math.abs(secondInt - 10);

        if (difference1 < difference2) {
            System.out.println("First integer is closer to 10 than the second one.");
        } else if (difference1 == difference2) {
            System.out.println("Two integers are equally close to 10.");
        } else {
            System.out.println("Second integer is closer to 10 than the first one.");
        }
    }
}