package sep20;

import java.util.Scanner;

public class LastThreeLetters {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter string that contains at least 3 lettes");
	String s=sc.nextLine();
	// we need fetch last chars
	// means length-3
	// ABCD here length is 4 we need last 3 means 4-3 =1 so we need print from 1 so BCD
	String ending = s.substring(s.length()-3);
	System.out.println("Last 3 chars: "+ending);
}
}
