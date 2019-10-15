package Sep16;

import java.util.Scanner;

public class CMPS280_P2 {

	public static void main(String[] args) {

		// Declaring Variables & creating Scanner
		int rows, columns;
		Scanner input = new Scanner(System.in);
		// Gathering User Inputs
		rows = input.nextInt();
		columns = input.nextInt();

		// Array created with the constraints set by the user
		double matrix[][] = new double[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		//printing the matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}

		//finding the min element each column
		System.out.println("Min elements in each column:");
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.print(columnMin(matrix, i) + " ");
		}

	}

	//finds and returns the min element for given column
	public static double columnMin(double[][] m, int columnIndex) {
		double minimum = m[0][columnIndex];
		for (int i = 0; i < m.length; i++) {

			if (minimum > m[i][columnIndex])
				minimum = m[i][columnIndex];

		}
		return minimum;
	}

}