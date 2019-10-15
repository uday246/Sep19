package Sep5th;

import java.util.Arrays;

class Vendor {
	private String companyName;
	private int id;
	private double orderTotals[] = new double[4];

	public Vendor() {

	}

	// constructor initialize the values
	public Vendor(String aCompanyName, int aId, double[] aOrderTotals) {
		companyName = aCompanyName;
		id = aId;
		orderTotals = aOrderTotals;
	}

	// setters and getters
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String aCompanyName) {
		companyName = aCompanyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int aId) {
		id = aId;
	}

	public double[] getOrderTotals() {
		return orderTotals;
	}

	public void setOrderTotals(double[] aOrderTotals) {
		orderTotals = aOrderTotals;
	}

	// toString will return the string representaion of object
	public String toString() {
		return "Vendor [companyName=" + companyName + ", id=" + id + ", orderTotals=" + Arrays.toString(orderTotals)
				+ "]";
	}

}

public class TestVendor {
	public static void main(String[] args) {
		double t1[] = { 10, 20, 14, 25 };
		// creating vendor object with constructor
		Vendor v1 = new Vendor("ABC", 1, t1);
		// printing v1 so it will call toString and print object details
		System.out.println(v1);
		double t2[] = { 19, 42, 12, 21 };
		// creating vendor object with default constructor
		Vendor v2 = new Vendor();
		// setting values using setters
		v2.setCompanyName("XYZ");
		v2.setId(2);
		v2.setOrderTotals(t2);
		System.out.println(v2);
	}
}
