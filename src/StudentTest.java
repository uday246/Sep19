import java.util.Scanner;

class Student {
	private String firstName;
	private String lastName;
	private double gpa;

	// constructor
	public Student(String firstName, String lastName, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		if (gpa > 0) // validate parameter
			if (gpa <= 4.0)
				this.gpa = gpa;
	}

	// return first name
	public String getFirstName() {
		return firstName;
	}

	// return last name
	public String getLastName() {
		return lastName;
	}

	// return GPA
	public double getGPA() {
		return gpa;
	}

	// set GPA
	public void setGPA(double gpa) {
		if (gpa > 0) // validate parameter
			if (gpa <= 4.0)
				this.gpa = gpa;
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("Uday", "Kumar", 3);
		Student s2 = new Student("Koti", "Keerthi", 3);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstName: ");
		String fName = sc.next();
		System.out.println("Enter lastName: ");
		String lName = sc.next();
		System.out.println("Enter GPA: ");
		double gpa = sc.nextDouble();
		Student s3 = new Student(fName, lName, gpa);
		System.out.println("First Name : " + s1.getFirstName());
		System.out.println("Last Name : " + s1.getLastName());
		System.out.printf("GPA : %.2f\n", s1.getGPA());

		System.out.println("First Name : " + s2.getFirstName());
		System.out.println("Last Name : " + s2.getLastName());
		System.out.printf("GPA : %.2f\n", s2.getGPA());

		System.out.println("First Name : " + s3.getFirstName());
		System.out.println("Last Name : " + s3.getLastName());
		System.out.printf("GPA : %.2f\n", s3.getGPA());
		System.out.println("Enter gpa for first student: ");
		gpa = sc.nextDouble();
		s1.setGPA(gpa);

		System.out.println("First Name : " + s1.getFirstName());
		System.out.println("Last Name : " + s1.getLastName());
		System.out.printf("GPA : %.2f\n", s1.getGPA());

		System.out.println("Highest GPA: ");
		if (s1.getGPA() > s2.getGPA() && s1.getGPA() > s3.getGPA())
			System.out.println(s1.getGPA());
		else if (s2.getGPA() > s3.getGPA())
			System.out.println(s2.getGPA());
		else
			System.out.println(s3.getGPA());
	}
}
