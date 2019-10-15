package Sep6th;

import java.util.Scanner;

public class ArithCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//reading numbers from user
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		//reading operation type from the uesr
		char c = sc.next().charAt(0);
		// if it is + adding 2 numbers
		if (c == '+') {
			System.out.printf("%.2f", d1 + d2);
		}
		// if it is - subtracting 2 numbers
		else if (c == '-') {
			System.out.printf("%.2f", d1 - d2);
		}
		// if it is * mulitplying 2 numbers
		else if (c == '*') {
			System.out.printf("%.2f", d1 * d2);
		} 
		// if it is / dividing 2 numbers
		else if (c == '/') {
			System.out.printf("%.2f", d1 / d2);
		} else {
			System.out.println("INVALID");
		}
	}
}