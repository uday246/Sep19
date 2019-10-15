
import java.util.Scanner;

public class Part1 {

	static String question = "Louvre Museum is located ";

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Where "+question + " : ");

		String answer = keyboard.nextLine();

		System.out.println(question + " in " + answer);

	}

}