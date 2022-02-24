// Q1
// a) -------------------

//Telco.java-

public class telco {
    String accNumber;
    int callDuration;
    double unitCharge;
    double monthlyBill;
    
    public telco(){
        this.accNumber = "";
        this.callDuration = 0;
        this.unitCharge = 0.0;
        this.monthlyBill = 0.0;  
    }
    
    public telco(String accNumber, int callDuration, double unitCharge){
        this.accNumber = accNumber;
        this.callDuration = callDuration;
        this.monthlyBill = 0;
        this.unitCharge = unitCharge;
    }
    
    public void calculateBill(){
        this.monthlyBill = this.unitCharge * this.callDuration;
    }
    
    public void displayBill(){
        System.out.println("Account number: " + this.accNumber);
        System.out.println("Bill: " + this.monthlyBill);
    }
       
}

// Main.java
public class main {
    public static void main(String[] args){
        telco obj1 = new telco("fucer", 1000, 0.5);
        telco obj2 = new telco("bich lasanya", 1000, 0.5);
        
        obj1.calculateBill();
        obj1.displayBill();
    }  
}


// b) --------------------

// item.java
public interface item {
    final static int item_price= 100;
}

// order.java
import java.util.Scanner;

public class order implements item {
    int quantity_bought;
    int total;
    
    public order(){
        System.out.println("Enter quantity: ");
        Scanner scn = new Scanner(System.in);
        quantity_bought = scn.nextInt();
    }
    
    public void findBillAmount(){
        total = quantity_bought * item_price;
        System.out.println(total);
    }
}

//c)-------------------
package office;

public class employee {
    int age;
    String employee;
    
    public void displayData(){
        System.out.println(employee + ", " + age);
    }
}



// Q2 -------------------------------------------------------------------------------------------

/*a) ---------

i. 
Division by zero error
Out of range error
Division by zero errors

ii.
`Try` section is used to declear algorithms that should be tried of doing and
if that section fails due to an exception, the `catch` section will be
excecuted. The `Finally` section is decleared to clean up the code. This 
section will be executed after excetuting the `try` section or `catch` section.

iii.
Checked exceptions are added in to try catches to check for expections
during the compile time. 

Unchecked exceptions will be checked during the run-time of the program.
These execptions are a sub class of runtime-exceptions.

iv.
This keyword is used to indicate the exceptions that came up during the
compile-time or the run-time of a program.

v.
The variable may not have initiated or the value of the variable may be 
null. Therefore, it is not possible to calculate the lenght of the string.

try{
    String name;
    int lenght = name.lenght();
}
catch(NullPointerException e){
    System.out.println("Value is NULL!" + e.toString());
}


*/


// Q3--------------------------------------------------------------------------------------------
// a)s