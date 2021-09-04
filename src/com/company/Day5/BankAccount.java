package com.company.Day5;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;
    private double savingFund;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;

    }

    public double deposit(double amount) {

        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;

    }

    public double getBalance() {
        return balance;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double currencyWithdraw(double amountD, double currency) {
        balance -= amountD * currency;
        return balance;
    }

    public double currencyDeposit(double amountD, double currency) {
        balance += amountD * currency;
        return balance;
    }

    public double savingFound(double amount, int years, double rate) {
        rate = rate * 0.01;
        balance -= amount;
        for (int i = 0; i < years; i++) {
            amount = (amount * rate) + amount;
        }

        balance += amount;
        return balance;
    }

}

