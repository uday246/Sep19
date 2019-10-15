package Sep5th;

import java.util.Scanner;

public class FixExample {
	public static void main(String args[]) {
		int f = 0, s = 1, t, i,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many number to display");
		n=sc.nextInt();
		System.out.print(f + " " + s);// printing 0 and 1
		 // starting from 2 as 0,1 is printed
		for (i = 2;i<n;i++) {
			//adding first and second and putting in 3rd
			t = f + s;
			//printing 3rd
			System.out.print(" " + t);
			//swapping values
			f = s;
			s = t;
		}

	}
}
