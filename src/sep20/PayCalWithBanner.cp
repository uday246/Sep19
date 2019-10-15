#include <iostream>
using namespace std;
int main() {
  //printing banner
  cout<<"+-------------------------------------------------------+\n";
cout<<"|\t\t\t PAYROLL CALCULATOR\t\t\t\t\t\t\t|\n";
cout<<"|\t\t\t By : Steve Jons Section : 009 \t\t\t\t|\n";
cout<<"+-------------------------------------------------------+\n";
string fname,lname;
float hours,price,gross,f,ss,st,net;
//reading names
cout<<"Enter first name: ";
cin>>fname;
cout<<"Enter last name: ";
cin>>lname;
//reading hours and price
cout<<"Enter hours worked : ";
cin>>hours;
cout<<"Enter pay rate: ";
cin>>price;
//finding taxes
gross=hours * price;
st=gross * 0.06;
ss=gross * 0.03;
f=gross * 0.07;
//printing data
cout<<"Name : "<<fname<<" "<<lname<<endl;
cout<<"Gross Pay : $"<<gross<<endl;
cout<<"State Tax : $"<<st<<endl;
cout<<"Fed   Tax : $"<<f<<endl;
cout<<"SS 	 Tax : $"<<ss<<endl;
net=gross-ss-st-f;
cout<<"Net Pay : $"<<net<<endl;

}