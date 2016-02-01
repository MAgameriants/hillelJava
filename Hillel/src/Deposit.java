/**
 * Created by x230 on 04.10.2015.
 */

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {

        double amount;
        System.out.println("Enter initial amount of deposit");
        Scanner in = new Scanner(System.in);
        amount = in.nextDouble();
        int month = 1;
        int maxMonth;
        System.out.println("Enter maximum number of months");
        maxMonth = in.nextInt();
        for (int i = 1; i <= maxMonth; i++) {
            amount = amount * 1.03;
            System.out.println("Amount at the end of month " + i + " is " + amount);
        }

    }
}


/*
На депозит под 3% годовых положили K денег.
        Какой станет сумма вклада через N месяцев. Проценты начисляются на проценты
        Сколько лет понадобится, что сумма превысила M? */