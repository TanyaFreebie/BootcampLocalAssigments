package com.company.Day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {

    @Test
    void deposit() {
        //deposit
        BankAccount bankAccount = new BankAccount("Andris", "Berzins", 700);
        double balance = bankAccount.deposit(250);
        assertEquals(950, balance);
    }

    @Test
    void withdraw() {
        BankAccount bankAccount = new BankAccount("Andris", "Berzins", 700);
        double balance = bankAccount.withdraw(250);
        assertEquals(450, balance);
    }

    @Test
    void getFullName(){
        BankAccount bankAccount = new BankAccount("Andris", "Berzins", 700);
        String fullName = bankAccount.getFullName();
        assertEquals("Janis Berzins", fullName);
    }
    @Test
    void withdrawDollars(){
        BankAccount bankAccount = new BankAccount("Andris", "Berzins", 700);
        double balance = bankAccount.currencyWithdraw(200, 0.84);
        assertEquals(532, balance, 0.50);
    }

    @Test
    void depositDollars(){
        BankAccount bankAccount = new BankAccount("Andris", "Berzins", 700);
        double balance = bankAccount.currencyDeposit(200, 1.14);
        assertEquals(928, balance, 0.01);
    }

@Test
    void savingFounds(){
    BankAccount bankAccount = new BankAccount("Andris", "Berzins", 700);
    double balance = bankAccount.savingFound(100, 5, 4);//104.16
    assertEquals(721.66, balance, 0.01);

}
}