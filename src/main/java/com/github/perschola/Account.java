package com.github.perschola;

public class Account {
    private double balance;
    public Account(){
        this.balance = 50;
    }

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdrawal(double amount){
        setBalance(getBalance()-amount);
    }

}
