package sep20;

import javax.swing.JOptionPane;

public class QuizQuestion {
	public static void main(String[] args) {
		//reading input from user
		String input = JOptionPane.showInputDialog("What is Professor Snape's first name?");
		// checking if the answer is Severus
		if (input.equalsIgnoreCase("Severus")) {
			JOptionPane.showMessageDialog(null, "That is correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Sorry,wrong answer");

		}
	}
}
