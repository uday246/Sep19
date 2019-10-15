#include<iostream>
#include "circle.h"
using namespace std;

class Circle{
public:
double radius;
void SetRadius(double r);
double GetRadius( ) const;
double CalculateArea( ) const;
double CalculateCircumference( ) const;
double GetDiameter( ) const;
};


void Circle :: SetRadius(double r){
  if(r>=0)
	radius=r;
  else
  radius=0;
}

double Circle ::  GetRadius( ) const{
	return radius;
}

double Circle ::  CalculateArea( ) const{
	return radius * radius * 3.1415;
}

double Circle ::  CalculateCircumference( ) const{
	return 2 * 3.1415 * radius;
}

double Circle ::  GetDiameter( ) const{
	return 2 * radius;
}

int main(){
Circle c;
c.SetRadius(10);
cout<<"Area : "<<c.CalculateArea()<<endl;
cout<<"Circumference : "<<c.CalculateCircumference()<<endl;
cout<<"Diameter : "<<c.GetDiameter()<<endl;


}
