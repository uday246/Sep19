package Sep5th;

import java.util.Scanner;

public class ModuleOp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// reading dividend from user
		System.out.println("Enter dividend ");
		int dividend = sc.nextInt();
		// reading divisor from user
		System.out.println("Enter divisor ");
		int divisor = sc.nextInt();
		// printing the reminder using % operator
		System.out.println("Reminder : " + (dividend / divisor));
		sc.close();
	}
}
