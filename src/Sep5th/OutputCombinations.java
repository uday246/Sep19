package Sep5th;

import java.util.Scanner;

public class OutputCombinations {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char a;
		char b;
		char c;
		a = scnr.next().charAt(0);
		b = scnr.next().charAt(0);
		c = scnr.next().charAt(0);
		// printing the each combination
		// appending "" so that every thing will converted as string
		System.out.print("" + a + b + c + " ");
		System.out.print("" + a + c + b + " ");
		System.out.print("" + b + a + c + " ");
		System.out.print("" + b + c + a + " ");
		System.out.print("" + c + a + b + " ");
		System.out.print("" + c + b + a + " ");

		System.out.println("");
	}
}
