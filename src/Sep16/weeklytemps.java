package Sep16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class weeklytemps {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<String> Day = new ArrayList(
				Arrays.asList("Monday", "Tuesday", "Wednesday", "Thurday", "Friday", "Saturday", "Sunday")); // Stores
																												// days
																												// of
																												// the
																												// week

		ArrayList Temperature = new ArrayList(Arrays.asList( // Stores
																// temperature
																// of each day
																// of the week
				74, 85, 93, 84, 78, 89, 92));

		System.out.print("Please enter a day of the week or enter 'week' for each days tempature:");
		Scanner sc = new Scanner(System.in); // Allows user to enter day of week
		String Dayinput = sc.next();

		if (Dayinput.equalsIgnoreCase("week") || Dayinput.equalsIgnoreCase("Week")) { // Allows
																						// for
																						// user
																						// input
																						// with
																						// or
			int average=0;																		// without
																						// Capitalization
			System.out.println("Days of the week and Temperatures for each day");
			for (int i = 0; i < Day.size(); i++) {
				//finding sum of temps
				average=average+(Integer)Temperature.get(i);
				System.out.println(Day.get(i) + " " + "-" + " " + Temperature.get(i));
			}
			//printing average temp
			System.out.println("Average temparature: "+(average/7.0));
		} else { // Allows for individual days of week to be printed
			System.out.println("Day of week and Temperature of the day ");
			for (int i = 0; i < Day.size(); i++) {
				if (Day.get(i).equalsIgnoreCase(Dayinput))
					System.out.println(Day.get(i) + " " + Temperature.get(i));

			}
		}
	}
}