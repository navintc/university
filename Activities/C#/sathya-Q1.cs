public class employee{

string name = "John";
byte age = 23;
int salary = 999999999;
byte otHours = 5;
string desig ="Lecturer";

void calculateSalary (int basic){

otHours = basic;
if (desig=="Lecturer"){
salary = 80000+(otHours * 2000);
} else {
salary = 50000+(otHours*500);
}

}

}