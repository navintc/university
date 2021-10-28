// 1
    // a
        // Public members of a class can be used by any entity in OOP program. 
        // There widely used for declaring members that must be used with different
        // classes that does not needs to be protected from external users.

        // Members will be named as private when they needs to secured from other
        // users. These members are only accesible within their own class and cannot 
        // be used by sibling and child classes

    // b







// 3
    // a
    //     i 
    //     Function Overloading is the process of using functions of a same name
    //     to diffrent kinds of results. This is usually achived by using diffrent
    //     parameters. This technique is an example for Polymorphism.

    //     ii
    //     By doing operator overloading, developers can use nearly all the mathematical
    //     operators to follow different protocols when using them.

    // b

    #include <iostream>
    using namespace std;

    class Food{
        public:
            float unit_price = 0.0;
            int quantity_requested = 0;

            void setFoodDetails(){
                cout << "Enter Unit Price";
                cin >> unit_price;
                cout << "Enter Quantity Requested";
                cin >> quantity_requested; 
            }

            void virtual calculateBill(){};

    };

    class Delivered_Food: public Food{
        public:
            float delivary_charge = 0.0, bill_ammount_of_a_customer = 0.0;

            void setDelivaryCharge(){
                cout << "Enter delivary Charge";
                cin >> delivary_charge;
            }

            void calculateBill(){
                bill_ammount_of_a_customer = unit_price * quantity_requested + delivary_charge;
                cout << "Customer Bill: " << bill_ammount_of_a_customer; 
            }

    };

    int main(){
        Delivered_Food obj1;
        obj1.Food::setFoodDetails();
        obj1.setDelivaryCharge();
        obj1.calculateBill();
        return 0;
    }


// 4

    // a
    //     i 
    //     ii 

    // b 

    #include <iostream>
    #include <fstream>
    using namespace std;

    class student{
        public:
            string stCode;
            int stAge = 0;

            void writeStud(){
                cout << "Enter student code";
                cin >> stCode;
                cout << "Enter student age";
                cin >> stAge;

                ofstream fileBucketOut = ("student.txt", ios::app);

                fileBucketOut << stCode << " " << stAge;

                fileBucketOut.close();
            }

            void readStud(){
                string lineR;

                ifstream fileBucketIn = ("student.txt");
                while (getline(fileBucketIn, lineR)){
                    cout << lineR;
                }
            }
    };


    int main (){
        student obj1;
        obj1.writeStud();
        obj1.readStud();
        return 0;
    }

