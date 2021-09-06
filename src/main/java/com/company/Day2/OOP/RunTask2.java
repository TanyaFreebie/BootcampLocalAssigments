package com.company.Day2.OOP;

public class RunTask2 {
    public static void main(String[] args) {
        BankAccount andris = new BankAccount();
        BankAccount maris = new BankAccount();

        andris.setBalance(7000);
        maris.setBalance(700);
        andris.printBalance();
        andris.withdraw(5000);
        andris.deposit(4000);
        andris.printBalance();
        System.out.println("**Transfer**");
        andris.transferTo(maris.transferFrom(1000));



    }
}
