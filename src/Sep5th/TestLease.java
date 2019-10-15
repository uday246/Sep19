package Sep5th;

import java.util.Scanner;

class Lease {
	private String name;
	private double apartmentNumber;
	private double rent;
	private double term;

	public Lease() {
		name = "xxx";
		apartmentNumber = 0;
		rent = 1000;
		term = 12;
	}

	public void setName(String nm) {
		name = nm;
	}

	public void setApartmentNumber(double aptnbr) {
		apartmentNumber = aptnbr;
	}

	public void setRent(double rnt) {
		rent = rnt;
	}

	public void setTerm(double tm) {
		term = tm;
	}

	public String getName() {
		return name;
	}

	public double getApartmentNumber() {
		return apartmentNumber;
	}

	public double getRent() {
		return rent;
	}

	public double getTerm() {
		return term;
	}

	public void addPetFee() {
		rent += 10;
		explainPetPolicy();
	}

	public static void explainPetPolicy() {
		System.out.println("Pet policy ");

	}

}

public class TestLease {
	public static void main(String[] args) {
		Lease firstLease = new Lease();
		Lease secondLease = new Lease();
		Lease thirdLease = new Lease();
		Lease fourthLease = new Lease();
		firstLease = getdata(firstLease);
		secondLease = getdata(secondLease);
		thirdLease = getdata(thirdLease);
		showValues(firstLease);
		firstLease.addPetFee();
		showValues(firstLease);
		showValues(secondLease);
		showValues(thirdLease);
		showValues(fourthLease);

	}

	public static Lease getdata(Lease lease) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter name >> ");
		// lease.setname = keyboard.nextLine();
		// here we need to use setter as the name variable is private
		lease.setName(keyboard.nextLine());
		System.out.print("Enter apartment number >> ");
		// lease.setpartmentNumber = keyboard.nextDouble();
		// here we need to use setter as apartmentNumbber the variable is
		// private
		lease.setApartmentNumber(keyboard.nextDouble());

		System.out.print("Enter rent >> ");
		// lease.setrent = keyboard.nextDouble();
		// here we need to use setter as the rent variable is private
		lease.setRent(keyboard.nextDouble());
		System.out.print("Enter term >> ");
		// here we need to use setter as the term variable is private
		// lease.seterm = keyboard.nextDouble();
		lease.setTerm(keyboard.nextDouble());

		return lease;

	}

	public static void showValues(Lease lease) {
		// need to get getters as all variables are private
		System.out.println("Lease name " + lease.getName());
		System.out.println("Lease apartment number " + lease.getApartmentNumber());
		System.out.println("Lease rent " + lease.getRent());
		System.out.println("Lease term " + lease.getTerm());
	}

}
