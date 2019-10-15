package Sep17;

import java.io.BufferedReader;
import java.io.FileReader;

public class GradesFromFile {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("Grades.txt"));
		double average = 0;
		String line=br.readLine();
		//reading line by line from file
		while (line != null) {
			//splitting file to extact data
			String arr[] = line.split(" ");
			double scores[] = new double[5];
			//converting scores to double value
			for (int i = 1, j = 0; i < arr.length; i++)
				scores[j++] = Double.parseDouble(arr[i].trim());
			//finding average 
			average = calculateAverage(scores);
			//priting result
			System.out.printf(arr[0] + "\t%.1f\t" + calculateGrade(average) + "\n", average);
			line=br.readLine();
		}
	}

	//returns the average for given scroes
	private static double calculateAverage(double[] aScores) {
		double sum = 0;
		for (double d : aScores)
			sum += d;
		return sum / aScores.length;
	}
	// method returns the grade for given average
	private static String calculateGrade(double avg) {
		if (avg >= 90)
			return "A";
		if (avg >= 80)
			return "B";
		if (avg >= 70)
			return "C";
		if (avg >= 60)
			return "D";

		return "F";

	}
}
