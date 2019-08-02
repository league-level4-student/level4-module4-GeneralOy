package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

public class MouseMorph extends Polymorph{
	static Random r = new Random();

	Color coloring = Color.getHSBColor(r.nextInt(360), r.nextInt(100), r.nextInt(100));
	MouseMorph() {
		super(1, 1, 5, 5, 0, 0);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(coloring);
		g.fillRect(getX(), getY(), getWidth(), getLength());
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		
	}
	
}
