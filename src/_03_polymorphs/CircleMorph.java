package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class CircleMorph extends Polymorph{
	double angle = 0;
	static Random r = new Random();
	double DAng = r.nextInt(20);
	int rand = 3 + r.nextInt(40);
	Color colored = Color.getHSBColor(r.nextInt(360), r.nextInt(100), r.nextInt(100));
	int orgX = getX();
	int orgY = getY();
	CircleMorph(int x, int y) {
		super(x, y, 10, 10, 0, 0);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(colored);
		g.fillRect(getX(), getY(), getWidth(), getLength());
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		angle += DAng / 100;
		if(angle >= 360) {
			angle -= 360;
		}
		setX((int) (orgX + (rand * Math.cos(angle))));
		setY((int) (orgY + (rand * Math.sin(angle))));
		
	}
}
