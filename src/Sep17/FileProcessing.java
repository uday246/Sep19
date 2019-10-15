package Sep17;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileProcessing {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter filename: ");
		String fname = sc.next();
		//reading n 
		System.out.println("Enter numer of elements ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		//reading numbers into array
		System.out.println("Enter " + n + " elements : ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		//calling method to write into file
		writeIntoFile(arr, fname);
		//calling method to read from file
		readNumbersAndDisplay(fname, n);
	}
//reading from file
	private static void readNumbersAndDisplay(String name, int aN) throws Exception {
		Scanner sc = new Scanner(new File(name));
		int i = 0;
		int arr[] = new int[aN];
		double sum = 0;
		//reading numbers from the file and adding to some
		//reading into array
		while (sc.hasNext()) {
			arr[i] = sc.nextInt();
			sum += arr[i++];
		}
		// printing average and sum
		double avg = sum / aN;
		System.out.println("Sum : " + sum);
		System.out.println("Average: " + avg);
		sc.close();
	}

	private static void writeIntoFile(int[] arr, String name) throws Exception {
		//Opening the file
		PrintWriter pw = new PrintWriter(new File(name));
		//writing into the writer
		for (int i : arr)
			pw.println(i);
		pw.close();
	}
}
