package Sep17;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Days {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = { "january", "february", "march", "april", "may", "june", "july", "august", "september",
				"october", "november", "december" };
		List<String> months = (List) Arrays.asList(arr);
		String month;
		System.out.println("Enter month name : ");
		while (true) {
			month = sc.next();
			// checking it is valid month
			if (months.contains(month.toLowerCase()))
				break;
			System.out.println("Invalid month. Please try again");
		}
		System.out.println("Enter year");
		int year = sc.nextInt();
		if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("June")
				|| month.equalsIgnoreCase("November")){
			System.out.println("Thirty day has " + month);
			
		}
		else if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("March") || month.equalsIgnoreCase("May")|| month.equalsIgnoreCase("July") || month.equalsIgnoreCase("October")|| month.equalsIgnoreCase("December")){
			System.out.println("All the rest have thirty-one");
		}
		else if (isLeap(year) && month.equalsIgnoreCase("February")) {
			System.out.println("Leap Year happening one in four,Gives February one day more.");
			return;
		} else {
			System.out.println("with February's 28 to make it fun");
			
		}

	}

	private static boolean isLeap(int year) {
		boolean leap = false;
		// if any year is divisable by 4 than there are many chances for leap
		// year except few
		if (year % 4 == 0) {
			// if it is divisable by 100 than it shoud also divisable by 400
			// like 2000 etc
			if (year % 100 == 0) {
				// year is divisible by 400, so the year is a leap year
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;
		return leap;
	}

}
