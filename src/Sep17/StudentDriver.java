package Sep17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
	private String name;
	private double gpa;
	private String id;

	public Student(String aName, double aGpa, String aId) {
		super();
		name = aName;
		gpa = aGpa;
		id = aId;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double aGpa) {
		gpa = aGpa;
	}

	public String getId() {
		return id;
	}

	public void setId(String aId) {
		id = aId;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", id=" + id + "]";
	}

}

class StudentList {
	private List<Student> list = new ArrayList<Student>();

	public void add(Student s) {
		list.add(s);
	}

	public void print() {
		for (Student s : list)
			System.out.println(s);
	}

	public int remove(String id) {
		Student temp = null;
		for (Student s : list) {
			if (s.getId().equalsIgnoreCase(id)) {
				temp = s;
				break;
			}
		}
		if (temp == null)
			return -1;
		if (list.remove(temp))
			return 1;
		else
			return -1;
	}
}

public class StudentDriver {
	public static void main(String[] args) {
		boolean flag = true;
		int ch;
		StudentList sl = new StudentList();
		String id, name;
		double gpa;
		while (flag) {
			System.out.println("Uday".substring(2,2));
			System.out.println("1.Add Student");
			System.out.println("2.Print a list of students");
			System.out.println("3. Remove a student by id number");
			System.out.println("4. Quit");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				System.out.println("Enter name: ");
				name = sc.next();
				System.out.println("Enter Id: ");
				id = sc.next();
				System.out.println("Enter gpa");
				gpa = sc.nextDouble();
				sl.add(new Student(name, gpa, id));
				break;
			case 2:
				sl.print();
				break;
			case 3:
				System.out.println("Enter Id: ");
				id = sc.next();
				if (sl.remove(id) == 1)
					System.out.println("Removed Successfully..");
				else
					System.out.println("Failed to remove..");
				break;
			case 4:
				flag = false;
			}
		}
	}
}
