package assmann.taschenrechner.gui.textfield;

public interface IAusgabeTextfeld {
	public void addText(String text);
	public void addOperator(String operator);
	public void removeText();
	public void removeOneSpace();
	public void negateText();
	public void berechneErgebnis();
}
