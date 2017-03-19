package day3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String location = JOptionPane.showInputDialog("Where do you live?");
		String SSN = JOptionPane.showInputDialog("What is your Social Security #?");
		String CCN = JOptionPane.showInputDialog("What is your Credit Card Number");
		String crime = JOptionPane.showInputDialog("Have you ever robbed a bank? Murdered someone?");
		JOptionPane.showMessageDialog(null,
				"Thank you for taking this servey we will report the information back to you.Let me get this straight. You live at"
						+ location);
		JOptionPane.showMessageDialog(null, "Your Social Security Number is" + SSN);
		JOptionPane.showMessageDialog(null, "Your Credit Card Number is" + CCN);
		JOptionPane.showMessageDialog(null, "Your record for crime is" + crime);

	}
}
