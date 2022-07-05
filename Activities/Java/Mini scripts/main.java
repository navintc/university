package com.mycompany.secondoop;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Employee[] empArray=new Employee[5];//Object Array
for(int i=0;i<5;i++){
empArray[i]=new Employee();
System.out.println("Enter Employee Name: ");
empArray[i].setName(sc.next());
System.out.println("Enter Employee Id: ");
empArray[i].setId(sc.next());
System.out.println("Enter Employee Designation: ");
empArray[i].setDesignation(sc.next());
System.out.println("Enter Employee City: ");
empArray[i].setCity(sc.next());
System.out.println("Enter Employee Basic Salary: ");
empArray[i].setBasic_salary(sc.nextDouble());
System.out.println("Enter Employee OT Hours: ");
empArray[i].setOt_hours(sc.nextDouble());

empArray[i].calculateSalary();
}

double max_salary=0;
Employee max_emp=empArray[0];
for(int i=0;i<5;i++){
if(max_salary<empArray[i].getFinalSalary()){
max_emp=empArray[i];
max_salary=empArray[i].getFinalSalary();
}
}
System.out.println("========Employee with Maximum Salary=======");
max_emp.diplay();

}
}