package com.javafse;

public class BankAccount {

    /*
        Bank Account class
    */
    private double balance;

    /*
        @param initBalance
        Constructor to intialize Bank Account with some initial balance.
    */
    public BankAccount(double initBalance) {
        this.balance = initBalance;
    }

    /*
        @param amount
        Function to deposit some balance to Bank Accont
    */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /*
        @param amount
        Function to withdraw some balance from Bank Account
    */
    public boolean withdraw(double amount) {
        if(amount < 0 || amount > this.balance) return false;
        this.balance -= amount;
        return true;
    }


    /*
        Function to get current Bank Account balance
    */
    public double getBalance() { return this.balance; }
}
