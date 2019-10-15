
public class Project {
	public static void main(String[] args) {
		// defining an array of 25 intergers
		int[] Array = new int[25];

		// even numbers
		for (int i = 0, j = 2; i < Array.length; i++, j += 2)
			Array[i] = j;
		for (int i = 0; i < Array.length; i++)
			System.out.print(Array[i]+" ");

	}
}