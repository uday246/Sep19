package Sep19;

import javax.swing.JOptionPane;

public class PalindromePro {
	public static void main(String[] args) {
		//getting the word
		String word = getInputWord();
		//checking if it is palindrome
		if (palindromeCheck(word)) {
			JOptionPane.showMessageDialog(null, "The given String is a palindrome");
		} else {
			JOptionPane.showMessageDialog(null, "The given String is not palindrome");
		}
	}

	//checks if given string is palindrome or not
	private static boolean palindromeCheck(String word) {
		//converting into char array
		char arr[] = word.toCharArray();
		// iterating from both ends and checking for equality
		int i = 0, j = word.length() - 1;
		while (i <= j) {
			if (arr[i] != arr[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	//reading user input and returning the string
	private static String getInputWord() {
		return JOptionPane.showInputDialog("Enter word");
	}
}
