package com.bridgelabz.junittesting;

public class BankAccount {
    double balance;

    public double deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return -1;
        }
        else {
            balance += amount;
            System.out.println("Deposit successfull. Updated balance "+balance);
            return balance;
        }
    }

    public double withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient Funds");
            return -1;
        }
        else{
            balance -= amount;
            System.out.println("Withdraw Successfull. Updated balance "+balance);
            return balance;
        }
    }

    public double getBalance(){
        System.out.println("Balance in account is "+balance);
        return balance;
    }
}
