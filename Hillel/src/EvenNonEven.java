/**
 * Created by x230 on 28.09.2015.
 */

import java.util.Scanner;

public class EvenNonEven {
    public static void main(String args[]) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer to check if it is odd or even ");
        number = in.nextInt();

        if (number % 2 == 0)
            System.out.println("You entered an even number.");
        else
            System.out.println("You entered an odd number.");
    }
}
