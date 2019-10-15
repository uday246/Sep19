package Sep17;

class Square {
	private double side;

	public Square() {
		side = 1;
	}

	public Square(double s) {
		side = s;
	}

	// fomula sqrt(2) * side
	public double getDiagonal() {
		return Math.sqrt(2) * side;
	}

	// returning object details
	public String toString() {
		return "Length : " + side + "\nWidth : " + side + "\nDiagnoal : " + getDiagonal();
	}

	public double getSide() {
		return side;
	}

	public void setSide(double aSide) {
		side = aSide;
	}

}

public class TestSquare {
	public static void main(String[] args) {
		Square s1 = new Square(5);
		Square s2 = new Square();
		s2.setSide(8);
		System.out.println(s1);
		System.out.println(s2);

	}
}
