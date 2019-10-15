package sep20;

import javax.swing.JOptionPane;

public class YourNameExercise {
	public static void main(String[] args) {
		//reading user input
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
		int inc=0;
		//reading increment value
		while(true){
		inc = Integer.parseInt(JOptionPane.showInputDialog("Enter increment value"));
		//checking if it is valid increment value
			if(inc>0 && inc<=n){
				break;
			}
			//if not showing message
			inc = Integer.parseInt(JOptionPane.showInputDialog("Invalid..Inc value between 1 to "+n));
		}
		//incrementing and showing to user
		for (int i = 0; i < n; i += inc) {
			JOptionPane.showMessageDialog(null, i + "");
		}
	}
}
