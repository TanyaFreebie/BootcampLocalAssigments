package com.company;


import com.company.Day5.BankAccount;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccount bankAccount = new BankAccount("Andris", "Berzins", 700);
        double balance = bankAccount.currencyDeposit(200, 0.84);
        System.out.println(bankAccount.getBalance());
    }
}
