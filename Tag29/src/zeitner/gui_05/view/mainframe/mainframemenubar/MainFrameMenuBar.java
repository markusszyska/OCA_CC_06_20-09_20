package zeitner.gui_05.view.mainframe.mainframemenubar;

import javax.swing.JMenuBar;

import zeitner.gui_05.view.mainframe.mainframemenubar.filemenu.FileMenu;


public class MainFrameMenuBar extends JMenuBar {

	private static final long serialVersionUID = 7977496372378162439L;

	public MainFrameMenuBar() {
		
		FileMenu fileMenu = new FileMenu();
		fileMenu.setVisible(true);
		
		super.add(fileMenu);
		super.setVisible(true);
	}
}
