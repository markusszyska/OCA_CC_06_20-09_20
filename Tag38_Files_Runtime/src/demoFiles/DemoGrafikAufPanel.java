package demoFiles;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class DemoGrafikAufPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		frame.setTitle("DemoGrafikAufPanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		MeinPanel panel = new MeinPanel();
		
		frame.setContentPane(panel);
				
		frame.setVisible(true);
	}
	
}



class MeinPanel extends JPanel{
	
	BufferedImage img;
	
	public MeinPanel() {
		try {
			/*
			 * Um Dateien zu laden, die sich innerhalb eines Jar Files befinden,
			 * muss getRessource() bzw getRessourceAsStream() genutzt werden.
			 */
//			img = ImageIO.read(MeinPanel.class.getResource("/rkt.png"));
			/*
			 * Mit File Objekt geht nur Aus Eclipse. 
			 * Wenn das Projekt als Jar File exportiert wird muss sich die Datei
			 * ausserhalb des Jar Files befinden.
			 */
			img = ImageIO.read(new File("ressources/rkt.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.drawImage(img, 100, 100, 80, 100, null);
				
		g.setColor(Color.black);
		g.setFont(new Font("Arial", Font.PLAIN, 40));
		g.drawString("Ein String", 10, 30);
	
	}
	
}