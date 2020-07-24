package anoInnerClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Application {

	public static void main(String[] args) {
//		AAbstractClass ac = new AAbstractClass();
//		IInterface ii = new IInterface();
		
		AAbstractClass ac = new AAbstractClass() {
			@Override
			void methodInAbstractClass() {
				System.out.println("Doch ein Objekt der abstrakten Klasse erzeugt");				
			}			
		};		
		ac.methodInAbstractClass();
		
		IInterface ii = new IInterface() {

			@Override
			public void methodInInterface() {
				System.out.println("anonymes Objekt vom Interface");				
			}			
		};
		ii.methodInInterface();
		
		go(new IInterface() {			
			@Override
			public void methodInInterface() {
				System.out.println("erstes anonymes Objekt im Methodenaufruf erzeugt");			
			}
		}
		);
		
		go(new IInterface() {			
			@Override
			public void methodInInterface() {
				System.out.println("zweites anonymes Objekt im Methodenaufruf erzeugt");			
			}
		}
		);

	}

	public static void go(IInterface i) {
		i.methodInInterface();
	}

	
}

abstract class AAbstractClass {
	abstract void methodInAbstractClass();
}

interface IInterface {
	void methodInInterface();
}
