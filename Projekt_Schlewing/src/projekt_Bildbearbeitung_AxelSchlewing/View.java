package projekt_Bildbearbeitung_AxelSchlewing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame {

	
	private static final long serialVersionUID = -2729326972881923649L;
	
	private int ergebnis;
	private JPanel MainPanel;
	private PanelBild panel_links;
	private PanelBild panel_rechts;
	
	private BufferedImage Image_rechts;
	
	private JButton btnDateiLaden,
					btnDateiSpeichern,
					btnWeichzeichnen,
					btnKantendetektion,
					btnSobelFilter,
					btnGraustufen,
					btnRuecksetzen,
					btnInvertieren,
					btnKern,
					btnEnde;
		
	
	
	public View() {
		
		this.frameInit();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 960, 600);
		this.setTitle("BILDBEARBEITUNG        Projektarbeit aus Java-Kurs 2020        Axel Schlewing");
		this.setBackground(Color.DARK_GRAY);
		this.setVisible(true);
	
		// Panel initialisieren
				this.setMainPanel(new JPanel());
				this.getMainPanel().setLayout(null);
				this.getMainPanel().setBackground(Color.DARK_GRAY);
				this.setContentPane(this.getMainPanel());
				
		// Buttons hinzufügen
				this.setBtnDateiLaden(new JButton("Datei laden"));
				this.getBtnDateiLaden().setName("Datei laden");
				this.getBtnDateiLaden().setFont(new Font("Arial", Font.PLAIN, 12));
				this.getBtnDateiLaden().setBounds(660, 50, 125, 32);
				this.getBtnDateiLaden().setBackground(Color.YELLOW);
				
				this.setBtnDateiSpeichern(new JButton("Datei speichern"));
				this.getBtnDateiSpeichern().setName("Datei speichern");
				this.getBtnDateiSpeichern().setFont(new Font("Arial", Font.PLAIN, 12));
				this.getBtnDateiSpeichern().setBounds(660, 82, 125, 32);
				this.getBtnDateiSpeichern().setBackground(Color.WHITE);
				
				this.setBtnWeichzeichnen(new JButton("Weichzeichnen"));
				this.getBtnWeichzeichnen().setName("Weichzeichnen");
				this.getBtnWeichzeichnen().setFont(new Font("Arial", Font.PLAIN, 12));
				this.getBtnWeichzeichnen().setBounds(660,114,125,32);
				this.getBtnWeichzeichnen().setBackground(Color.WHITE);
				
				this.setBtnGraustufen(new JButton("Graustufen"));
			  	this.getBtnGraustufen().setName("Graustufen");
				this.getBtnGraustufen().setFont(new Font("Arial", Font.PLAIN, 12));
				this.getBtnGraustufen().setBounds(660,146,125,32);
				this.getBtnGraustufen().setBackground(Color.WHITE);
							
				this.setBtnKantendetektion(new JButton("Kantendetektion"));
				this.getBtnKantendetektion().setName("Kantendetektion");
				this.getBtnKantendetektion().setFont(new Font("Arial", Font.PLAIN, 12));
				this.getBtnKantendetektion().setBounds(660,178,125,32);
				this.getBtnKantendetektion().setBackground(Color.WHITE);
						
				this.setBtnSobelFilter(new JButton("Sobel Filter"));
				this.getBtnSobelFilter().setName("Sobel Filter");
				this.getBtnSobelFilter().setFont(new Font("Arial", Font.PLAIN, 12));
				this.getBtnSobelFilter().setBounds(660,210,125,32);
				this.getBtnSobelFilter().setBackground(Color.WHITE);
							
				this.setBtnRuecksetzen(new JButton("Zurücksetzen"));
				this.getBtnRuecksetzen().setName("Zurücksetzen");
				this.getBtnRuecksetzen().setFont(new Font("Arial", Font.PLAIN, 12));
				this.getBtnRuecksetzen().setBounds(660,242,125,32);
				this.getBtnRuecksetzen().setBackground(Color.WHITE);
				
				this.setBtnInvertieren(new JButton("Invertieren"));
				this.getBtnInvertieren().setName("Invertieren");
				this.getBtnInvertieren().setFont(new Font("Arial", Font.PLAIN, 12));
				this.getBtnInvertieren().setBounds(660,274,125,32);
				this.getBtnInvertieren().setBackground(Color.WHITE);
				
				this.setBtnKern(new JButton("Eigener Kern"));
				this.getBtnKern().setName("Kern");
				this.getBtnKern().setFont(new Font("Arial", Font.PLAIN, 12));
				this.getBtnKern().setBounds(660,306,125,32);
				this.getBtnKern().setBackground(Color.WHITE);
				
				this.setBtnEnde(new JButton("ENDE"));
				this.getBtnEnde().setName("Ende");
				this.getBtnEnde().setFont(new Font("Arial", Font.PLAIN, 12));
				this.getBtnEnde().setBounds(660,338,125,32);
				this.getBtnEnde().setBackground(Color.RED);
							
		// zwei Leinwände
				this.setPanel_links(new PanelBild(5, 50));
				this.setPanel_rechts(new PanelBild(335, 50));
			
				
		// Buttons hinzufügen und sichtbar machen
				this.getMainPanel().add(this.getBtnDateiLaden());
				this.getMainPanel().add(this.getBtnGraustufen());
				this.getMainPanel().add(this.getBtnDateiSpeichern());
				this.getMainPanel().add(this.getBtnKantendetektion());
				this.getMainPanel().add(this.getBtnRuecksetzen());
				this.getMainPanel().add(this.getBtnSobelFilter());
				this.getMainPanel().add(this.getBtnWeichzeichnen());
				this.getMainPanel().add(this.getBtnInvertieren());
				this.getMainPanel().add(this.getBtnKern());
				this.getMainPanel().add(this.getBtnEnde());
				
				
				this.getMainPanel().add(this.getPanel_links());
				this.getMainPanel().add(this.getPanel_rechts());
				
				this.revalidate();
				this.getMainPanel().setVisible(true);
	}

	
	public int getErgebnis() {
		return ergebnis;
	}

	public void setErgebnis(int ergebnis) {
		this.ergebnis = ergebnis;
	}
	
	public void Ausgabe (int ergebnis) {
		System.out.println(ergebnis);
	}


	public JPanel getMainPanel() {
		return MainPanel;
	}


	public void setMainPanel(JPanel mainPanel) {
		MainPanel = mainPanel;
	}


	public JButton getBtnDateiLaden() {
		return btnDateiLaden;
	}


	public void setBtnDateiLaden(JButton btnDateiLaden) {
		this.btnDateiLaden = btnDateiLaden;
	}
	
	
	public JButton getBtnGraustufen() {
		return btnGraustufen;
	}


	public void setBtnGraustufen(JButton btnGraustufen) {
		this.btnGraustufen = btnGraustufen;
	}


	public JButton getBtnDateiSpeichern() {
		return btnDateiSpeichern;
	}


	public void setBtnDateiSpeichern(JButton btnDateiSpeichern) {
		this.btnDateiSpeichern = btnDateiSpeichern;
	}


	public JButton getBtnWeichzeichnen() {
		return btnWeichzeichnen;
	}


	public void setBtnWeichzeichnen(JButton btnWeichzeichnen) {
		this.btnWeichzeichnen = btnWeichzeichnen;
	}


	public JButton getBtnKantendetektion() {
		return btnKantendetektion;
	}


	public void setBtnKantendetektion(JButton btnKantendetektion) {
		this.btnKantendetektion = btnKantendetektion;
	}


	public JButton getBtnSobelFilter() {
		return btnSobelFilter;
	}


	public void setBtnSobelFilter(JButton btnSobelFilter) {
		this.btnSobelFilter = btnSobelFilter;
	}


	public JButton getBtnRuecksetzen() {
		return btnRuecksetzen;
	}


	public void setBtnRuecksetzen(JButton btnRuecksetzen) {
		this.btnRuecksetzen = btnRuecksetzen;
	}


	public JButton getBtnEnde() {
		return btnEnde;
	}


	public void setBtnEnde(JButton btnEnde) {
		this.btnEnde = btnEnde;
	}

	public JButton getBtnInvertieren() {
		return btnInvertieren;
	}

	public void setBtnInvertieren(JButton btnInvertieren) {
		this.btnInvertieren = btnInvertieren;
	}
	
	public JButton getBtnKern() {
		return btnKern;
	}


	public void setBtnKern(JButton btnKern) {
		this.btnKern = btnKern;
	}


	public void addActionListenerToButtons(ActionListener al) {
		this.getBtnDateiLaden().addActionListener(al);
		this.getBtnDateiSpeichern().addActionListener(al);
		this.getBtnWeichzeichnen().addActionListener(al);
		this.getBtnKantendetektion().addActionListener(al);
		this.getBtnSobelFilter().addActionListener(al);
		this.getBtnGraustufen().addActionListener(al);
		this.getBtnRuecksetzen().addActionListener(al);
		this.getBtnEnde().addActionListener(al);
		this.getBtnInvertieren().addActionListener(al);
		this.getBtnKern().addActionListener(al);
			}


	public PanelBild getPanel_links() {
		return panel_links;
	}


	public void setPanel_links(PanelBild jPanel) {
		this.panel_links = jPanel;
	}


	public PanelBild getPanel_rechts() {
		return panel_rechts;
	}


	public void setPanel_rechts(PanelBild panel_rechts) {
		this.panel_rechts = panel_rechts;
	}


	public BufferedImage getImage_rechts() {
		return Image_rechts;
	}


	public void setImage_rechts(BufferedImage image_rechts) {
		Image_rechts = image_rechts;
	}
		
}
