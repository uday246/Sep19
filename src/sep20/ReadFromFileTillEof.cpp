#include <iostream>
#include <fstream>
using namespace std;

int main()
{
   fstream inputFile;
   int count, number,target,found=-1;
   count = 0;
   //opening the file
   inputFile.open("numbers.txt");
   if (inputFile.fail()){
       cout << "File open error....";
       return 0;
   }
   //reading the number
   cout<<"Enter number : ";
   cin>>target;
       while (!inputFile.eof()){
            count++;
           inputFile >> number;
           inputFile.ignore();
           //checking if this is the number
           if(number==target){
             found=count;
           }
       }
       //printing the details
       if(found!=-1)
        cout<<target<<" last appears in the file at position "<<found<<endl;
      else
        cout<<target<<" does not appear in the file";

       inputFile.close();
     
   return 0;
}



