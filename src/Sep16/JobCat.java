package Sep16;

import java.util.Scanner;

public class JobCat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String categories[] = new String[2];
		//showing the jobs
		System.out.println("Categories\tJobs");
		System.out.println("A\t\tPick");
		System.out.println("A\t\tmop");
		System.out.println("A\t\tpack");
		System.out.println("B\t\tStock");
		System.out.println("B\t\tService");
		System.out.println("B\t\tStow");
		System.out.println("C\t\tClean");
		System.out.println("C\t\tLift");
		System.out.println("C\t\tRestore");
		//reading 2 jobs
		categories[0] = sc.nextLine();
		categories[1] = sc.nextLine();
		int i = 0, start = 0, end = 0;
		//reading working hours for jobs
		while (i < 2) {
			//reading hours
			System.out.println("Enter the start and end hours for " + categories[i]);
			start = sc.nextInt();
			end = sc.nextInt();
			//checking if difference is greater than 10
			if (end - start >= 10)
				System.out.println("They are awesome");
			else
				System.out.println("They are lazy");
			i++;
		}

	}
}
