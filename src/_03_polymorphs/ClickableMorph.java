package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class ClickableMorph extends Polymorph {

	ClickableMorph(int x, int y) {
		super(x, y, 30, 30, 0, 0);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getLength());
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
