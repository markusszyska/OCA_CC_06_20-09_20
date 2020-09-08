package texteditorNeumann;

import javax.swing.JTextArea;

public interface Icrypto {
	
public static void main(String[] args) {
	
}
	
	default String encrypte(JTextArea t){
		String ot = t.getText();
		int lt = t.getText().length();
		
		
		String et= "";
		if (lt%2 == 0) {
		for (int i = 0; i < lt-1; i=i+2) {
			
		 et += "" + ot.charAt(i+1) + ot.charAt(i);
		
		
		}
		
		 return et;}
		
		else {for (int i = 0; i < lt-1; i=i+2) {
			
		 et += "" + ot.charAt(i+1) + ot.charAt(i);
		
		
		}
		et+= ot.charAt(lt-1);
		 return et;
			
		}
		
	}
	default String encrypte2(JTextArea t) {
		String e = "";
		String o = t.getText();
		int l = t.getText().length();
		
		for (int i = l-1; i>=0; i--) {
			e += (o.charAt(i));
			
		}
		
		return e;
	}

}
