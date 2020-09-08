package texteditorNeumann;

import java.awt.Font;

import javax.swing.JTextArea;

public interface IFontAendern {
	
default void fontAendern(JTextArea t) {
	Font italic = new Font("Arial", Font.ITALIC, 20);
	Font bold = new Font("Arial", Font.BOLD, 20);
	Font groesser = new Font("Arial", Font.PLAIN,30);
	Font kleiner = new Font("Arial", Font.PLAIN,10);
	
}
}
