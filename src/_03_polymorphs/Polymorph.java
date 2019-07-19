package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	private int x;
	private int y;
	private int width;
	private int length;
	private int xSpeed;
	private int ySpeed;

	Polymorph(int x, int y, int width, int length, int xspeed, int yspeed) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.length = length;
		this.xSpeed = xspeed;
		this.ySpeed = yspeed;
	}

	public void setX(int xS) {
		this.x = xS;
	}

	public void setY(int yS) {
		this.y = yS;
	}

	public int getX() {
		return x;

	}

	public int getY() {
		return y;

	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return this.width;
	}

	public int getLength() {
		return this.length;
	}

	public void update() {
		if(xSpeed > 0 || ySpeed > 0)
	}

	public abstract void draw(Graphics g);
}
