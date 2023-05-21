package com.basics;

public class SavingsAccount extends BankAccount{
    public float minimumBalance;
    public void withdraw(float withdrawAmount){
        if((balance- withdrawAmount)<minimumBalance){
            System.out.println("Low balance Alert! Withdrawal denied. Balance Amount:" + balance);
        }
        else {
            balance -= withdrawAmount;
            System.out.println("Transaction Successful.Balance Amount:" + balance);
        }
    }
}

