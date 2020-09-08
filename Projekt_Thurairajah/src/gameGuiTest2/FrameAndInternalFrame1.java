package gameGuiTest2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameAndInternalFrame1 extends InterFrame2GameMenu implements MouseListener{

	JFrame frame = new JFrame();
//	JInternalFrame intFrame1 = new JInternalFrame();
	JPanel panel = new JPanel();
	JDesktopPane dp = new JDesktopPane();
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	
	JInternalFrame jiFrame1 = new JInternalFrame();
	InterFrame2GameMenu jiFra2 = new InterFrame2GameMenu();

	public void loadFrame() {
		frame.setTitle("FightClub");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(350, 200, 1210, 755);
		frame.setResizable(false);
		
		panel.setLayout(new BorderLayout());
		frame.setContentPane(jiFrame1);
		jiFrame1.setContentPane(panel);
		
//		dp.setBounds(0,0,1200,680);
//		dp.setLayout(null);
//		dp.setBackground(Color.LIGHT_GRAY);
		
		panel.add(dp);
		jiFrame1.setVisible(true);
		frame.setVisible(true);
	}
	
	public void loadPage1() {
		//BACKGROUND IMG
				l1.setIcon(new ImageIcon(StartGameMain.class.getResource("/backg1/6-2.jpg")));
				l1.setOpaque(true);
				l1.setBounds(0, 0, 1200, 690);
				
				//TEXT-BAR LIKE
				l2.setIcon(new ImageIcon(StartGameMain.class.getResource("/label1/barN.jpg")));
				l2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				l2.setToolTipText("Enter FightClub");
				l2.setBounds(300, 300, 600, 50);
				l2.addMouseListener(this);

				dp.add(l1);
				dp.add(l2);

				dp.setLayer(l1, 0);
				dp.setLayer(l2, 1);
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {		
		l2.setIcon(new ImageIcon(StartGameMain.class.getResource("/label1/barEN.jpg")));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		l2.setIcon(new ImageIcon(StartGameMain.class.getResource("/label1/barN360.jpg")));
	
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		l2.setIcon(new ImageIcon(StartGameMain.class.getResource("/label1/barN360.jpg")));
	}
	@Override
	public void mouseExited(MouseEvent e) {
		l2.setIcon(new ImageIcon(StartGameMain.class.getResource("/label1/barN.jpg")));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("\"Enter\" clicked");
//		GameMenuPlayer1 pl1 = new GameMenuPlayer1();
		 
//		frame.setVisible(false);
//		jiFrame1.dispose();
		InterFrame2GameMenu iFrame2= new InterFrame2GameMenu();
//		iFrame2.loadFrame2();

		
	}
 
	public void internalFrame1() {
		jiFrame1.setBounds(0, 0, 1200, 720);
		jiFrame1.setVisible(true);
		
		jiFrame1.isResizable();
		jiFrame1.isMaximizable();
		jiFrame1.isIconifiable();
	
	}

}