package sep20;

import java.util.Scanner;

public class Larger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		// reading 2 numbers
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		// printing sum and difference and product and division
		System.out.println("Sum  : " + (n1 + n2));
		System.out.println("Difference: " + (n1 - n2));
		System.out.println("Product : " + (n1 * n2));
		System.out.println("Div  : " + (n1 / n2));
		// checking which one is larger and printing its details
		if (n1 > n2) {
			System.out.println(n1 + " is larger");
		} else if (n2 > n1) {
			System.out.println(n2 + " is larger");
		} else {
			System.out.println("Both are equal");
		}
	}
}
