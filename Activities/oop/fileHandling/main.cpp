#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ofstream duckFileEdit ("Duck.txt", ios::app);

    duckFileEdit.seekp(-10, ios_base::end);
    duckFileEdit<<" suck ";
    cout<< " - ";
    duckFileEdit.close();

    ifstream duckFile ("Duck.txt");

    string line;

    while (getline (duckFile,line)){
        cout << line;
    }

    duckFile.close();
    return 0;
}

