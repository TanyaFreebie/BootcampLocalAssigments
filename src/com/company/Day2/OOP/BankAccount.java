package com.company.Day2.OOP;

public class BankAccount {
    /*
    create a class "BankAccount" with property "balance" (should be decimal number)
    * create empty default constructor for it
    * create a constructor with parameter for setting balance.
    * create a method "deposit" with one parameter "amount" (decimal number)
        which allows user to increase the balance.
    * create a method "withdraw" with one parameter "amount"
        (decimal number) which allows user to decrease the balance.
    * create a method "printBalance" which displays the current balance to user
    * method for transfer balance from one bank account to another

2.1* update your solution:
        * Encapsulate the balance property so it is private
        * add validation to "withdraw" method, so it would be impossible to withdraw
          more money than exists in bank account. If there is an attempt to withdraw
          more money than exists in bank account, output message:
            "There is not enough funds."
        * Modify "transferFrom" method so it would be impossible to transfer more
          money from the other account than it's balance.
             For example, if bank account A has 50 units and bank account B has 25 units
             and we try to transfer 30 units from B to A, then it should output:
             "Transfer cancelled. You are trying to transfer 30 units, but only 25 are available."
        * add limit for depositing money. If the deposit is greater than 5000, then it should not
          do the deposit and output message:
              "Transaction cancelled. Max deposit - 5000 | Your deposit: 6000"
        * call these methods and demonstrate how they work, for example:
            * write a code which tries to withdraw more money than there is in bank account
            * write a code which tries to deposit more than max limit
            * write a code which tries to transfer more money from one account to another account
              than possible

     */
    private double balance;

    public BankAccount() {
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        if (amount > 5000) {
            System.out.println("Transaction cancelled. Max deposit - 5000 | Your deposit: 6000");
        } else {
            balance += amount;
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > 4000) {
            System.out.println("Transaction cancelled. Max withdraw - 4000| Your withdraw: " + amount
                    + "\n Please contact your bank assistant for conformation");
        } else if (balance - amount < 0) {
            System.out.println("There is not enough funds.");
        } else {
            balance -= amount;
        }
        return balance;
    }

    public void printBalance() {
        System.out.println("Account balance: " + balance);
    }

    public double transferTo(double amount) {

        balance += amount;

        return balance;
    }

    public double transferFrom(double amount) {
        if (amount > 4000) {
            System.out.println("Transaction cancelled. Your limit - 10000| Your transfer: " + amount
                    + "\n Please contact your bank assistant for conformation");
        } else if (balance - amount < 0) {
            System.out.println("Transfer canceled. There is not enough funds.");
        } else {
            balance -= amount;
        }
        return balance;
    }

}
