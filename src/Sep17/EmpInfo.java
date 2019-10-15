package Sep17;

import java.util.Scanner;

public class EmpInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name: ");
		String name1 = sc.nextLine();
		System.out.println("Enter hours worked for emp1: ");
		double hours1 = sc.nextDouble();
		System.out.println("Enter price for emp1: ");
		double price1 = sc.nextDouble();
		double salary1 = price1 * hours1;
		System.out.println(name1 + " Hours Worked :" + hours1 + " Rate of pay: " + price1 + " Salary for " + name1
				+ " is $" + salary1);
		//entering emp2 data
		System.out.println("Enter employee name2: ");
		String name2 = sc.nextLine();
		name2 = sc.nextLine();
		System.out.println("Enter hours worked for emp2: ");
		double hours2 = sc.nextDouble();
		System.out.println("Enter price for emp2: ");
		double price2 = sc.nextDouble();
		double salary2 = price2 * hours2;
		System.out.println(name1 + " Hours Worked :" + hours2 + " Rate of pay: " + price2 + " Salary for " + name2
				+ " is $" + salary2);

		//entering emp3 data
		System.out.println("Enter employee name3: ");
		String name3 = sc.nextLine();
		name3 = sc.nextLine();
		System.out.println("Enter hours worked for emp3: ");
		double hours3 = sc.nextDouble();
		System.out.println("Enter price for emp3: ");
		double price3 = sc.nextDouble();
		double salary3 = price3 * hours3;
		System.out.println(name3 + " Hours Worked :" + hours3 + " Rate of pay: " + price3 + " Salary for " + name3
				+ " is $" + salary3);
		double max, min;
		//finding  max salary
		if (salary1 > salary2 && salary1 > salary3)
			max = salary1;
		else if (salary2 > salary3)
			max = salary2;
		else
			max = salary3;
		//finding  min salary
		if (salary1 < salary2 && salary1 < salary3)
			min = salary1;
		else if (salary2 < salary3)
			min = salary2;
		else
			min = salary3;
		//printing message
		System.out.println("The largest salary is $" + max + " The smallest salary is $" + min);

	}
}
