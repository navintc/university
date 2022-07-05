package com.nibm202.thirdoop;

import java.util.Scanner;

/*
Create a java application to manage a bank account. Bank account will have a
customer name,account number,account type and account balance. Include necessary
methods to perform account creation,deposit money,withdraw money,check balance,
and calculate interest.
deposit money will be done in two methods.
1.By accepting user inputs
2.By passing the deposit amount in to method as an argument
withdraw money will be done in two methods.
1.By accepting user inputs
2.By passing the withdraw amount in to method as an argument
*/
public class BankAccount {

    private String customer_name;
    private String account_number;
    private String account_type;
    private double account_balance;

    public void setName(String name){
        this.customer_name=name;
    }
    
    public String getName(){
        return this.customer_name;
    }

    public void setNumber(String number){
        this.account_number=number;
    }
    public String getNumber(){
        return this.account_number;
    }

    public void setType(String type){
        this.account_type=type;
    }

    public String getType(){
        return this.account_type;
    }

    public void setBalance(double balance){
        this.account_balance=balance;
    }

    public double getBalance(){
        return this.account_balance;
    }

    public BankAccount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        this.customer_name=sc.next();
        System.out.println("Enter Account Number:");
        this.account_number=sc.next();
        System.out.println("Enter Account Type:");
        this.account_type=sc.next();
        System.out.println("Enter Open Balance:");
        this.account_balance=sc.nextDouble();
    }
    
    public void depositMoney(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Deposit Amount:");
        double deposit_amount=sc.nextDouble();
        this.account_balance=this.account_balance+deposit_amount;
    }

    public void depositMoney(double deposit_amount){
        this.account_balance=this.account_balance+deposit_amount;
    }

    public void withdrawMoney(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Withdraw amount:");
        double withdraw_amount=sc.nextDouble();
        this.account_balance=this.account_balance-withdraw_amount;
    }

    public void withdrawMoney(double withdraw_amount){
        this.account_balance=this.account_balance-withdraw_amount;
    }

    public void claculateInterest(double interst_rate){
        double interest_amount=this.account_balance*interst_rate;
        this.account_balance=this.account_balance+interest_amount;
    }

    public void checkBalance(){
        System.out.println("Account Balance: "+this.account_balance);
    }

}