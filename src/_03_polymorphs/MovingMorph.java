package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

public class MovingMorph extends Polymorph {
	static Random rand = new Random();
	Color colored = Color.getHSBColor(rand.nextInt(360), rand.nextInt(100), rand.nextInt(100));

	MovingMorph(int x, int y/* , int xSpeed, int ySpeed */) {

		super(x, y, 20, 20, 10 - rand.nextInt(20), 10 - rand.nextInt(20));
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(colored);
		g.fillRect(getX(), getY(), getWidth(), getLength());
	}

	@Override
	public void update() {
		if (getX() >= 500 - getWidth() || getX() <= 0) {
			setXSpeed(-getXSpeed());
		}
		if (getY() >= 500 - getLength() || getY() <= 0) {
			setYSpeed(-getYSpeed());
		}
		if (getXSpeed() != 0 || getYSpeed() != 0) {
			setX(getX() + getXSpeed());
			setY(getY() + getYSpeed());
		}
	}
	// TODO Auto-generated method stub

}
