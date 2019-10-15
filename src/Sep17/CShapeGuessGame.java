package Sep17;

using System;

class MainClass {
  public static void Main (string[] args) {
    Random raNumberGenerator = new Random();
    int randomNumber;
    // generating random number
    randomNumber =raNumberGenerator.Next(1,10);
    while(true){
      Console.WriteLine("Guess number between 1-10: ");
      //reading number from user
      int num = Convert.ToInt32(Console.ReadLine());
      //checking it is low
      if(num<randomNumber)
        Console.WriteLine("Low.... ");
        //checking if it is high
      else if(num>randomNumber)
        Console.WriteLine("High.... ");
      else{
        Console.WriteLine("Congrats...Your correct!!! ");
        break;
      }
            
    }
  }
}