package projekt_Bildbearbeitung_AxelSchlewing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class PanelBild extends JPanel {

	private static final long serialVersionUID = -8128235992253708909L;
	
	private Image bild;
	private int skalierung;
	
	
	public Image getBild() {
		return this.bild;
		}

	public void setBild(Image bild) {
		this.bild = bild;
		}
	
	public int getSkalierung() {
		return skalierung;
		}

	public void setSkalierung(int breite) {
		this.skalierung = breite;
		}

	
	protected void paintComponent(Graphics g) {
		if(this.getBild()!=null) {
			
			g.drawImage(this.getBild(), 0, 0, 320, 320, null);
						
			}
		
		else {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, 320, 320);
		}
			
		this.revalidate();
		this.repaint();
	}
	
	public PanelBild(int x, int y) {
				
		this.setBounds(x, y, 320, 320);
		this.setBackground(Color.BLACK);
		this.revalidate();
		this.repaint();
		}
}
