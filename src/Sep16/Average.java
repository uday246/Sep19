package Sep16;

public class Average {
	public static void main(String[] args) {
		int a = 3, b = 10, c = 7;
		double w = 12.9, y = 3.2;
		System.out.println("Predictions\t\tActual");
		System.out.println((a + b * c) + "\t\t" + (a + b * c));
		System.out.println((a - b - c) + "\t\t" + (a - b - c));
		System.out.println((a / b) + "\t\t" + (a / b));
		System.out.println((b / a) + "\t\t" + (b / a));
		System.out.println((a - b / c) + "\t\t" + (a - b / c));
		System.out.println((w / y) + "\t\t" + (w / y));
		System.out.println((y / w) + "\t\t" + (y / w));
		System.out.println((a + w / b) + "\t\t" + (a + w / b));
		System.out.println((a % b / y) + "\t\t" + (a % b / y));
		System.out.println((b % a) + "\t\t" + (b % a));
		System.out.println((w % y) + "\t\t" + (w % y));

	}
}
