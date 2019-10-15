package sep20;

import java.util.Scanner;

public class IdentifierValidation {

	public static boolean isValid(String str) {

		// If first character is invalid
		if (!((str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(1) <= 'Z')
				|| str.charAt(0) == '_' || str.charAt(0) == '$'))
			return false;

		// iterating the rest of chars to check
		for (int i = 1; i < str.length(); i++) {
			if (!((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
					|| (str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '_'))
				return false;
		}

		return true;
	}

	// Driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter identifier: ");
		String str = sc.next();
		sc.close();
		if (isValid(str))
			System.out.println(str + " is valid");
		else
			System.out.println(str + " is not valid ");
	}
}
