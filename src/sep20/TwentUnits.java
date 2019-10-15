package sep20;

public class TwentUnits {
	public static void main(String[] args) {
		int data[] = { 10, 20, 3, 40, 55, 60, 65525 };
		System.out.println(findIt(data));
	}

	private static int findIt(int[] arr) {
		// using nested loops to iterate all elements
		for (int i = 0; i < arr.length - 2; i++) {
			int sum = 0;
			// iterating 3 set of elemtns
			for (int j = i; j < i + 2; j++) {
				// finding the difference
				sum += Math.abs(arr[j] - arr[j + 1]);
			}
			// checking if it equals 20 than return i
			if (sum == 20)
				return i;
		}
		return -1;
	}
}
