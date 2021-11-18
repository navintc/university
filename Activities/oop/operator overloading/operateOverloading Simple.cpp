#include <iostream>
using namespace std;

class opOver{

    int value = 0;

    opOver operator -(opOver c){
        int a = 5;
        value = a + c + c - c*c ;
        return 0;
   }
}

int main(){
    opOver o1;
    cout << o1+10;
    return 0;
}