
#include <iostream.h>
using namespace std;

class product{
	public:
		int value=0, price=0, quantity=0, taxvalue = 0, price;

		void calculate(){
			value=price * quantity
		}
};

class electronic_product: public product{

	int taxRate=0;
	
	public:


		electronic_product(){
			cout<< "Enter the price";
			cin>>price;
			cout<< "Enter the quantity produced";
			cin>>quantity;
			cout<< "Enter the taxRate";
			cin>>taxRate;
		}


		void calculate(){
			taxvalue = value * taxRate / 100;
			cout<<taxvalue;
		}

};

int main () {
	electronic_product product1;
	product1.calculate;
	return 0;

};
