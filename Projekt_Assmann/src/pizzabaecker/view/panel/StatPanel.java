package pizzabaecker.view.panel;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class StatPanel extends JPanel implements Observer {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -875479197917450302L;
	private ArrayList<JLabel> statList;

	/*
	 * Getter/Setter
	 */
	private ArrayList<JLabel> getStatList() {
		return statList;
	}
	private void setStatList(ArrayList<JLabel> statList) {
		this.statList = statList;
	}

	/*
	 * Constructor
	 */
	public StatPanel() {
		super();
		super.setLayout(new GridBagLayout());
		
		this.setStatList(new ArrayList<JLabel>());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
	
		// Ueberschrift
		JLabel statLabel = new JLabel("Stats:", SwingConstants.CENTER);
		statLabel.setFont(new Font(statLabel.getFont().getFontName(), Font.BOLD, 16));
		statLabel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		this.add(statLabel, gbc);
		
		// Stat-Namen
		JLabel labelKaese = new JLabel("Kaese");
		Font statFont = new Font(labelKaese.getFont().getFontName(), Font.PLAIN, 12);
		labelKaese.setFont(statFont);
		gbc.gridwidth = 1;
		gbc.gridy = 1;
		this.add(labelKaese, gbc);
		
		JLabel labelChili = new JLabel("Chili");
		labelChili.setFont(statFont);
		gbc.gridy = 2;
		this.add(labelChili, gbc);
		
		JLabel labelSchinken = new JLabel("Schinken");
		labelSchinken.setFont(statFont);
		gbc.gridy = 3;
		this.add(labelSchinken, gbc);
		
		JLabel labelZwiebel = new JLabel("Zwiebel");
		labelZwiebel.setFont(statFont);
		gbc.gridy = 4;
		this.add(labelZwiebel, gbc);
		
		JLabel labelSalami = new JLabel("Salami");
		labelSalami.setFont(statFont);
		gbc.gridy = 5;
		this.add(labelSalami, gbc);
		
		// Fuege Statlabel zur Liste hinzu
		for(int i=0;i<5;i++) {
			JLabel addthis = new JLabel("0");
			addthis.setFont(statFont);
			this.getStatList().add(addthis);
		}
		
		// Plaziere Stats auf dem UI
		gbc.insets = new Insets(0,20,0,0);
		for(int i=0;i<this.getStatList().size();i++) {
			gbc.gridx = 1;
			gbc.gridy = i+1;	
//			this.getStatList().get(i).setBorder(BorderFactory.createEmptyBorder(5,0,5,0));
			this.add(this.getStatList().get(i), gbc);
		}
		
		super.setVisible(true);				
	}

	/*
	 * Methods
	 */
	
	// Observer update, bekommt in[] und packt daten in die Statlabel in der Liste
	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof int[]) {
			for(int i=0;i<this.getStatList().size();i++) {	
				this.getStatList().get(i).setText("" + ((int[])arg)[i]);
			}
		}
	}

}