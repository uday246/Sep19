package Sep17;

public class CallingMethod {
	static int count = 0;
	private static void fun() {
		// here declaring the local variable
		//increasing the count
		count++;
		//printing the count
		System.out.println(count + " time Called..");
	}

	public static void main(String[] args) {
		//calling the method
		fun();
		//calling the method
		fun();
		//calling the method
		fun();
	}
}
