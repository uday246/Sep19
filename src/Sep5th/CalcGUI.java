package Sep5th;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcGUI extends JFrame implements ActionListener {
	
	
	
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();

		// check value is a number
		if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
			if (!s1.equals(""))
				s2 = s2 + s;
			else
				s0 = s0 + s;
			l.setText(s0 + s1 + s2);
			
		} 
		//clear all
		else if (s.charAt(0) == 'C') {
			s0 = s1 = s2 = "";
			l.setText(s0 + s1 + s2);
		} else if (s.charAt(0) == '=') {

			double te;

			// calculate based on selected button
			if (s1.equals("+"))
				te = (Double.parseDouble(s0) + Double.parseDouble(s2));
			else if (s1.equals("-"))
				te = (Double.parseDouble(s0) - Double.parseDouble(s2));
			else if (s1.equals("/"))
				te = (Double.parseDouble(s0) / Double.parseDouble(s2));
			else
				te = (Double.parseDouble(s0) * Double.parseDouble(s2));

			// set the value of text
			l.setText(s0 + s1 + s2 + "=" + te);
			s0 = Double.toString(te);
			s1 = s2 = "";
		} else {
			// if there was no operand
			if (s1.equals("") || s2.equals(""))
				s1 = s;
			// else evaluate
			else {
				double te;
				if (s1.equals("+"))
					te = (Double.parseDouble(s0) + Double.parseDouble(s2));
				else if (s1.equals("-"))
					te = (Double.parseDouble(s0) - Double.parseDouble(s2));
				else if (s1.equals("/"))
					te = (Double.parseDouble(s0) / Double.parseDouble(s2));
				else
					te = (Double.parseDouble(s0) * Double.parseDouble(s2));
				s0 = Double.toString(te);
				s1 = s;
				s2 = "";
			}
			l.setText(s0 + s1 + s2);
		}
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// create a frame
	static JFrame f;

	// create a textfield
	static JTextField l;

	// store oprerator and operands
	String s0, s1, s2;

	// default constrcutor
	CalcGUI() {
		s0 = s1 = s2 = "";
	}

	// main function
	public static void main(String args[]) {
		f = new JFrame("Calculator");
		CalcGUI c = new CalcGUI();
		l = new JTextField(16);
		l.setEditable(false);
		// create number buttons and some operators
		JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;

		// creating number buttons
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");

		// equals button
		beq1 = new JButton("=");

		// create operator buttons
		ba = new JButton("+");
		bs = new JButton("-");
		bd = new JButton("/");
		bm = new JButton("*");
		beq = new JButton("C");

		// create . button
		be = new JButton(".");

		// create a panel
		JPanel p = new JPanel();

		// add action listeners
		

		// add elements to panel
		p.add(l);
		
		p.add(b0);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(ba);
		p.add(bs);
		p.add(bm);
		p.add(bd);
		p.add(be);
		p.add(beq);
		p.add(beq1);

		f.add(p);
		f.setSize(500, 500);
		f.setVisible(true);
		p.setLayout(new GridLayout(4, 4));
		
		//regestering all the buttons with the listener
		b0.addActionListener(c);
		b1.addActionListener(c);
		b2.addActionListener(c);
		b3.addActionListener(c);
		b4.addActionListener(c);
		b5.addActionListener(c);
		b6.addActionListener(c);
		b7.addActionListener(c);
		b8.addActionListener(c);
		b9.addActionListener(c);
		be.addActionListener(c);
		beq.addActionListener(c);
		beq1.addActionListener(c);
		
		bm.addActionListener(c);
		bd.addActionListener(c);
		bs.addActionListener(c);
		ba.addActionListener(c);
	}

	
}