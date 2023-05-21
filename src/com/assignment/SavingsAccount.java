package com.assignment;

public class SavingsAccount extends BankAccount {
    double minBalance;

    @Override
    public void withdraw(double withdrawalAmount) {
        if ((balance - withdrawalAmount ) < minBalance) {
            System.out.println("Low Balance Alert!Withdrawal denied");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Transaction Successful");
        }

    }

}