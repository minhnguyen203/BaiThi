package BaiThi1;

public class Bank {
    private double balance;
    private double annualInterestRate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.annualInterestRate = rate;
    }

    public double calculateInterest() {

        double interest = balance * (annualInterestRate / 1200);
        return interest;
    }
}