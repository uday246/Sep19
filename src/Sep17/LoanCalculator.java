package Sep17;

import java.util.Scanner;

public class LoanCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// reading data from user
		double amount, interestRate;
		int payments;
		// loop so that ask user until they enter number greater than 0
		while (true) {
			System.out.println("Enter loan amount: ");
			amount = sc.nextDouble();
			if (amount > 0)
				break;
			System.out.println("The value must be greater than 0");
		}

		// loop so that ask user until they enter number greater than 0
		while (true) {
			System.out.println("Enter Interest rate: ");
			interestRate = sc.nextDouble();
			if (interestRate > 0)
				break;
			System.out.println("The value must be greater than 0");
		}
		// loop so that ask user until they enter number greater than 0
		while (true) {
			System.out.println("Enter  number of payments: ");
			payments = sc.nextInt();
			if (payments > 0)
				break;
			System.out.println("The value must be greater than 0");
		}

		// using with given formula
		double payment = amount * ((interestRate / 12.0) / 1 - Math.pow((1 + interestRate / 12.0), -1 * payments));
		System.out.println("Payment is : " + payment);
	}
}
