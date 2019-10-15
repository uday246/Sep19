package sep20;

import java.util.Scanner;

public class Goal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//reading initial deposit
		System.out.println("Enter initial deposit: ");
		double initial = sc.nextDouble();
		//reading target amount
		System.out.println("Enter total amount you want");
		double amount = sc.nextDouble();
		int months = 0;
		int years=0;
		System.out.println("Enter monthly deposit amount: ");
		double monthlyAmount=sc.nextDouble();
		//loop until user reaches his target
		while (initial < amount) {
			//adding 5% interest rate
			initial = initial + initial * 0.05;
			initial+=monthlyAmount;
			months++;
		}
		years=months/12;
		months=months%12;
		System.out.println(years+" Years and "+months+" months ");
	}
}
