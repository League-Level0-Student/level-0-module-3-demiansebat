package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		int word = JOptionPane.showConfirmDialog(null, "ARE YOU HAPPY????");
		if (word == 0) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever your doing!!!");
		}
		if (word == 1) {
			int talk = JOptionPane.showConfirmDialog(null, "Do you want to  be happy???");

			if (talk == 1) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever your doing!!!");

			}
			if (talk == 0) {
				JOptionPane.showMessageDialog(null, "CHANGE SOMETHING!!!");

			}

		}
	}
}
