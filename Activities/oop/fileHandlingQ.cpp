#include <iostream>
#include <fstream>
using namespace std;

class patient{

    public:
        string pNum, pName;

        void writeFile(){
            cout << "Enter patint number";
            cin >> pNum;
            cout << "Enter patient name";
            cin >> pName;

            ofstream navinsBucketOut("patient.txt", ios::app);
            navinsBucketOut << pNum << " " << pName;
            navinsBucketOut.close();
        }

        void readFile(){
            string lineR, wordR, dataAr[2];
            int i = 0;
            ifstream navinsBucketIn("patient.txt");

            while (getline(navinsBucketIn, lineR)){

                cout << lineR;
                i = 0;

                while (getline(std::lineR, std::wordR, " ")){
                   dataAr[i] = wordR;
                   i += 1;
                }

                if (dataAr[0] == "10"){
                    cout << dataAr[1];
                }
            }

            navinsBucketIn.close();
        }
};

int main(){
    patient obj1;
    obj1.writeFile();
    obj1.readFile();
    return 0;
}