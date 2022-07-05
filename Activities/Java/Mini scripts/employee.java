package com.mycompany.secondoop;

/**
* Create a java application to store employee name, id, city, designation,
* basic salary and OT hours.
* Include a method to calculate final salary depending on the designation
* and ot hours as follows:
* If designation "Software Developer" ot rate= 0.5
* If designation "Software Engineer" ot rate= 0.7
* If designation "Project Manager" ot rate= 0.8
* If any other designation ot rate=0.3
*
* Salary=basic_salary+(ot rate*ot hours)
*
* Include a method to calculate the final salary if the ot rate is passed as
* an argument
*
* Store details for 5 employees and find the employee with the maximum salary.
*/
public class Employee {

private String name;
private String id;
private String city;
private String designation;
private double basic_salary;
private double ot_hours;
private double final_salary;

/**default constructor.
*/
public Employee(){
this.name="";
this.id="";
this.designation="";
this.city="Kandy";
this.basic_salary=10000.00;
this.ot_hours=0.00;
this.final_salary=10000.00;
//this("","","","Kandy",10000.00,0.00);
}
public Employee(String name,String id,String designation,String city,double basic_salary,double ot_hours){
this.name=name;
this.id=id;
this.designation=designation;
this.city=city;
this.basic_salary=basic_salary;
this.ot_hours=ot_hours;
this.final_salary=0.00;
}
/**Encapsulate Fields
* @param name
*/
public void setName(String name){
this.name=name;
}
public String getName(){
return this.name;
}
public void setId(String id){
this.id=id;
}
public String getId(){
return this.id;
}
public void setCity(String city){
this.city=city;
}
public String getCity(){
return this.city;
}
public double getBasic_salary() {
return basic_salary;
}
public void setBasic_salary(double basic_salary) {
this.basic_salary = basic_salary;
}
public double getOt_hours() {
return ot_hours;
}
public void setOt_hours(double ot_hours) {
this.ot_hours = ot_hours;
}
public String getDesignation() {
return designation;
}
public void setDesignation(String designation) {
this.designation = designation;
}
public double getFinalSalary(){
return this.final_salary;
}

public void calculateSalary(){
double ot_rate;
switch(this.designation){
case "Software Developer":
ot_rate=0.5;
break;
case "Software Engineer":
ot_rate=0.7;
break;
case "Project Manager":
ot_rate=0.8;
break;
default:
ot_rate=0.3;
break;
}
this.final_salary=this.basic_salary+(this.ot_hours*ot_rate);
}
public void calculateSalary(double ot_rate){
this.final_salary=this.basic_salary+(this.ot_hours*ot_rate);
}
public void diplay(){
System.out.println("Employee Name: "+this.name);
System.out.println("Employee Id: "+this.id);
System.out.println("Employee Designation: "+this.designation);
System.out.println("Employee City: "+this.city);
System.out.println("Employee Basic Salary: "+this.basic_salary);
System.out.println("Employee Final Salary: "+this.final_salary);
}

}