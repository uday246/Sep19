package Sep5th;

import java.util.Scanner;

public class NthRootFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read n (for taking the nth root)
		int n = Integer.parseInt(sc.nextLine());

		// Read number to take the nth root of
		int number = Integer.parseInt(sc.nextLine());

		// Read the desired precision
		int precision = Integer.parseInt(sc.nextLine());

		// Print the answer
		System.out.println(findNthRoot(number, n, precision));
	}

	private static String findNthRoot(int number, int n, int precision) {
		double p=0.0001;
		double x1 = n;
        double x2 = number / n;  
        while (Math.abs(x1 - x2) > p) 
        {
            x1 = x2;
            x2 = ((n - 1.0) * x2 + number / Math.pow(x2, n - 1.0)) / n;
        }
        String temp=""+x2;
        String res=
		return "";
	}
}