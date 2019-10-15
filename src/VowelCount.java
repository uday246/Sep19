import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args) {
		
		System.out.println((char)(224));
		System.out.println("H : "+(int)'H'+" : "+Integer.toBinaryString('H'));
		System.out.println();
		System.out.println("! : "+(int)'!'+" : "+Integer.toBinaryString('!'));
		System.out.println();
		System.out.println("H : "+(int)'H'+" : "+Integer.toBinaryString('H'));
		System.out.println("e : "+(int)'e'+" : "+Integer.toBinaryString('e'));
		System.out.println("l : "+(int)'l'+" : "+Integer.toBinaryString('l'));
		System.out.println("l : "+(int)'l'+" : "+Integer.toBinaryString('l'));
		System.out.println("o : "+(int)'o'+" : "+Integer.toBinaryString('o'));
		System.out.println("! : "+(int)'!'+" : "+Integer.toBinaryString('!'));
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentense: ");
		String str = sc.nextLine().toLowerCase();
		System.out.println("The locations of vowels are: ");
		int count = 0, nonChar = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				System.out.print(i + " ");
				count++;
			}
			if (!Character.isAlphabetic(str.charAt(i)) && str.charAt(i)!=' ')
				nonChar++;
		}
		System.out.println("\nThe number of vowels is: " + count);
		System.out.println("The number of characters as numbers or special characters is: " + nonChar);
	}
}
