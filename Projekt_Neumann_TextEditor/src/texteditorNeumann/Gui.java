package texteditorNeumann;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.UIManager;


public class Gui implements Icrypto  {
	 static JTextArea txtArea;
	JFrame frame;
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		frame.setTitle("Mein TextEditor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(50,50,800,600);
		
		// Setup des Panels
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(700, 500));
		
		frame.setContentPane(panel);
		
		// Definition des Fonts 
		Font font = new Font ("Arial", Font.PLAIN, 20);
		// JTextArea 
		txtArea = new JTextArea();
		txtArea.setLayout(new FlowLayout(FlowLayout.LEFT, 10,10));
		txtArea.setBounds(10, 10, 600, 400);
		txtArea.setSize(600,400);
		txtArea.setFont(font);
		txtArea.setEditable(true);
		txtArea.setLineWrap(true);// Bricht am Ende der Zeile um
		txtArea.setWrapStyleWord(true);// Bricht nur am Ende von Worten um
		
		//txtArea.setText("Bitte fügen Sie hier Ihren Text ein");
	
		// Einbau eines Scrollpanes fuer laengere Texte 
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(txtArea);
		
		
		// Menubar
		JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);
		
		//Menu und MenuItems datei
		JMenu datei = new JMenu("Datei");
		menubar.add(datei);
		
		JMenuItem oeffnen = new JMenuItem ("oeffnen");
		datei.add(oeffnen);
		oeffnen.addActionListener(new MyActionListener());
		
		JMenuItem speichern = new JMenuItem ("speichern");
		datei.add(speichern);
		speichern.addActionListener(new MyActionListener());
		
		JMenuItem drucken = new JMenuItem("drucken");
		datei.add(drucken);
		drucken.addActionListener(new MyActionListener());
		
		JSeparator sep2= new JSeparator();
		datei.add(sep2);
		
		JMenuItem pschliessen = new JMenuItem("Programm schliessen");
		datei.add(pschliessen);
		pschliessen.addActionListener(new MyActionListener());
		
		
		
		// Menu und MenuItems Textfeld 
		JMenu text = new JMenu("Text");
		menubar.add(text);
		
		JMenuItem loeschen = new JMenuItem("loeschen");
		text.add(loeschen);
		loeschen.addActionListener (new MyActionListener());
		
		JMenuItem zaehlen = new JMenuItem ("Zeichen zaehlen");
		text.add(zaehlen);
		zaehlen.addActionListener(new MyActionListener());
		
		JSeparator sep = new JSeparator();
				text.add(sep);
		
		JMenu verschluesseln = new JMenu ("verschluesseln");
		text.add(verschluesseln);
		
		
		JMenuItem einfach = new JMenuItem("einfache Verschluesselung");
		verschluesseln.add(einfach);
		einfach.addActionListener(new MyActionListener());
		
		JMenuItem doppelt = new JMenuItem("doppelte Verschluesselung");
		verschluesseln.add(doppelt);
		doppelt.addActionListener(new MyActionListener());
		
		JMenu entschluesseln = new JMenu("entschluesseln");
		text.add(entschluesseln);
		
		JMenuItem enteinfach = new JMenuItem ("einfache Entschluesselung");
		entschluesseln.add(enteinfach);
				enteinfach.addActionListener(new MyActionListener ());
		
				
		JMenuItem entdoppelt = new JMenuItem("doppelte Entschluesselung");
		entschluesseln.add(entdoppelt);
		entdoppelt.addActionListener(new MyActionListener());
	
		//Menu Format aendern 
		JMenu format = new JMenu ("Format");
		menubar.add(format);
		
		JMenuItem bold = new JMenuItem ("bold");
		format.add(bold);
		bold.addActionListener (new MyActionListener());
		
		JMenuItem italic = new JMenuItem ("italic");
		format.add(italic);
		italic.addActionListener(new MyActionListener());
		
		JMenuItem kleiner = new JMenuItem("Schrift kleiner");
		format.add(kleiner);
		kleiner.addActionListener(new MyActionListener());
		
		JMenuItem groesser = new JMenuItem ("Schrift groesser");
		format.add(groesser);
		groesser.addActionListener(new MyActionListener());
		
		
		
		
		
		
	
		
		
		
		// Hinzufügen der Elemente  zum Panel
		
		//panel.add(txtArea);
		panel.add(scrollPane);

		frame.setVisible(true);
		
	}

	
}
