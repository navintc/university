// Q1 -------------------------------------------------------------------------

#inlcude <iostream>

using namespace std;

class Complex {
    private:
        int real,imag;
    public:
        Complex (){
            real = 0;
            imag = 0;
        }
        Complex (int r, int i){
            real = r;
            imag = i;
        }

        Complex operator +(Complex c){
            Complex temp;
            temp.real = real + c.real;
            temp.imag = imag + c.imag;
            return temp;
        }

        void print(){
            cout << real << "+" << imag << "i" << endl;
        }
}

int main() {
    Complex c1(5,4);
    Complex c2(2,3);
    Complex c3(7,3);
    Complex c4;
    c4 = c1+c2+c3;
    c4.print();
    return 0;

}









// Q2 ----------------------------------------------------------------------------------------

#include <iostream>
using namespace std;

class shop{
    
    public:
        int itemCode = 0, itemPrice = 0, disco = 0, discoPrice = 0;
        
        shop(){
            cout<<"Enter the item code";
            cin>> itemCode;
            cout<< "Enter the item price";
            cin>> itemPrice;
            cout<< "Enter discount";
            cin >> disco;
        }
        
        ~shop(){};
        
        void calculate(){
            discoPrice = itemPrice - itemPrice*disco/100;
        }
        
        void printOut(){
            cout << "The discounted price for "<< itemCode << " is, Rs." << discoPrice;
        }
};

int main(){
    shop item1;
    item1.calculate();
    item1.printOut();
    return 0;
}



// Q3 ----------------------------------------------------------------------------------------------
#include <string>
using namespace std;

class teacher{
    
    void display(){
        cout<< "Please enter data";

    }
    void display(int student){
        cout<< "the teacher has "<<student<< " students";
    }

    void display(int student, string name){
        cout<< "the teacher is "<<name << " and has "<<student<< " students";
    }
};

int main(){
    teacher obj1;
    obj1.display();
    obj1.display(6);
    obj1.display(10, "Dewmi");
    return 0;
}



// Q4----------------------------------------------------------------------------------------------------

#include <iostream>
using namespace std;

class multiply {
    
    public:
    
        int X = 0, Y =0;
        
        multiply(int A, int B){
            X= A;
            Y= B;
        }
        
        multiply operator +(int K){
            X = (X + Y) *K;
            cout << X;
        }
};

int main(){
    multiply obj1(5,8);
    
    obj1 + 5;
    
    return 0;
}


// Q5 -------------------------------------------------------------------------------------

#include <iostream>
#include <fstream>
#include <string>
using namespace std;

class company {
    
    public:
    
        int empNum = 0, empSal = 0;
        string name;
        
        company(){
            cin >> empNum;
            cin >> empSal;
            cin >> name;
            
            ofstream dewmi;
            dewmi.open ("cow.txt", ios::app);
            dewmi << name << empNum << empSal << endl;
            dewmi.close();
            
            readFiles();
        }
        
        void readFiles(){
            
            string myText;
            
            ifstream dewmi;
            dewmi.open ("cow.txt");
            
            while (getline (dewmi, myText)) {
              cout << myText;
            }
        }
};

int main(){
    company obj1();
    return 0;
}
