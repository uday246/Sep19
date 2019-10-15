
public class ArraysTest {
	public static void main(String[] args) {
		int myNums[] = { 3, 8, 12, 4, 2, 9, 6 };
		int largestNum;

		for (int index = 0; index < myNums.length; index++) {
			System.out.println(myNums[index] + " ");
		}
		largestNum = -1;
		for (int index = 0; index < myNums.length; index++) {
			if (largestNum < myNums[index])
				largestNum = myNums[index];
		}
		int smallestNum = myNums[0];
		for (int index = 1; index < myNums.length; index++) {
			if (smallestNum > myNums[index])
				smallestNum = myNums[index];
		}
		double avg = 0;
		for (int index = 0; index < myNums.length; index++) {
			avg += myNums[index];
		}
		avg = avg / myNums.length;
		System.out.println("Largest: " + largestNum);
		System.out.println("Smallest: " + smallestNum);
		System.out.println("Average: " + avg);
		if (search(9, myNums))
			System.out.println("9 Found in the array");
		else
			System.out.println("9 Not found in the array");
		if (search(7, myNums))
			System.out.println("7 Found in the array");
		else
			System.out.println("7 Not found in the array");

	}

	public static boolean search(int ele, int arr[]) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == ele)
				return true;
		return false;
	}
}
