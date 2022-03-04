#pragma once

// DO NOT CHANGE ANYTHING IN THIS FILE (Even a comment should not be changed). If any change is made, that will be result is reduction of marks.

class BendingStress
{
private:
	double E, b, h;  
	//E- Youngs modulus in GPA, b - width of the beam, h - height of the beam
	double Intertia();
	bool CheckValues(double E, double b, double h); // Check the beam properties
	bool CheckValues(double y); //Check the validity of the y value (distance from the neutral axis)

public:
	BendingStress();
	bool SetBeam(double E, double b, double h);
	bool Compute(double Moment, double y_neutral, double *stress, double *radius);
};
