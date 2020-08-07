package zeitner.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class MyCanvas extends JPanel {

	private static final long serialVersionUID = -7793649019898462909L;
	private void drawFace(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(300, 100, 50, 100);
		g.fillOval(450, 100, 50, 100);
		
		g.setColor(Color.BLACK);
		g.fillOval(300, 150, 50, 50);
		g.fillOval(450, 150, 50, 50);
		
		g.setColor(Color.RED);
		g.fillOval(300, 250, 200, 100);
		
		g.fillOval(300, 375, 200, 100);
		g.setColor(Color.BLACK);
		g.fillOval(350, 400, 100, 50);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2.draw(new Line2D.Double(10,10, super.getWidth()-10, super.getHeight()-30));
		
		//g.drawLine(10, 10,super.getWidth()-10, super.getHeight()-30);
		this.drawFace(g);
	}
	public MyCanvas() {
		super.setVisible(true);
	}
}
