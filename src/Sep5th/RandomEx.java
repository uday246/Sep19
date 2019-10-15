package Sep5th;

import java.util.Random;
import java.util.Scanner;

public class RandomEx {
	public static void main(String[] args) {
		System.out.println(6>5+1);
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		//reading n from user
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		int val = 0, temp = 0;
		int max = 100;
		int min = -100;
		//starting the loop to iterate n times
		for (int i = 0; i < n; i++) {
			//generating number between -100 and 100
			val = r.nextInt((max - min) + 1) + min;
			// converting val to pos if it is negative for checking
			if (val < 0)
				temp = -1 * val;
			else
				temp = val;
			// checking if it is mulitple of 7 or 9
			// than print * and come to new line
			//else print that number
			if (temp % 7 == 0 || temp % 9 == 0)
				System.out.println("*");
			else
				System.out.print(val + " ");
		}
		sc.close();
	}
}
