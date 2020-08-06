package org.xpdojo.bank;

public class Account {
    private int balance = 0;

    public int balance() {
        return balance;
    }

    public void deposit(int amount ){
        balance += amount;

    }

    public void withdraw(int amount) {
        throw new RuntimeException("Cannot withdrow");
    }

    public static Account emptyAccount() {
       return new Account();
    }
}

