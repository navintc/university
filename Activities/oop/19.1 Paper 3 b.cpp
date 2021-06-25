
#include <iostream>
using namespace std;

class guest{
		
	public:
	    float guestBill=0.0;int guestID=0;
	    
		guest(){
			cout<<"Enter guest ID: \n";
			cin>>guestID;
			cout<<"Enter guest Bill amount: \n";
			cin>>guestBill;
		}
		
		
};

class foreignGuest: public guest{
	private:
		float taxRate=0.0, finalBillAmount=0.0;
	public:
		foreignGuest(){
			cout<<"Input tax rate\n";
			cin>>taxRate;
		}
		void finalBill(){
			finalBillAmount = (guestBill + (guestBill*taxRate/100));
			printBill();
		}
		void printBill(){
			cout<<"Final Bill: "<<finalBillAmount<<endl;

		}

};

//the constructor of the parent class runs first! 
//then the constructor of the child class will run..
//thats something cool!!

int main(){
	foreignGuest guest1;
	guest1.finalBill();
	return 0;
};
 