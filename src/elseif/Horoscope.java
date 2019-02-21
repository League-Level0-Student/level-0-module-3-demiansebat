package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String tell = JOptionPane.showInputDialog("What is your horoscope!?");
		if (tell.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "Courageous, energetic, willful, commanding, leading");

		}

		else if (tell.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null,
					"Pleasure seeking, loves control, dependable, grounded, provokes slowly,sensual in nature.");
		} else if (tell.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null,
					"Cerebral, chatty, loves learning and education, charming, and adventurous.");
		} else if (tell.equalsIgnoreCase("Cancer")) {
		
		JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family.\n" + "");
	}
	else if (tell.equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null,"Generous, organized, protective, beautiful.");
	}
	else if (tell.equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null,"Particular, logical, practical, sense of duty, critical");
	}
	else if (tell.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null,"Balanced, seeks beauty, sense of justice.\n" + 
				"");
	}
		
	}}