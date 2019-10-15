package Sep16;

import java.util.Scanner;

public class LongestPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Longest Palindrome: "+findLongestPalindrome(sc));
	}

	// takes series of words from user
	//returns longest palindrome among them
	public static String findLongestPalindrome(Scanner sc) {
		String s="";
		String longestPal="";
		while(!s.equalsIgnoreCase("Quit")){
			s=sc.nextLine();
			if(isPalindrome(s)){
				if(s.length()>longestPal.length())
					longestPal=s;
			}
		}
		return longestPal;
	}

	
	//checks given string is palindrome or not
	public static boolean isPalindrome(String s) {
		char aC[]=s.toCharArray();
		int i=0,j=s.length()-1;
		//iterating from the both ends
		while(i<j){
			if(aC[i]!=aC[j]){
				return false;
			}
			i++;j--;
		}
		return true;
	}
}
