package com.codewithmosh;

public class Account {
    private float balance;

    public void deposit(float amount) {
        if(amount > 0)
        this.balance = this.balance + amount;
        //too much repeated code here
        //balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }

    public void setBalance(float balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    /* This is how we hide the state of an object, encapsulation at work*/
    public float getBalance() {
        return balance;
    }
}
