#include"BendingStress.h"
#include<iostream>
#include<cmath>

//DO NOT change any of the given parameter names of the functions CheckValues and SetBeam. 
//---------DO NOT change or write anything above this point. 

//Your code should start from this point down. 

//INDEX NO: 

class BendingStress2: public BendingStress{
    public:
        BendingStress2(){
            double* k = 0.0;
            double* j = 0.0;
            SetBeam(0.0, 0.0, 0.0);
            Compute(0.0, 0.0, k, j);

        }
};

bool BendingStress::CheckValues(double Y_na) 
{
	
}

bool BendingStress::SetBeam(double E, double breadth, double height)
{
	
}



