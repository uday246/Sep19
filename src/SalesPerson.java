import java.util.Scanner;

public class SalesPerson {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// initializing with 200 as sales persons week salary is 200
		int ch = 1;
		while (ch != 0) {
			double total = 200;
			// reading number of sales
			System.out.println("Enter number of sales :");
			int sales = sc.nextInt();
			// adding 9% of sales amount to salary
			total += sales * 0.09;
			System.out.println("Total earnings: $" + total);
			System.out.println("Press 0 to exit, any other key to continue");
			ch = sc.nextInt();
		}
	}
}
