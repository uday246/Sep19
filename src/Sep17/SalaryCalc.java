package Sep17;

import java.util.Scanner;

public class SalaryCalc {
	double Rpay = 0, Opay = 0;

	void calPay(double hours, double rate) {
		if (hours <= 40) {
			Rpay = hours * rate;
			Opay = 0;
		} else {
			double Rhr, Ohr;
			Rhr = 40;
			Ohr = hours - Rhr;
			Rpay = Rhr * rate;
			Opay = Ohr * (1.5 * rate);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int shift = 0;
		Double rate, hours;
		System.out.println("Pay Calculator");
		String ch = "";
		//added loop here to take the inputs repetedly  
		do {
			System.out.println("Enter Your Name");
			name = sc.next();
			System.out.println("Enter Your Shift, Enter 0 for Day, Enter1 for Night");
			System.out.println("0=Day, 1= Night");
			shift=sc.nextInt();
			System.out.println("Enter Number of Hours Worked");
			hours = sc.nextDouble();
			System.out.println("Enter Hourly Pay");
			rate = sc.nextDouble();
			SalaryCalc c = new SalaryCalc();
			c.calPay(hours, rate);
			Double Tpay = c.Rpay + c.Opay;
			System.out.println();
			System.out.println("Calculate Pay");
			System.out.println("Employee Name: " + name);
			System.out.println("Employee Regular Pay: " + c.Rpay);
			System.out.println("Employee Overtime Pay: " + c.Opay);
			System.out.println("Employee Total Pay: " + Tpay);
			if (shift == 0) {
				System.out.println("Employee PayPeriod is Friday");
			} else {
				System.out.println("Employee PayPeriod is Saturday");
			}
			//asking user if they want to continue to enter another employee data
			System.out.println("Press Y to continue.Other key to exit ");
			ch=sc.next();
		} while (ch.equalsIgnoreCase("y"));
	}
}