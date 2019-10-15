package Sep5th;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public double fileAverage(String filename) {
		double avg = 0;
		System.out.println((double)30/8);
		Scanner sc = null;
		try {
			//opening the file with given name
			sc = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		double sum = 0, count = 0;
		//reading numbers from file
		while (sc.hasNext()) {
			//adding to sum
			sum += sc.nextDouble();
			//increasing the count
			count++;
		}
		//finding the average
		avg = sum / count;
		return avg;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		System.out.println(obj.fileAverage("numbers.txt"));
	}
}