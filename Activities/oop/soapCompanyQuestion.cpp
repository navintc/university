#include <iostream>
using namespace std;

class soapCompany{
    public:
        int soapNum = 0, soapPrice = 0;

        soapCompany(int a, int b){
            soapNum = a;
            soapPrice = b;
        }
        
        ~soapCompany(){};
        
        void calculate(){
            outputPrice(soapNum * soapPrice);
        }
        
        void outputPrice(int price){
            cout << price;
        }
        
};

int main() {

    soapCompany company1(98,10);
    company1.calculate();
    return 0;
}


/* fdbdbd
*will allow the user to add new functinalities with already existing
members --- reusabilty 
*Potentially reduces size and code of the program
*Can be used to ensure security of the program.

*/