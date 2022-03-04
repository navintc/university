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


// b)

import java.util.Scanner;

public class stringChars extends Thread {
    String name;
    
    public void set_Name(String name){
        this.name = name;
    }
    
    public void run(){
        System.out.println("Enter name: ");
        Scanner scn = new Scanner(System.in);
        
        this.name = scn.nextLine();
        
        for(int i=0; i< name.length(); i++){
            System.out.println(name.charAt(i));
        }   
    }
}

public class main{
    public static void main(String[] args){
        stringChars obj2 = new stringChars();
        obj2.start();
    }  
}


// Q3 -----------------------------------------------------------------------
// a)

import java.awt.*;
import javax.swing.*;
public class taxFinder extends JFrame{
    public taxFinder(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//make the app exit when X is pressed 
        //otherwise terminal stays open because JAVA ¯\_(ツ)_/¯
        setSize(300, 200);
        setTitle("Tax Finder");
        
        JPanel panel1 = new JPanel();
        getContentPane().add(panel1);

        JLabel lb1 = new JLabel("Payment Account");
        panel1.add(lb1);
        
        JTextField txtAcc = new JTextField(10);
        panel1.add(txtAcc);
        
        JLabel lb2 = new JLabel("Tax Rate");
        panel1.add(lb2);
        
        JTextField txtTax = new JTextField(10);
        panel1.add(txtTax);
        
        JButton calc = new JButton("Calculate");
        panel1.add(calc);
        
        taxFinder c = new taxFinder();
        calc.addActionListener(c);

    } 
    public void actionPerformed(ActionEvent e){
        double output = 0;
        double pay_amt = Double.parseDouble(txtAcc.getText());
        double tax_rate = Double.parseDouble(txtTax.getText());
        
        output = pay_amt * tax_rate;
        
        JOptionPane.showMessageDialog(rootPane, "Your tax amount is " +output);
           
    }
}


// b)

// 1)
String str1 = "Software development";
// 2)
str1.replace("d","D");
// 3)
System.out.println(str.lenght());

// c)


import java.io.*;

class fileRead{
    public static void main(String[] args){
        File infile = new File("file.txt");
        FileReader ins = new FileReader(infile);
        while ((ch = ins.read())! = -1){
            System.out.println((byte)ch);
        }
        ins.close();

        //-----------------writing:

        String k = "Helleuw";
        File outfile = new File("file.txt");
        FileWriter outs = new FileWriter(outfile);
        outs.write(k);
        outs.close();
        
    }
}



// 0---> writing



// Q4------------------------------------------------------------------------------

// a)


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBQuestion {
    public static void main(String[] args){
        try {
            //Creating a connection
            Class.forName("com.mysql.jdbc.driver");
            String db_url="jdbc:mysql://localhost/NIBM";
            Connection con=DriverManager.getConnection(db_url,"root","");
            //Insert Statement


            Scanner scn=new Scanner(System.in);
            System.out.println("Enter ID: ");
            String id=scn.next();
            System.out.println("Enter Name: ");
            String name=scn.next();


            Statement st=con.createStatement();
            st.executeUpdate("insert into employee(employee_id,employee_name) "
                    + "values('"+id+"','"+name+"')");


            //Reading from database
            Statement read_st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from employees");
            while(rs.next()){
                id=rs.getString("employee_id");
                name=rs.getString("employee_name");
                System.out.println("Id: "+id+" Name: "+name);
            }
        } catch (Exception ex) {
            System.out.println("Something went wrong..");
        }
        
    }
}