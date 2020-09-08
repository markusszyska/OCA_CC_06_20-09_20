package gameGuiTest2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
 
import javax.swing.UIManager;
//import javax.swing.*; //also for Timer
import java.util.Timer;
 

public class GamePlay  {  

	 
	JFrame frame = new JFrame();
	JDesktopPane dp = new JDesktopPane();
	JLabel backGroundLbl = new JLabel();
	JLabel cpuImgLbl1 = new JLabel();
	JPanel panel = new JPanel();
	JLabel playerImgLbl1 = new JLabel();
	JPanel lifeBarPan1;
	JPanel lifeBarPan2;
	JProgressBar healthBarPlayer1;
	JProgressBar healthBarPlayer2;
	JLabel attack1;
	JLabel attack2;
	int hp;
	Timer tCountDwnStart ;
	Timer tPlayTime ;
	int timeDown1_3sec = 3;
	int timeDown2_60sec = 60;
	
	
	DamageHandler damageHandler = new DamageHandler();
	DamageHandler2 handlerDamage2 = new DamageHandler2();
	
	  GamePlay(){//w/o void
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		frame.setTitle("FightClub");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(350, 200, 1210, 730);
		frame.setResizable(false); // fixed window 
		
		panel.setLayout(new BorderLayout());
		frame.setContentPane(panel);

		dp.setBounds(0,0,1200,794);
		dp.setLayout(null);
		dp.setBackground(Color.LIGHT_GRAY);
		
		//TIMER
//		Timer timer = new Timer();
		
		//BACKGROUND IMAGE
		backGroundLbl.setIcon(new ImageIcon(StartGameMain.class.getResource("/fightStage/stageDB4.jpg")));
//		nameLabel.setIcon(image);
		backGroundLbl.setOpaque(true);
		backGroundLbl.setBounds(0, 0, 1200, 730);
		 
		
		//PLAYER //IMG1
			playerImgLbl1.setIcon(new ImageIcon(StartGameMain.class.getResource("/charact/boy2_Small.png")));
			playerImgLbl1.setOpaque(false);
			playerImgLbl1.setBounds(40,50,175,175);
			playerImgLbl1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				 
				//CPU//IMG1
			cpuImgLbl1.setIcon(new ImageIcon(StartGameMain.class.getResource("/charact/boy1_Small.png")));//changed BOY
			cpuImgLbl1.setOpaque(false);
			cpuImgLbl1.setBounds(1100,50,175,175);
			cpuImgLbl1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			hp = 1000;
			
			//LIFEBAR PLAYER 1
			lifeBarPan1 = new JPanel();
			lifeBarPan1.setOpaque(true);
			lifeBarPan1.setBounds(60,20,175,20);
			lifeBarPan1.setBackground(Color.darkGray);
			
			//HEALTHBAR PL-1
			healthBarPlayer1 =new JProgressBar(0,100);
			healthBarPlayer1.setPreferredSize(new Dimension(300,30));
			healthBarPlayer1.setValue(100);
			healthBarPlayer1.add(lifeBarPan1);

			//LIFEBAR PLAYER 2
			lifeBarPan2 = new JPanel();
			lifeBarPan2.setOpaque(true);
			lifeBarPan2.setBounds(940,20,175,20);
			lifeBarPan2.setBackground(Color.blue);
			
			//HEALTHBAR PL-2
			healthBarPlayer2 =new JProgressBar(0,100);
			healthBarPlayer2.setPreferredSize(new Dimension(300,30));
			healthBarPlayer2.setValue(100);
			healthBarPlayer2.add(lifeBarPan2);
			
			//ATK-LBL1_PANL
//			JPanel atkButtonPanel = new JPanel();
//			atkButtonPanel.setBounds(145,595,110,50);
//			atkButtonPanel.setBackground(Color.darkGray);
			
//			Attacks atk = new Attacks();//
//			atkButtonPanel.add(attackBtn1);
			//ATTACK-LBL-1
			attack1 = new JLabel ("A");
			attack1.setIcon(new ImageIcon(StartGameMain.class.getResource("/attackButton/bttn1.png")));
			attack1.setBounds(145,595,110,50);
//			attack1.setBackground(Color.red);
//			attack1.setForeground(Color.black);
//			attack1.setFocusPainted(false);
			attack1.addMouseListener((MouseListener) damageHandler);
//			healthBarPlayer1.add(attackBtn1);
//			attack1.setBounds(150,600,100,40);
			

			//ATK-BTN1_PANL
			JPanel atkButtonPanel2 = new JPanel();
			atkButtonPanel2.setBounds(940,590,110,50);
			atkButtonPanel2.setBackground(Color.darkGray);
			//ATTACK-BTN-2
			attack2 = new JLabel("B");
			attack2.setBackground(Color.red);
			attack2.setForeground(Color.black);
//			attack2.setFocusPainted(false);
			attack2.addMouseListener((MouseListener) handlerDamage2);//
			healthBarPlayer1.add(attack2);
			attack2.setBounds(945,595,100,40);
			
			//TIMER 1
//			tCountDwnStart  = new Timer(1000, null);
			JLabel timeLbl1 = new JLabel(" ");
			timeLbl1.setBounds(540,120,250,60);
//			timeLbl1.setBackground(Color.yellow);
			timeLbl1.setOpaque(false);
			timeLbl1.setFont(new Font("Airstrike", Font.PLAIN, 60));
			timeLbl1.setForeground(Color.red);
//			for (int i = 3; i > 0; i--) {
//				timeDown1_3sec--;
//				System.out.println(i);				
//				timeLbl1.setText(String.valueOf(i));
//			}
				TheTimer task = new TheTimer(3);
				task.start();
//				timeLbl1.setText(String.valueOf(task.getTimer3Sec()));
//				timeLbl1.repaint();
//				System.out.println(task);
//				if (task.getTimer3Sec() == 0) {
//					
//					timeLbl1.setText(task.startLabel());
//				}
			
			//ADD TO DESKTOPPANE
			dp.add(backGroundLbl);
			dp.add(playerImgLbl1);
			dp.add(cpuImgLbl1);
			dp.add(lifeBarPan1);
			dp.add(lifeBarPan2);
//			dp.add(atkButtonPanel);
//			dp.add(atkButtonPanel2);
			dp.add(attack1);
			dp.add(attack2);//
			dp.add(healthBarPlayer1);
			dp.add(healthBarPlayer2);
//			dp.add(task.countDown1);
//			dp.add()
			
			//SET LAYER
			dp.setLayer(backGroundLbl, 0);
			dp.setLayer(playerImgLbl1, 1);
			dp.setLayer(attack1, 1);
			dp.setLayer(attack2, 1);
//			dp.setLayer(lifeBarPan1, 1);
//			dp.setLayer(healthBarPlayer2, 1);
			
			panel.add(dp);
			frame.setVisible(true);
			
			
	}
	
	public class DamageHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			damageReceived();
			
		}
	}
	public class DamageHandler2 implements ActionListener{	
		@Override
		public void actionPerformed(ActionEvent e) {
			damage2Received();
			
		}	 
	}
	
	public void damageReceived() {
		hp -=100;
		healthBarPlayer1.setValue(hp);
	}
	
	public void damage2Received() {
		hp -=200;
		healthBarPlayer1.setValue(hp);
	}
	
	
}
