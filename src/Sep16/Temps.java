package Sep16;

import java.util.Scanner;

public class Temps {
	public static void main(String[] args) {
		//declaring arrays with sample values
		double dayTemps[] = { 20, 18, 16, 22, 24, 18, 14 };
		double avgTemps[] = { 15, 13, 14, 12, 15, 16, 13.5 };
		String days[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		//reading day of the week
		System.out.println("Enter the day of week: ");
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		System.out.println("Daily Temp\t\tAverage Temp");
		//checking if it is week than printing all days data
		if (w.equalsIgnoreCase("Week")) {
			for (int i = 0; i < avgTemps.length; i++)
				System.out.println(dayTemps[i] + "\t\t\t" + avgTemps[i]);
		} else {
			// finding the given day data
			for (int i = 0; i < days.length; i++) {
				if (w.equalsIgnoreCase(days[i])) {
					System.out.println(dayTemps[i] + "\t\t\tweek" + avgTemps[i]);
					break;
				}
			}

		}
		sc.close();

	}
}
