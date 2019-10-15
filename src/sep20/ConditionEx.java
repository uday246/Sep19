package sep20;

import java.util.Arrays;
import java.util.Scanner;

public class ConditionEx {
public static void main(String[] args) {
	
	int arr[]={1,2,3};
	System.out.println(Arrays.toString(arr));
	Scanner sc = new Scanner(System.in);
	//reading the user input and splitting the data
	System.out.println("Enter input: ");
	String str[]=sc.nextLine().split(" ");
	//first it is ABC
	String txt=str[0];
	//second part is numbers, converting it into int
	int n=Integer.parseInt(str[1]);
	System.out.println(txt);
	System.out.println(n);
	//checking the value based on condition
	if(n>=1000 && n<9000){
		System.out.println("Invalid input");
	}
}
}
