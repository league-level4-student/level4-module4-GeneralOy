package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;
	Random r = new Random();
	ArrayList<Polymorph> Morphs = new ArrayList<Polymorph>();
	Polymorph bluePoly1;
	Polymorph redMorph1;
	Polymorph MovingMorph1;
	Polymorph MovingMorph2;
	Polymorph MovingMorph3;
	Polymorph MovingMorph4;
	Polymorph MovingMorph5;
	Polymorph MovingMorph6;
	Polymorph MovingMorph7;
	Polymorph CircleMorph1;
	Polymorph CircleMorph2;
	Polymorph CircleMorph3;
	Polymorph CircleMorph4;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		bluePoly1 = new BluePolymorph(r.nextInt(450), r.nextInt(450));
		redMorph1 = new RedMorph(r.nextInt(480), r.nextInt(480));
		MovingMorph1 = new MovingMorph(r.nextInt(480), r.nextInt(480));
		MovingMorph2 = new MovingMorph(r.nextInt(480), r.nextInt(480));
		MovingMorph3 = new MovingMorph(r.nextInt(480), r.nextInt(480));
		CircleMorph1 = new CircleMorph(r.nextInt(490), r.nextInt(490));
		CircleMorph2 = new CircleMorph(r.nextInt(490), r.nextInt(490));
		CircleMorph3 = new CircleMorph(r.nextInt(490), r.nextInt(490));
		CircleMorph4 = new CircleMorph(r.nextInt(490), r.nextInt(490));
		Morphs.add(bluePoly1);
		Morphs.add(redMorph1);
		Morphs.add(MovingMorph1);
		Morphs.add(MovingMorph2);
		Morphs.add(MovingMorph3);
		Morphs.add(CircleMorph1);
		Morphs.add(CircleMorph2);
		Morphs.add(CircleMorph3);
		Morphs.add(CircleMorph4);

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);
		for (Polymorph M : Morphs) {
			M.draw(g);
		}
		// draw polymorph
		// bluePoly.draw(g);
		// redMorph.draw(g);
		// greenMovingMorph.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph M : Morphs) {
			M.update();
		}
		// bluePoly.update();
		// redMorph.update();
		// greenMovingMorph.update();

	}
}
