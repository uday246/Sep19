package sep20;

import java.util.Scanner;

public class MulitplicationTables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int size = 0;
			while (true) {
				System.out.println("Please enter the table size from 1 to 5 ( 0 to exit)");
				size = sc.nextInt();

				if (size >= 0 && size <= 5)
					break;
				System.out.println("Sorry,not a valid table size from 1 to 5. Try again");
			}
			if (size == 0) {
				break;
			}
			for(int i=1;i<=size;i++)
				System.out.printf("\t%d",i);
			System.out.println("\n");
			// starting the lopp from 5 to 10
			for (int i = 1; i <= size; i++) {
				// starting the loop from 10 to 50
				System.out.printf("%d\t",i);
				for (int j = 1; j <= size; j += 1) {
					// printing the data
					System.out.printf("%d\t",i * j);
				}
				System.out.println();
				System.out.println();
			}
		}
	}
}
