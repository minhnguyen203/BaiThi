package BaiThi1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: $");
        double initialBalance = scanner.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double interestRate = scanner.nextDouble();

        Bank myBank = new Bank(initialBalance, interestRate);

        double monthlyInterest = myBank.calculateInterest();
        System.out.println("Monthly Interest: $" + monthlyInterest);

        scanner.close();
    }
}