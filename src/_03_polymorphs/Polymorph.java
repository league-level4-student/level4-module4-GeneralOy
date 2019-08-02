package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	private int x;
	private int y;
	private int width;
	private int length;
	private int xSpeed;
	private int ySpeed;
	private int xoffset;
	private int yoffset;

	Polymorph(int x, int y, int width, int length, int xspeed, int yspeed) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.length = length;
		this.xSpeed = xspeed;
		this.ySpeed = yspeed;
	}

	public void setX(int xN) {
		this.x = xN;
	}

	public void setY(int yN) {
		this.y = yN;
	}

	public int getX() {
		return x;

	}

	public int getY() {
		return y;

	}
	public void setXSpeed(int xS) {
		this.xSpeed = xS;
	}

	public void setYSpeed(int yS) {
		this.ySpeed = yS;
	}

	public int getXSpeed() {
		return xSpeed;

	}

	public int getYSpeed() {
		return ySpeed;

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

	public abstract void update();

	public abstract void draw(Graphics g);

	public int getYoffset() {
		return yoffset;
	}

	public void setYoffset(int yoffset) {
		this.yoffset = yoffset;
	}

	public int getXoffset() {
		return xoffset;
	}

	public void setXoffset(int xoffset) {
		this.xoffset = xoffset;
	}
}
