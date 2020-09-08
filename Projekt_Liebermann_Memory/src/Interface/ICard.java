package Interface;

import javax.swing.ImageIcon;
import javax.swing.border.Border;

public interface ICard {

	void setBorder(Border border);
	void setBack(ImageIcon back);
	void resize(int width, int height);
}
