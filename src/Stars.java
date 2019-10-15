
public class Stars {
	public static void main(String[] args) {
		printTriangle(5);
	}

	private static void printTriangle(int n) {
		if(n==0)
			return;
		printStars(n);
		printTriangle(n-1);
		
	}

	public static void printStars(int n) {
		for (int i = 0; i < n; i++)
			System.out.print("*");
		System.out.println();
	}
}
