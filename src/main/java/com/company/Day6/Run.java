package com.company.Day6;

import com.company.Day5.BankAccount;

public class Run {

    public static void main(String[] args) {
        // write your code here
        BankAccount bankAccount = new BankAccount("Andris", "Berzins", 700);

        System.out.println(bankAccount.getBalance());
    }
}
