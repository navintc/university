
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Navin 5
 */
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        //creating one customer object
        LocalCustomer cust1 = new LocalCustomer();
        
        //temp variables
        String cusID;
        String cusType;
        
        System.out.println("Enter customer ID: ");
        cusID = scn.nextLine();
        
        System.out.println("Enter Customer Type: ");
        cusType = scn.nextLine();
        
        // running the localCustomer constructor
        cust1.LocalCustomer(cusID, cusType);
        
        //getting inputs and calculating the bill
        cust1.bilCal();
        
        //calculating the discounted bill
        cust1.discountCal();
        
        //display
        cust1.displayInfo();

    }
}
