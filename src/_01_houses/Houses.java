package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
public static void main(String[] args) {
	Robot rob = new Robot();
	rob.moveTo(100,500);
	rob.penDown();
	rob.setSpeed(15);
	rob.setPenColor(0, 200, 00);
	rob.setPenWidth(4);
	rob.turn(36000);
	rob.move(100);
	rob.turn(90);
	rob.move(40);
	rob.turn(90);
	rob.move(100);
	rob.turn(270);
	rob.move(30);
}
}
