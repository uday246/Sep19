package Sep5th;

import java.util.Scanner;

public class FiberCost {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// reading the name of the company
		System.out.println("Enter name of the company");
		String name = sc.next();
		// putting price in constant
		final double PRICE = 0.87;
		//reading required cable
		System.out.println("Enter required fiber optics in feets");
		double feet = sc.nextDouble();
		//finding the total by multiplying the price with total
		double total = feet * PRICE;
		System.out.println("Company : " + name);
		System.out.println("Total Price : " + total);
		sc.close();
	}
}
