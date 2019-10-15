package sep20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PalindromeGui {
	static JFrame frame = new JFrame("Palindrome Checker");

	public static void main(String s[]) {
		JPanel panel = new JPanel();
		panel.setLayout(null);

		//label
		final JTextField input = new JTextField(10);
		input.setBounds(320, 100, 100, 30);

		//textfield to read input
		JLabel label2 = new JLabel("Enter word: ");
		label2.setBounds(200, 100, 250, 30);

		// button to check
		JButton check = new JButton();
		check.setText("Check");
		check.setBounds(200, 150, 250, 20);

		//label to display result
		JLabel result = new JLabel("");
		result.setBounds(200, 200, 300, 30);

		//action listener to check on click of button
		check.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent aE) {
				//taking user entered text
				String a = input.getText();
				
				if (isPalindrome(a)) {
					result.setText(a+ " is palindrome");
				} else {
					result.setText(a+ " is not a palindrome");
				}

			}
			
			//checking if given string is palidrome or not
			private boolean isPalindrome(String a) {
				a=a.toLowerCase();
				char aC[] = a.toCharArray();

				int i = 0, j = a.length() - 1;
				while (i < j) {
					if (aC[i] != aC[j]) {
						return false;
					}
					i++;
					j--;
				}
				return true;
			}
		});

		panel.add(label2);
		panel.add(input);
		panel.add(check);
		panel.add(result);
		frame.add(panel);

		frame.setSize(600, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
