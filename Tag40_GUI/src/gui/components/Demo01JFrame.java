package gui.components;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo01JFrame {
	public static void main(String[] args) {
		//JFrame ist der Rahmen der GUI
		//Im Frame werden alle Elemente plaziert
		JFrame frame = new JFrame();
		//Titel setzen
		frame.setTitle("Demo01JFrame");
		//Programm beenden beim schliessen des Fensters
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Groesse und Position auf dem Monitor festlegen
		frame.setBounds(600, 300, 640, 480);
		//Panel erstellen
		JPanel panel = new JPanel();
		//Farbe des Panels aendern
		panel.setBackground(Color.BLUE);
		//Dem Frame das Panel hinzufuegen
		frame.setContentPane(panel);
		//Das Frame sichtbar machen
		//Sollte immer als letztes passieren
		//damit alles sauber gezeichnet wird
		frame.setVisible(true);
		
	}
}
