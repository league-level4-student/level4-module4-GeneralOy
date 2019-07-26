package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{

	BluePolymorph(int x, int y) {
		super(x, y, 50, 50, 0, 0);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), getWidth(), getLength());
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}
