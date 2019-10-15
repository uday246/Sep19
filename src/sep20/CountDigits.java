package sep20;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//reading number
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		//checking if it is negative
		if (num < 0) {
			System.out.println("Number is negative : ");

		}			//checking it is more than a million 
		else if (num >= 1000000) {
			System.out.println("Number has more than 6 digits");
		} else {
			// removing each digit and counting the digits
			int count = 0;
			int temp = num;
			while (num > 0) {
				count++;
				num /= 10;
			}
			System.out.println(temp + " has " + count + " digits");
		}
	}
}
