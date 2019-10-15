import java.util.Scanner;

public class EqualityAndRelational {
public static void main(String[] args) {
	int numInches;
	Scanner scnr = new Scanner(System.in);
	numInches=scnr.nextInt();
	//checking if numInches >=12
	if(numInches>=12){
		System.out.println("Foor or more");
	}
	else{
		System.out.println("Less than a foot");
	}
}
}
