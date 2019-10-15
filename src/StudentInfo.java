import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstName: ");
		String fname = sc.nextLine();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Enter lastName: ");
		String lname = sc.nextLine();
		lname = sc.nextLine();
		//adding fname and lname to make full name
		String name = fname + lname;
		//printing number of chars in full name
		System.out.println("Total Number of chars in name: " + name.length());
		//printing name in uppercase
		System.out.println("Name (Upper): " + name.toUpperCase());
		//printing in lower case
		System.out.println("Name (lower): " + name.toLowerCase());
		//printing first char using charAt()
		System.out.println("First letter: " + name.charAt(0));
		System.out.println("Age: " + age);

	}
}
