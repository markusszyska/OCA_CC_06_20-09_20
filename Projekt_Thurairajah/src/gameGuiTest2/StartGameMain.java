package gameGuiTest2;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;


public class StartGameMain extends FrameAndInternalFrame1 {
  
	JFrame frame = new JFrame();
	JDesktopPane jdp = new JDesktopPane();
	
public static void main(String[] args) {
	

		FrameAndInternalFrame1 fp = new FrameAndInternalFrame1();

		fp.loadFrame();
		fp.loadPage1();
		fp.internalFrame1();
		
	}	
}
