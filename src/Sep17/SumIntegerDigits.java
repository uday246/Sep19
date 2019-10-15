package Sep17;

import java.util.Scanner;

public class SumIntegerDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//reading number from the user
		System.out.println("Enter a number between 0 and 1000: ");
		int num = sc.nextInt();
		int sum = 0;
		//iterating thrugh the each digit
		while (num > 0) {
			//extracting each digit
			sum += num % 10;
			//removing last digit
			num /= 10;
		}
		System.out.println("The sum of the digits is " + sum);
	}
}
