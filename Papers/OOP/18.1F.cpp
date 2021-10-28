// 1
    // a
        // i 
        // Encapsulation is the process of combining data member and functions
        // in to an one unit. 

        // ii
        // Polymorphism describes the ability to have many forms. For example,
        // diffrent objects can be made out of a single class.

    // b
    #include <iostream>
    using namespace std;

    class bills{
        public:

            int billNum = 0, unitsConsum = 0;
            float rental = 0.0, cpu = 0.0, finBil = 0.0;
            
            bills(){
                cout<<"Enter Bill number";
                cin>>billNum;
                cout<<"Enter units consumed";
                cin>>unitsConsum;
                cout<<"Enter monthly rental";
                cin>>rental;
                cout<<"Enter Charge per unit";
                cin>>cpu;
            }

            ~bills(){};

            void calculator(){
                finBil = (unitsConsum * cpu) + rental;
            }

            void displayBill(){
                cout<<"Bill Number: "<<billNum;
                cout<<"Final Bill amount: "<<finBil;
            }

    };


    int main(){
        bills ob1;
        obj1.calculator();
        obj1.displayBill();
        return 0;
    }



// 2

    // a
    // In a class functions can be used over and over again as of objects.
    // But when there are certain lines which only has to be executed in the
    // creation of an objct, contructors are used.  Constructors can be removed
    // from the memory with a destructor saving memory for other members.

    // b


    #include <iostream>
    using namespace std;

    class Student{

        public:
            string stName, stNum;

            Student(){
                cout<<"Enter student Name";
                cin>>stName;
                cout<<"Enter student name";
                cin>>stNum;
            }

            ~Student(){};
    }

    int main(){
        Student obj1; 
    }




// 3
    // a
    // Inheritance allows to create classes with previously stated classes by
    // extending their functionality. (AKA, reusability).
    // This reduces the need of writing the same commands for different classes 
    // causing minimal storage usage.

    // b


    #include <iostream>
    using namespace std;

    class vehicle{

        public:
            string vehiNum;
            float price = 0.0;

    };

    class heavyVehicle: public vehicle{
        public:
            float discoRate = 0.0, discoAmm = 0.0, finalPrice = 0.0;

            void inputData(){
                cout<< "Input vehicle Number";
                cin >> vehiNum;
                cout<< "Input price"
                cin >> price;
                cout << "Input discount Rate";
                cin>> discoRate;
            }

            void dicoAmmountFind (){
                discoAmm = price * discoRate / 100;
            }

            void displayFin (){
                finalPrice = price - discoAmm;
                cout << "Final Price: "<< finalPrice;
                cout << "Final Price: "<< (price-discoAmm);
            }

    };

    int main (){
        heavyVehicle ob1;
        ob1.inputData();
        ob1.dicoAmmountFind();
        ob1.displayFin();

        return 0;
    }



// 4
    // a
    // Function overloading is the technique of using funcctions of the same 
    // name for serval times with different parameters. This is an example of 
    // polymorphism since it acts as a one entity that has many shapes and uses.

    // b

    #include <iostream>
    using namespace std;

    class product {
        public:
            float price = 0.0, totalValue = 0.0;
            int quantity = 0;

            void inputPro(){
                cout << "Input Price";
                cin >> price;
                cout << "Input quantity";
                cin >> quantity;
            }

            void calculate (){
                totalValue = price * quantity;
            }
    };

    class electronic_product: public product {
        public:
            float taxValue = 0.0, taxRate = 0.0;

            void inputElec(){
                cout << "Input tax Rate";
                cin >> taxRate;
            }

            void calculate(){
                taxValue = taxRate * price;
                cout << taxValue;
            }      
    };


    int main() {

        electronic_product obj1;
        obj1.inputPro();
        obj1.inputElec();
        //obj1.product::calculate();
        obj1.calculate();
        return 0;
    }


// 5
    // a
        // i 


    // b

    #include <iostream>
    #include <ifstream>
    #include <iostream>

    using namespace std;

    class Employee {

        public:
            string name, number, tmpLine;

            void WriteEmployee (){

                ofstream empOut("employee.txt");
                
                cout<< "enter employee name";
                cin >> name;
                cout<< "enter employee number";
                cin >> number;

                empOut << name << " "<<number;

                empOut.close();

            }


            void readEmployee(){

                ifstream empIn("employee.txt");

                while (getline(empIn, tmpLine)) {
                    cout << tmpLine;
                }
            }

    };

    int main(){
        Employee obj1;
        Employee obj2;
        obj1.WriteEmployee();
        obj2.WriteEmployee();
        obj2.readEmployee();
        return 0;
        
        
    }
