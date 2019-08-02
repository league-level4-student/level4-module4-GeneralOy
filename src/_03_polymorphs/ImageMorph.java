package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{
	BufferedImage img = null;
	ImageMorph(int x, int y) {
		super(x, y, 50, 50, 0, 0);
		try {
		    img = ImageIO.read(new File("Pepe.png"));
		} catch (IOException e) {
		}
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(img, getX(), getY(), null);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
