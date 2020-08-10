package demoLambda01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AnonymMain {
	
	static ATier tierAttr = new ATier() {
		@Override
		public String laufen() {
			return "Anonyme Klasse als Attribut";
		}		
	};
	
	public static void main(String[] args) {
		//Von einer abstrakten Klasse kann kein Objekt erzeugt werden.
//		ATier tier = new ATier();
		/*
		 * Umsetzung eines Objektes der abstrakten Klasse als
		 * sog. anonyme innere Klasse.
		 * Anonym deshalb weil vom Compiler eine Kindklasse
		 * von ATier erzeugt wird, die keinen Klassennamen hat.
		 */
		ATier tier = new ATier() {
			@Override
			public String laufen() {			
				return "5 Meter gelaufen";
			}			
		};
		System.out.println(tier.laufen());
		gassigehen(tier);
		gassigehen(new ATier() {
			@Override
			public String laufen() {				
				return "Anonymes Tier bei Methodenaufruf erzeugt";
			}			
		});
		tierAttr.laufen();
		
		ATier tier2 = new ATier() {
			@Override
			public String laufen() {			
				return "5 Meter gelaufen";
			}
			/*
			 * Methoden die in einer anonymen Klasse erzeugt werden
			 * sind nur innerhalb der anonymen Klasse benutzbar,
			 * da die Methoden, die verfuegbar sind von der abstrakten Klasse
			 * vorgegeben sind.
			 */
			public void go() {
				System.out.println("go() in anonymer Klasse");
			}
			public void go2() {
				this.go();
			}
			
		};
//		tier2.go();
		
		IFressbar fressbar = new IFressbar() {			
			@Override
			public void wirdgefressen() {
				System.out.println("Ja das klappt, anonymes Objekt vom Interface");
			}
		};
		fressbar.wirdgefressen();
		fressen(fressbar);
		fressen(new IFressbar() {		
			@Override
			public void wirdgefressen() {
				System.out.println("Anonymes fressbares Objekt");				
			}
		});
				
		IFressbar fressbar2 = () -> {System.out.println("Lambda kann das auch");};
		fressbar2.wirdgefressen();
		
		fressen(()-> System.out.println("Lambda im Methodencall"));
		
		JButton btn = new JButton();
		btn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button gedrueckt");				
			}
		});
		
		btn.addActionListener((e)-> System.out.println("Button gedrueckt"));
		
	}
	
	public static void gassigehen(ATier tier) {
		System.out.println(tier.laufen());
	}
	public static void fressen(IFressbar fressbar) {
		fressbar.wirdgefressen();
	}
}

abstract class ATier {
	public abstract String laufen();
}

interface IFressbar{
	void wirdgefressen();
}
