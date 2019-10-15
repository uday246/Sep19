package Sep5th;

import java.util.Scanner;

public class MinMaxSearchByValue {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of commas: ");

		//reading the number of cases
		int cases = input.nextInt();

		input.nextLine();
		

		for (int i = 0; i < cases; i++) {
			//reading elements from user
			System.out.println("Enter elements separeted by comma: ");
			String givenListOfNums = input.nextLine();
			//splitting the array with , as delimeter
			String arr[]=givenListOfNums.split(",");

			//assuming 1st element as min and max
			int min = Integer.parseInt(arr[0]);

			int max = min;

			for(int j=1;j<arr.length;j++){

				//comparing min value with current value
				int nextValue = Integer.parseInt(arr[j]);

				// if current value is small than making current value as min
				if (nextValue < min) {

					min = nextValue;
				}
				// if current value is max than making current value as max
				else if (nextValue > max) {

					max = nextValue;
				}
			}
			System.out.printf("Elements :%s%nMin element:%d%nMax element : %d%n%n", givenListOfNums, min, max);
		}

	}

}