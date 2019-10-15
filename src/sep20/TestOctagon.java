package sep20;

interface Geometric {
	double area();

	double perimeter();

}

class Octagon implements Geometric, Comparable<Octagon>, Cloneable {
	private double side;

	public Octagon(double aSide) {
		super();
		side = aSide;
	}

	//returns the area 
	public double area() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}
	//returns the perimeter 
	public double perimeter() {
		return 8 * side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double aSide) {
		side = aSide;
	}

	// compares the side and returns which one is greater
	public int compareTo(Octagon a) {
		return new Double(a.getSide()).compareTo(getSide());
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class TestOctagon {
	public static void main(String[] args) {
		Octagon g = new Octagon(8);
		//finding area and Perimeter
		System.out.println("Area : " + g.area());
		System.out.println("Perimeter : " + g.perimeter());
		Octagon o = null;
		try {
			//cloning the object
			o = (Octagon) g.clone();
		} catch (CloneNotSupportedException e) {
		}
		if (g.compareTo(o) == 0)
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
	}
}
