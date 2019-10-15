package Sep5th;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class MyFile {
  
   public static void main(String[] args){
      
       try {
           File j = new File("input.txt");//must make sure that the path to input.txt is correct otherwise
           Scanner input = new Scanner(j);
           PrintWriter pw = new PrintWriter(new File("output.txt"));
           while(input.hasNext()) {
        // here you need to use nextLine() to read the entire line
       // if use just line() than it will give untill it founds space
           String line = input.nextLine();// store the line in a variable - eg. String line = input.next();
           String[] numOperation = line.split(":");// split the line on the semi-colon
           String operation = numOperation[0];// assign the operation to a variable at index 0 of operation_numbers
           String[] digits = numOperation[1].split(",");// assign the numbers to a variable using index 1 of operation_numbers - split the numbers on the commas
           int len = digits.length;
           int arr[] = new int[len];//convert the numbers array to an integer data type
          
           for(int i = 0; i < len; i++)
               arr[i] = Integer.parseInt(digits[i].trim());
          
           if(operation.equalsIgnoreCase("Min")) {//the use of IgnoreCase is used in order to not consider the case of the string.
               int min = arr[0];
           for(int i = 0; i < len; i++) {//use of for loop to iterate over numbers and length of array.
               if(min > arr[i])
                   min = arr[i];
           }
          
           pw.println("The min of " + Arrays.toString(arr) + " is " + min);//use of the toString method in order to print array in output.txt file
          
           }
          
           else if (operation.equalsIgnoreCase("Max")) {
               int max = arr[0];
           for(int i = 0; i < len; i++) {
               if(max < arr[i])
                   max = arr[i];
              
           }
          
           pw.println("The max of " + Arrays.toString(arr) + " is " + max);
          
           }
          
           else if(operation.equalsIgnoreCase("Avg")) {
               double avg = 0.0;//must remember that average is a double and not integer data type
           for(int i = 0; i < len; i++) {
               avg += arr[i];
              
           }
          
           avg /= len;//method to calculate the average of the array
          
           pw.println("The avg of " + Arrays.toString(arr) + " is " + avg);
          
           }
          
           else if(operation.charAt(0) == 'P') {
               int perc = Integer.parseInt(operation.substring(1));
               int index = (int)(arr.length * (perc / 100.0)) - 1;
              
               pw.println("The " + perc + "th percintile of " + Arrays.toString(arr) + " is " + arr[index] + ".");
           }
          
           else if(operation.equalsIgnoreCase("Sum")) {
               int sum = 0;//initiate a variable for sum
               for(int i = 0; i < len; i++) {
                   sum += arr[i];
               }
              
               pw.println("The sum of " + Arrays.toString(arr) + " is " + sum);
              
           }
          
           }
          
           pw.close();//must remember to close file once done with it
           input.close();
           }catch(FileNotFoundException e) {//exception needed in case the file is not found
               System.out.println("Error");
           }
   }
}