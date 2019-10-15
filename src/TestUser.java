import java.io.File;
import java.util.Scanner;

class User {
	private int a1;
	private int a2;
	private int a3;
	private int a4;
	private int a5;

	public User(int aA1, int aA2, int aA3, int aA4, int aA5) {
		super();
		a1 = aA1;
		a2 = aA2;
		a3 = aA3;
		a4 = aA4;
		a5 = aA5;
	}

	@Override
	public String toString() {
		return a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5 + "\n";
	}

}

public class TestUser {
	public static void main(String[] args) throws Exception {
		User[] usersArr = new User[5];

		System.out.print("Enter file name: ");
		Scanner input = new Scanner(System.in);
		String inputFile = input.nextLine();
		File myFile = new File(inputFile);
		Scanner scan = new Scanner(myFile);
		int LineCount = 0;
		while (scan.hasNextLine()) {

			usersArr[LineCount++] = new User(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(),
					scan.nextInt());
		}
		for (int i = 0; i < 5; i++)
			System.out.println(usersArr[i]);
	}
}
