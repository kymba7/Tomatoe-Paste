package com.company;

public class BankAcct {
    public double balance;
    public double deposit;
    public double overdraftFee = 35;
    public boolean withdrawal;


    public BankAcct (double balance) {
        this.balance = balance;
        this.overdraftFee=overdraftFee;
    }
    public double deposit(double amount){
        this.balance += amount;
        System.out.println("Your deposit of $" + amount + "gives you a new balance of $" + this.balance);
        return amount;
    }
    public double withdrawal (double amount){
        this.balance -= amount;
        System.out.println("Your withdrawal of $" + amount + "gives you a new balance of $" + this.balance);
        return amount;
        amount>this.balance
    }

}
