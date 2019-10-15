import javax.swing.JOptionPane;

public class PrintGrade {
	public static void main(String[] args) {
		int testScore; // variable to score int score
		String message="";
		// reading user input and converting the integer to string
		testScore = Integer
				.parseInt(JOptionPane.showInputDialog("Enter your numeric test score and I will tell you the grade: "));
		// Display the grade.
		if (testScore >= 90)
			message="Your score of " + testScore + " is an A.";
		else if (testScore >= 80)
			message="Your score of " + testScore + "e is a B.";
		else if (testScore >= 70)
			message="Your score of " + testScore + " is a C.";
		else if (testScore >= 60)
			message="Your score of " + testScore + " is a D.";
		else
			message="Your score of " + testScore + " is an F.";
		JOptionPane.showMessageDialog(null, message);
	}
}
