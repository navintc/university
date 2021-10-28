#include<iostream.h>
class employee
{
    protected:
        int empId;
        float empSalary;
    public:
        void setData(int a,float b)
        {
            empId = a;
            empSalary = b;
        }
};
class softwareEngineer : public employee
{
    public:
        float bonus;

        void setBonusData(float a)
        {
            bonus = a;
        }
            float calculateNetSalary()
        {
            return (empSalary + bonus);
        }
        
        void dislayNetSalary()
        {
            cout << "Net - " << calculateNetSalary() << endl ;
        }
};



main()
{

}



/*
background functions hiding - abstraction
data hiding - encasulation
*/
