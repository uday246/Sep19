package sep20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewWindow {
	static JFrame frame = new JFrame("JFrame Example");

	public static void main(String s[]) {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JLabel label1 = new JLabel("Height");
		label1.setBounds(200, 50, 150, 30);
		//textField for height
		final JTextField height = new JTextField(10);
		height.setBounds(300, 50, 100, 30);

		JLabel label2 = new JLabel("Width");
		label2.setBounds(200, 100, 150, 30);
		//textField for width
		final JTextField width = new JTextField(10);
		width.setBounds(300, 100, 100, 30);

		JLabel label3 = new JLabel("Title");
		label3.setBounds(200, 150, 150, 30);
		//textField for title
		final JTextField title = new JTextField(10);
		title.setBounds(300, 150, 100, 30);
		//button to create new frame
		JButton login = new JButton();
		login.setText("Create Window");
		login.setBounds(300, 220, 250, 20);

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent aE) {
				//reading hieght and width and title entered by user
				int h = Integer.parseInt(height.getText());
				int w = Integer.parseInt(width.getText());
				String t = title.getText();
				//creating a new frame
				JFrame f = new JFrame(t);
				//setting the size
				f.setSize(w, h);
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}
		});

		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(height);
		panel.add(width);
		panel.add(title);
		panel.add(login);
		frame.add(panel);

		frame.setSize(600, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
