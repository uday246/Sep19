import java.util.Scanner;

public class NumberChecker {
public static void main(String[] args) {
	int userNum;
	Scanner scnr = new Scanner(System.in);
	userNum=scnr.nextInt();
	// here for checking equality we need to use == not =
	if(userNum==2){ //if(userNum=2){
		System.out.println("Num is greater than or equal to two");
	}
	else{
		System.out.println("Num is less than two");
	}
}
}
