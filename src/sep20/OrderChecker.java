package sep20;

class OrderChecker {
	public static void main(String[] args) {
		int[] myArray = new int[5];
		myArray[0] = 1;
		myArray[1] = 2;
		myArray[2] = 3;
		myArray[3] = 4;
		myArray[4] = 5;
		System.out.print("The array :");
		for(int x :myArray)
			System.out.print(x+" ");
		if (OrderChecker.isAscending(myArray)) {
			System.out.println("is in ascending order");
		} else {
			System.out.println("is not in ascending order");
		}
		System.out.print("\nThe array :");
		for(int x :myArray)
			System.out.print(x+" ");
		if (OrderChecker.isDescending(myArray)) {
			System.out.println("is in descending order");
		} else {
			System.out.println("is not in descending order");
		}
	}
	private static boolean isDescending(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1])
				return false;
		}
		return true;
	}

	private static boolean isAscending(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				return false;
		}
		return true;
	}
}