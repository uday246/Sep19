package Sep5th;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		// reading input from the user
		System.out.println("Enter number between 0-1000");
		input = sc.nextInt();
		int sum = 0;
		int temp=input;
		while (input > 0) {
			// extracting the last digit
			int reminder = input % 10;
			// adding to sum
			sum = reminder + sum;
			// removing the last digit
			input = input / 10;
		}
		// printing the sum details
		System.out.println("Sum of digits in " + temp + " is : " + sum);
		sc.close();
	}
}
