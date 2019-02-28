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
		
		JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family");
	}
	else if (tell.equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null,"Generous, organized, protective, beautiful.");
	}
	else if (tell.equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null,"Particular, logical, practical, sense of duty, critical.");
	}
	else if (tell.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null,"Balanced, seeks beauty, sense of justice.");
	}
	else if (tell.equalsIgnoreCase("Scorpio")){
		JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective.");
	}
	else if (tell.equalsIgnoreCase("Sagittarius")){
		JOptionPane.showMessageDialog(null, "Happy, absent minded, creative, adventurous.");
	}
	else if (tell.equalsIgnoreCase("Capricorn")){
		JOptionPane.showMessageDialog(null, "Timeless, driven, calculating, ambitious.");	
	}
	else if (tell.equalsIgnoreCase("Aquarius")){
		JOptionPane.showMessageDialog(null, "Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");	
	}
	else if (tell.equalsIgnoreCase("Pisces")){
		JOptionPane.showMessageDialog(null, "Likeable, energetic, passionate, sensitive.");	
	}
	else {
		JOptionPane.showMessageDialog(null, "That's not a horoscope STUPID...");
	}
	}
	}