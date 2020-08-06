package org.xpdojo.bank;

public class Account {
    private int balance = 0;

    public int balance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;

    }

    public int withdraw(int amount) {
        if (amount > balance) {
            throw new RuntimeException("Cannot withdraw. The amount is gt than balance.");
        }else{
             return balance - amount;
        }
    }

    public static Account emptyAccount() {
        return new Account();
    }
}

