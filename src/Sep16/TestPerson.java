package Sep16;

class Person {
	private String firstName;
	private String lastName;

	public Person(String aFirstName, String aLastName) {
		super();
		firstName = aFirstName;
		lastName = aLastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String aFirstName) {
		firstName = aFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String aLastName) {
		lastName = aLastName;
	}

	@Override
	public String toString() {
		return "Name : " +firstName  + " " +lastName;
	}

}

class Customer extends Person {
	private String customerNumber;
	// constructor initialize the values using super constructor
	public Customer(String aFirstName, String aLastName, String aCustomerNumber) {
		super(aFirstName, aLastName);
		customerNumber = aCustomerNumber;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String aCustomerNumber) {
		customerNumber = aCustomerNumber;
	}
	//to string returns name and customer number
	@Override
	public String toString() {
		return super.toString() + "\nCustomerNumber: " + customerNumber;
	}

}

class Employee extends Person {
	private String ssn;
// constructor initialize the values using super constructor
	public Employee(String aFirstName, String aLastName, String aSs) {
		super(aFirstName, aLastName);
		ssn = aSs;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String aSs) {
		ssn = aSs;
	}

	@Override
	//to string returns name and ssn
	public String toString() {
		return super.toString() + "\nSSN: " + ssn;
	}

}

public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Customer("Frank", "Jones", "J54128");
		Person p2 = new Employee("Frank", "Jones", "XXXX-XXXX-1111");
		System.out.println(p1);
		System.out.println(p2);

	}
}
