package assmann.taschenrechner.gui.textfield;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AusgabeTextfeld extends JTextField implements IAusgabeTextfeld {
	
	private static final long serialVersionUID = -7425819148425567395L;
	private boolean lastEntryOperator = false;
	
	private boolean isLastEntryOperator() {
		return lastEntryOperator;
	}

	private void setLastEntryOperator(boolean lastEntryOperator) {
		this.lastEntryOperator = lastEntryOperator;
	}

	public AusgabeTextfeld() {
		super.setHorizontalAlignment(SwingConstants.RIGHT);
		super.setFont(super.getFont().deriveFont(32.0f));
		super.setEditable(false);
		super.setVisible(true);
	}
	
	// Fuegt Text hinzu (verwendet fuer Nummern und .)
	// Fehlt: doppelter Punkt in Zahl testen
	public void addText(String text) {
		super.setText(super.getText() + text);
		setLastEntryOperator(false);
	}
	
	/* 
	 * Fuegt Operator mit Leerzeichen hinzu, sofern
	 * bereits eine Zahl eingegeben wurde 
	 */
	public void addOperator(String operator) {
		String text = super.getText();
		if(!text.isEmpty()) {
			if(text.charAt(text.length()-1) != ' ') {
				super.setText(text + " " + operator + " ");
				setLastEntryOperator(true);
			}
		}
	}
	
	/*
	 * Entfernt allen Text
	 */
	public void removeText() {
		super.setText("");
	}
	
	/*
	 * Entfernt letzte Eingabe. Beachtet speziell Operatoren und
	 * Vorzeichen, sowei den Anfang der Eingabe
	 */
	public void removeOneSpace() {
		String text = super.getText();
		if(!text.isEmpty()) {
			// Leerzeichen existieren nur durch Operatoren
			if(text.charAt(text.length()-1) == ' ') {
				super.setText(text.substring(0,text.length()-3));							
			} else {
				/*
				 *  kein Operator? Checke nach Vorzeichen
				 *  Vorsicht: IndexOutOfBoundsException
				 */
				try {
					if(text.charAt(text.length()-2) == '-') {
						super.setText(text.substring(0,text.length()-2));
					} else {						
						super.setText(text.substring(0,text.length()-1));					
					}
				} catch (IndexOutOfBoundsException e) {
					super.setText(text.substring(0,text.length()-1));
				}
			}
		}
	}
	
	// Negiert die nächste Eingabe, bzw. die allererste Zahl
	public void negateText() {
		String text = super.getText();
		if(!text.isEmpty()) {
			try {
				super.setText("" + -Double.parseDouble(text));
			} catch(NumberFormatException e) {
				if(text.charAt(text.length()-1) == ' ') {
					text += "-";			
				} else if(text.charAt(text.length()-1) == '-') {
					text = text.substring(0, text.length()-1);
				}
				super.setText(text);
			}
		}
	}
	
	/*
	 * Berechnet das Erbegnis der gesamten Eingabe
	 * Rechenmethode aehnelt einem Stack. Kann nur Punkt
	 * vor Strichrechnung
	 */
	public void berechneErgebnis() {
		String text = super.getText();
		if(text.isEmpty()) {
			return;
		}
		// Letzte Eingabe war Operator? Entfernen! Erwischt auch das Vorzeichen.
		if(isLastEntryOperator()) {
			text = text.substring(0,text.length()-3);
		}
		// Teile die Eingabe anhand der Operatoren auf (-> Leerzeichen)
		String[] parts = text.split(" ");
		
		/*
		 * Erstelle ein Array fuer Zahlen und eins fuer Operatoren.
		 * Die Haelfte (abgerundet) der Anzahl der "Einheiten" sind Operatoren.
		 * Die Haelfte (aufgerundet) der Anzahl der "Einheiten" sind Zahlen.
		 */
		double[] calc = new double[parts.length/2 + 1];
		String[] operators = new String[parts.length/2];
		
		/*
		 * Gehe durch die Eingabe wie durch einen Stack.
		 * Strichrechnung: Zahl und Operator landen auf dem Stack (im Array)
		 * Punktrechnung: Berechnung wird direkt durchgefuehrt
		 */
		try {
			int z = 0; // Zaehler Zahlen
			int o = 0; // Zaehler Operatoren
			for(int i = 0; i<parts.length;i++) {
				switch(parts[i]) {
					case "+": operators[o] = "+"; o++; break;
					case "-": operators[o] = "-"; o++; break;
					case "*": calc[z-1] *= Double.parseDouble(parts[++i]); break;
					case "/": calc[z-1] /= Double.parseDouble(parts[++i]); break;
					default: calc[z] = Double.parseDouble(parts[i]); z++; break;
				}
			}
		
			
			/*
			 * Abarbeitung der restlichen Strichrechnung
			 */
			for(int i = 0;i<operators.length;i++) {
				
				/*
				 *  lazy: insgesamt gibt es mehr Operatoren als Strichrechnungen
				 *  Besser: ArrayList nutzen, hatten wir noch nicht
				 */
				if(operators[i] == null) {
					continue;
				}
				
				// Addition bzw. Subtraktion
				if(operators[i].equals("+")) {
					calc[0] = calc[0] + calc[i+1];
				}
				if(operators[i].equals("-")) {
					calc[0] = calc[0] - calc[i+1];
				}
			}
			
			// Ausgabe des Ergebnisses
			super.setText("" + calc[0]);
			
		} catch (NumberFormatException e) {
				System.out.println(e);
				super.setText(text);
			}
	}

}
