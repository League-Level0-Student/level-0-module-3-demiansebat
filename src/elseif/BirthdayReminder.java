
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August 21st";
		String dadsBirthday = "June 14th";
		String myBirthday = "August 9th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String answer=JOptionPane.showInputDialog("What Birthday do yout want?");
		// 3. Print out what the user typed
	System.out.println(answer);
		// 4. if user asked for "mom"
	if (answer.equalsIgnoreCase("mom")) {
		JOptionPane.showMessageDialog(null,"August 21st" );
			//print mom's birthday
	}
	else if (answer.equalsIgnoreCase("dad")) {
		JOptionPane.showMessageDialog(null,"June 14th" );
	}
	else if (answer.equalsIgnoreCase("kid")) {
		JOptionPane.showMessageDialog(null,"August 9th" );
	}
	else {
		JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday...");
	}
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
