
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Navin 5
 */
public class LocalCustomer extends Customer {
    private double bill_amount;
    private double discounted_bill_ammount;
    
    public void LocalCustomer(){
        this.customer_id = "";
        this.customer_type = "";
        this.bill_amount = 0.0;
        this.discounted_bill_ammount = 0.0;
    }
    
    public void LocalCustomer(String customer_id, String customer_type){
        this.customer_id = customer_id;
        this.customer_type = customer_type;
    } 
    
    
    public void bilCal(){
        
        Scanner scn = new Scanner(System.in);
        
        // creating 2 product objects
        Product p1 = new Product();
        Product p2 = new Product();
        
        //getting inputs for product prices
        System.out.println("Enter the price of product 1: ");
        p1.setUnitPrice(scn.nextDouble());
        
        System.out.println("Enter the price of product 2: ");
        p2.setUnitPrice(scn.nextDouble());
        
        //calculating the bill amount
        this.bill_amount = p1.getUnitPrice() + p2.getUnitPrice();     
        
    }
    
    
    public void discountCal(){
        
        double discRate = 0.0;
        
        //Checking the type of the customer and setting the discount Rate
        switch (this.customer_type){
            case "A":
                discRate = 10;
                break;
            case "B":
                discRate = 15;
                break; 
        }
        
        //calculating the discounted bill
        this.discounted_bill_ammount = this.bill_amount - (this.bill_amount * discRate / 100);
        
    }
    
    public void displayInfo(){
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Customer ID: " + this.customer_id);
        System.out.println("Customer Type: " + this.customer_type);
        System.out.println("Bill Ammount: "+ this.bill_amount);
        System.out.println("Discounted Bill Ammount: " + this.discounted_bill_ammount);
        System.out.println("--------------------------------------------------------");
        
    }
}
