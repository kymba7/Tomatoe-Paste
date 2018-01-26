package com.company;

public class Checking extends BankAcct {
    public Checking ( double balance ) {
        super(balance);
        this.withdrawal();
        this.balance=balance;
        this.overdraftFee = overdraftFee;


    }
    @Override
    public void withdrawal(withdrawal<this.balance){
        System.out.println("You don't have enough funds and have been charged an overdraft fee of " + overdraftFee);


    }
}
