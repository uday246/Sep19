import java.util.Scanner;

public class StudentCred {
	public static void main(String[] args) {
		final String unName = "Oakland University";
		Scanner sc = new Scanner(System.in);
		//reading gpa
		System.out.println("Enter gpa:");
		double gpa = sc.nextDouble();
		//reading credits
		System.out.println("Enter number of credits: ");
		int credits = sc.nextInt();
		//reading fee
		System.out.println("Enter total tution fee: ");
		int tutionFee = sc.nextInt();
		//reading name
		System.out.println("Enter lastName: ");
		String lastName = sc.nextLine();
		lastName = sc.nextLine();
		//reading initial
		System.out.println("Enter initial: ");
		char initial = sc.next().charAt(0);
		char grade;
		//finding grade
		if (gpa < 2.5)
			grade = 'D';
		else if (gpa >= 2.5 && gpa < 3)
			grade = 'C';
		else if (gpa >= 3 && gpa <= 3.5)
			grade = 'B';
		else
			grade = 'A';
		//finding fee
		double dollorsPerCredit = tutionFee / (double) credits;
		System.out.println("Name : " + lastName + "." + initial);
		System.out.println("University Name :" + unName);
		System.out.println("GPA grade: " + grade);
		System.out.println("Tution cost per credit hour: " + dollorsPerCredit);

	}
}
