package Sep5th;

import java.util.Scanner;

/**
 * @author Name
 *
 */
public class BookOrder {
	public static void main(String[] args) {
		// variables for titles
		String title1, title2, title3;
		// variables for authors
		String author1, author2, author3;
		// variables for prices
		double price1, price2, price3;
		// variables for units
		int units1, units2, units3;
		//constant to store tax rate
		final double TAX_RATE = 8.75;
		double preTaxTotal, salesTax, total;
		Scanner sc = new Scanner(System.in);
		//reading book1 details
		System.out.println("Enter title and author of book 1");
		title1 = sc.nextLine();
		author1 = sc.nextLine();
		System.out.println("Enter the number of units for book");
		units1 = sc.nextInt();
		System.out.println("Enter price for book 1");
		price1 = sc.nextDouble();
		//reading book2 details
		System.out.println("Enter title and author of book 2");
		title2 = sc.nextLine();
		title2 = sc.nextLine();
		author2 = sc.nextLine();
		System.out.println("Enter the number of units for book2");
		units2 = sc.nextInt();
		System.out.println("Enter price for book 2");
		price2 = sc.nextDouble();
		//reading book3 details

		System.out.println("Enter title and author of book 3");
		title3 = sc.nextLine();
		title3 = sc.nextLine();
		author3 = sc.nextLine();
		System.out.println("Enter the number of units for book 3");
		units3 = sc.nextInt();
		System.out.println("Enter price for book 3");
		price3 = sc.nextDouble();

		//finding preTaxtotal and sales tax and total amount
		preTaxTotal = price1 * units1 + price2 * units2 + price3 * units3;
		salesTax = preTaxTotal * (TAX_RATE / 100);
		total = preTaxTotal + salesTax;
		System.out.println("Pre Tax Amount : " + preTaxTotal);
		System.out.println("Sales Tax Amount (" + TAX_RATE + "%): " + salesTax);
		System.out.println("Total Amount : " + total);

	}
}
