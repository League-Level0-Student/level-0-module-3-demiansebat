//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot randy;
		randy =new Robot();
		//3. Ask the user what color they would like the robot to draw
		String color;
		color=
		JOptionPane.showInputDialog("What color would you like the shape to be???");
		//5. Use an if/else statement to set the pen color that the user requested
if (color.equalsIgnoreCase("red")) {
	randy.setPenColor(Color.red);}
	else if (color.equalsIgnoreCase("cyan")) {
		randy.setPenColor(Color.CYAN);
}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		randy.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
randy.penDown();
randy.setSpeed(25);
randy.move(200);
randy.turn(90);
randy.move(200);
randy.turn(90);
randy.move(200);
randy.turn(90);
randy.move(200);


}}
