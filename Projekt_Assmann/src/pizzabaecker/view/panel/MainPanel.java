package pizzabaecker.view.panel;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import pizzabaecker.model.pizza.IIngredient;

public class MainPanel extends JPanel implements Observer {
	
	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -855362779170665474L;
	private BufferedImage image;

	/*
	 * Constructor
	 */
	public MainPanel() {
		super();
		super.setLayout(new BorderLayout());
		
		// Hintergrundbild, bzw. erstes was gezeichnet wird
		try {
			image  = ImageIO.read(new File("./images/", "brettchen2.png"));
			repaint();
		} catch(Exception e) {
			System.out.println("Hintergundbild nicht gefunden!");
		}
		
		super.setVisible(true);
	}
	
	// zum Zeichnen des BufferedImage image
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // ganz wichtig!
        g.drawImage(image, 0, 0, this);             
    }
	
	// Observer method, entprechend des IIngredient wird ein Bild hinzugefuegt
	@Override
	public void update(Observable o, Object arg) {
		
		if(arg instanceof IIngredient) {
			// zwei BufferedImage um diese zu ueberlagern
			BufferedImage a = null, b = null;
			
			try {
				if(image == null) {
					// falls es keinen Hintergrund gibt und noch kein IIngredient hinzugefuegt wurde
					a = ImageIO.read(new File("./images/", ((IIngredient)arg).getName() + ".png"));
					b = a;
				} else {
					// nimm das aktuelle bild (image->a) und fuege ein neues (b) an
					a = image;
					b = ImageIO.read(new File("./images/", ((IIngredient)arg).getName() + ".png"));
				}
				// kombiniere beide Bilder und pack es in das Instanzfeld image
				image = new BufferedImage(a.getWidth(), a.getHeight(), BufferedImage.TYPE_INT_ARGB);
				
				// Zeichne:
				Graphics g = image.createGraphics();

				g.drawImage(a, 0, 0, null);
				g.drawImage(b, 0, 0, null);

				this.repaint();
				g.dispose();
				
				// debugzeile
//				System.out.println("PizzaImage updated");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Fehler beim einlesen der Bilder");
				System.out.println(a);
				System.out.println(b);
			}
			
		}
		
	}

}
