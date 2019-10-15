package sep20;

import java.util.Scanner;

public class ThreeWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please ente ran integer N: ");
		int n = sc.nextInt();
		sc.nextLine(); // to clean buffer
		// reading words
		System.out.print("Please enter a word with at least " + n + " and at most 20 letters : ");
		String s1 = sc.nextLine();
		System.out.print("Please enter a word with at least " + n + " and at most 20 letters : ");
		String s2 = sc.nextLine();
		System.out.print("Please enter a word with at least " + n + " and at most 20 letters : ");
		String s3 = sc.nextLine();
		// printing first n letters using substring method
		System.out.println("\t"+s1 + "starts with " + s1.substring(0, n));
		System.out.println("\t"+s2 + "starts with " + s2.substring(0, n));
		System.out.println("\t"+s3 + "starts with " + s3.substring(0, n));

	}
}
