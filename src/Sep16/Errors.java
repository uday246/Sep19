package Sep16;

import java.util.Scanner;


public class Errors {
public static void main(String[] args) {
	String name;
	int number;
	int numSq;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter you name,please : ");// ; missing
	//Name=scan.next();
	name=scan.next();
	System.out.println("What is your favorie number?"); // " missing
	number=scan.nextInt();
	numSq=number*number;
	System.out.println(name+", the square of your number is "+numSq);// + missing and numSquared are not there
}
}
