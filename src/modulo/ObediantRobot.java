package modulo;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
public static void main(String[] args) {
	drawSquare();
	drawTriangle();
}
static Robot randy = new Robot();

static void drawSquare() {
	
	randy.setPenWidth(3);
	randy.penDown();
	randy.setSpeed(25);
	randy.move(150);
	randy.turn(90);
	randy.move(150);
	randy.turn(90);
	randy.move(150);
	randy.turn(90);
	randy.move(150);
}
static void drawTriangle() {
	
	randy.setPenWidth(3);
	randy.penDown();
	randy.setSpeed(25);
	randy.turn(144);
	randy.move(150);
	randy.turn(144);
	randy.move(150);
	
}}
