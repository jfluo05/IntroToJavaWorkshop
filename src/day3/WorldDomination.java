package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String jump = JOptionPane.showInputDialog("Do you know how to write code?");

		// 2. If they say "yes", tell them they will rule the world.
		if (jump.equals("yes")) {
			JOptionPane.showMessageDialog(null, "You will rule the world someday");
		} else {
			JOptionPane.showMessageDialog(null, "Congratulations! You have earned the right to wash the dishes!");
		}
	}
}