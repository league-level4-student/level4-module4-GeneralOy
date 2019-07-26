package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph {

	RedMorph(int x, int y) {
		super(x, y, 30, 30, 0, 0);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(getX(), getY(), getWidth(), getLength());
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
