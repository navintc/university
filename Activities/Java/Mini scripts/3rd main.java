package com.nibm202.thirdoop;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        BankAccount account=new BankAccount();
        int option=0;
        do{
            System.out.println("Please select an operation from the following");
            System.out.println("1.Check Balance\n2.Withdraw\n3.Deposit\n4.Calculate Interest\n0.Exit");
            option=scn.nextInt();
            switch(option){
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    account.withdrawMoney();
                    break;
                case 3:
                    account.depositMoney();
                    break;
                case 4:
                    account.claculateInterest(0.08);
                    break;
                default:
                    System.out.println("Invalid Input...");
                    break;
            }
        }while(option>0);
    }
}