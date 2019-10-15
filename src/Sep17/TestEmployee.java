package Sep17;

class Employee {
	private String fname;
	private String lname;
	private double mSalary;
	private double salesBonus;

	public Employee() {
		super();
	}

	// construtor to initialize the values
	public Employee(String aFname, String aLname, double aSalary, double aSalesBonus) {
		super();
		fname = aFname;
		lname = aLname;
		mSalary = aSalary;
		salesBonus = aSalesBonus;
	}

	// getters and setters
	public String getFname() {
		return fname;
	}

	public void setFname(String aFname) {
		fname = aFname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String aLname) {
		lname = aLname;
	}

	public double getSalary() {
		return mSalary;
	}

	public void setSalary(double aSalary) {
		mSalary = aSalary;
	}

	public double getSalesBonus() {
		return salesBonus;
	}

	public void setSalesBonus(double aSalesBonus) {
		salesBonus = aSalesBonus;
	}

	// returns the yearlySalary
	public double yearlySalary() {
		return mSalary * 12 + salesBonus;
	}

	// toString will return all the object details
	public String toString() {
		return "Employee [Fist Name=" + fname + ", Last Name=" + lname + ", Monthly Salary=" + mSalary + ", salesBonus=" + salesBonus
				+ "]";
	}

}

public class TestEmployee {
	public static void main(String[] args) {
		// creating 2 objects
		Employee e1 = new Employee("Uday", "Kumar", 5000, 500);
		Employee e2 = new Employee("Keerthi", "Reddy", 6000, 100);
		// printing 2 objects
		System.out.println(e1);
		System.out.println(e2);
		// giving 100 hike for both employees
		e1.setSalary(e1.getSalary() + 100);
		e2.setSalary(e2.getSalary() + 100);
		// printing 2 objects
		System.out.println("After giving 100 hike");
		System.out.println(e1);
		System.out.println(e2);

	}
}
