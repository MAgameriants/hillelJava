import java.util.Scanner;

/**
 * Created by x230 on 01.10.2015.
 */
public class Loops {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            System.out.println("for loop " + i);
        }

    }

    private static void doWhileExample() {
        Scanner scanner = new Scanner(System.in);
        String yesNo;
        do {
            System.out.println("yes/no");
            yesNo = scanner.next();
        } while (!(yesNo.equals("yes") || yesNo.equals("no")));
    }

    private static void whileExamples() {
        int counter = 0;
        while (counter < 10) {
            counter++;
            System.out.println("while loop " + counter);
        }

        int money = 1000;
        int months = 0;

        while (money < 1500) {
            money += 100;
                    months++;
            System.out.println("money: " + money + "months: " + months);
        }
    }
}
