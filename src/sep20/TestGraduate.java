package sep20;

class Student {
	private String major;
	private double gpa;
	private int creditHours;

	public Student(String aMajor, double aGpa, int aCreditHours) {
		super();
		major = aMajor;
		gpa = aGpa;
		creditHours = aCreditHours;
	}

	public double getGpa() {
		return gpa;
	}

	public double getCreditHours() {
		return creditHours;
	}

	public String getYear() {
		return null;
	}

	@Override
	public String toString() {
		return "Major : " + major + ", Gpa : " + gpa + ", CreditHours : " + creditHours;
	}

}

class Undergraduate extends Student {
	private boolean honors;

	//we need to write constructor here
	//becuse parent class does not have default constructor
	public Undergraduate(String aMajor, double aGpa, int aCreditHours, boolean aHonors) {
		super(aMajor, aGpa, aCreditHours);
		honors = aHonors;
	}

	public boolean isHonors() {
		return honors;
	}

	public String getYear() {
		if (getCreditHours() < 32)
			return "Freshman";
		else if (getCreditHours() >= 32 && getCreditHours() < 64)
			return "Sophomore";
		else if (getCreditHours() >= 64 && getCreditHours() < 96)
			return "Junior";
		else
			return "Senior";
	}

	public String toString() {
		return super.toString() + " Year : " + getYear() + " Honors : " + isHonors();
	}
}

public class TestGraduate {
	public static void main(String[] args) {
		Undergraduate u = new Undergraduate("CSE", 5, 70, false);
		System.out.println(u);

	}
}
