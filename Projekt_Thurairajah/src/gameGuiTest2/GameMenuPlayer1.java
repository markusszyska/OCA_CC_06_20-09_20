package gameGuiTest2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class GameMenuPlayer1 implements MouseListener{
	
//	public static void main(String[] args) {
		
		JFrame frame2 = new JFrame();
		JDesktopPane dp2 = new JDesktopPane();
		JPanel panel2 = new JPanel();
		JLabel backGroundLbl = new JLabel();
		JLabel gifLabel= new JLabel();
		JLabel playerImgLbl1 = new JLabel();
		JLabel playerImgLbl2 = new JLabel();
		JLabel cpuImgLbl1 = new JLabel();
		JLabel cpuImgLbl2 = new JLabel();
		JLabel p1ChooseCharTxt = new JLabel();
		JLabel pp2ChooseCharTxt = new JLabel();
		JLabel enterNameLbl = new JLabel();
		JTextField playerName = new JTextField();
		JButton nameEnterBtn = new JButton();
		JTextField showPlayerName = new JTextField();
		JButton enterGameBtn = new JButton();
		JLabel outputPlayerNameTF = new JLabel();
//		ImageIcon image = new ImageIcon(new ImageIcon("/gif/pint-round gif.gif").getImage().getScaledInstance(200, 20, Image.SCALE_DEFAULT));
		
	GameMenuPlayer1(){	
	
		frame2.setTitle("FightClub");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setBounds(350, 200, 1210, 730);
		frame2.setContentPane(panel2);
		frame2.setResizable(false); // Window fixiert
		panel2.setLayout(new BorderLayout());
		
		//BACKGROUND IMAGE
		backGroundLbl.setIcon(new ImageIcon(StartGameMain.class.getResource("/backg1/6-3.jpg")));
//		nameLabel.setIcon(image);
		backGroundLbl.setOpaque(true);
		backGroundLbl.setBounds(0, 0, 1200, 690);

		//p1ChooseCharTxt
		p1ChooseCharTxt.setText("Choose Your Character");
		p1ChooseCharTxt.setBounds(40,10,480,60);
		p1ChooseCharTxt.setFont(new Font("Airstrike", Font.PLAIN,30));
		p1ChooseCharTxt.setForeground(Color.WHITE);
		//Pp2ChooseCharTxt
		pp2ChooseCharTxt.setText("Choose CPU Character");
		pp2ChooseCharTxt.setBounds(780,10,480,60);
		pp2ChooseCharTxt.setFont(new Font("Airstrike", Font.PLAIN,30));
		pp2ChooseCharTxt.setForeground(Color.WHITE);
		
		//PLAYER //IMG1
		playerImgLbl1.setIcon(new ImageIcon(StartGameMain.class.getResource("/charact/boy2.png")));
		playerImgLbl1.setOpaque(false);
		playerImgLbl1.setBounds(40,50,175,175);
		playerImgLbl1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		playerImgLbl1.addMouseListener(this);
			//IMG2
		playerImgLbl2.setIcon(new ImageIcon(StartGameMain.class.getResource("/charact/girl2.png")));
		playerImgLbl2.setOpaque(false);
		playerImgLbl2.setBounds(240,50,175,175);
		playerImgLbl2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		playerImgLbl2.addMouseListener(this);
		
		//CPU//IMG1
		cpuImgLbl1.setIcon(new ImageIcon(StartGameMain.class.getResource("/charact/boy1.png")));
		cpuImgLbl1.setOpaque(false);
		cpuImgLbl1.setBounds(780,50,175,175);
		cpuImgLbl1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cpuImgLbl1.addMouseListener(this);
			//IMG2
		cpuImgLbl2.setIcon(new ImageIcon(StartGameMain.class.getResource("/charact/girl1.png")));
//		cpuPan2.setOpaque(true);
		cpuImgLbl2.setBounds(980,50,175,175);
		cpuImgLbl2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cpuImgLbl2.addMouseListener(this);
		cpuImgLbl2.setOpaque(false);;

		//GIF
		gifLabel.setIcon(new ImageIcon(StartGameMain.class.getResource("/gif/pint-optical-illusion.gif")));
		gifLabel.setOpaque(true);
		gifLabel.setBounds(350, 300, 540, 50);
//		gifLabel.setSize(200, 200);
		
		//ENTER-NAMEPANE
		enterNameLbl.setText("Enter Your Name:");
		enterNameLbl.setBounds(30,400,480,60);
		enterNameLbl.setFont(new Font("Airstrike",Font.PLAIN,35));
		enterNameLbl.setForeground(Color.BLACK);
		
		//PLAYERNAME INPUT FIELD
		playerName.setText("");//nameOfPlayer
		playerName.setOpaque(false);
		playerName.setBackground(Color.DARK_GRAY);
		playerName.setBounds(400,400,480,60);
		playerName.setFont(new Font("Airstrike", Font.PLAIN,35));
		playerName.setForeground(Color.WHITE);
		
		//AFTER_NAME_ENTER 'OK-BTN'
		nameEnterBtn.setText("OK");
		nameEnterBtn.setBounds(900, 400, 90, 60);
		nameEnterBtn.setFont(new Font("Airstrike", Font.PLAIN, 30));
//		nameEnterBtn.addActionListener(btnAction());;
		
		//ENTER GAME 'START-BTN'
		enterGameBtn.setText("START");
		enterGameBtn.setBounds(900,550,180,40);
		enterGameBtn.setFont(new Font("Airstrike", Font.PLAIN, 30));
		enterGameBtn.setVisible(false);
	
		
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//PLAYER ONE's NAME SHOWN IN LABEL
				outputPlayerNameTF.setText("Player Name:   "+ playerName.getText());
				outputPlayerNameTF.setBounds(30,550,280,40);
				outputPlayerNameTF.setFont(new Font("Airstrike", Font.PLAIN, 20));	
				outputPlayerNameTF.setOpaque(false);
				outputPlayerNameTF.setVisible(true);
				outputPlayerNameTF.setForeground(Color.YELLOW);		
				enterGameBtn.setVisible(true);

			}
		};
		nameEnterBtn.addActionListener(al);

		dp2.add(backGroundLbl);
		dp2.add(gifLabel);
		dp2.add(playerImgLbl1);
		dp2.add(playerImgLbl2);
		dp2.add(enterNameLbl);
		dp2.add(cpuImgLbl1);
		dp2.add(cpuImgLbl2);
//		dp2.add(nameLbl);
		dp2.add(p1ChooseCharTxt);
		dp2.add(pp2ChooseCharTxt);
		dp2.add(playerName);
		dp2.add(nameEnterBtn);
		dp2.add(showPlayerName);
		dp2.add(outputPlayerNameTF);//
		dp2.add(enterGameBtn);

		dp2.setLayer(backGroundLbl, 0);
//		dp2.setLayer(gifLabel, 2);
		dp2.setLayer(playerImgLbl1, 1);
//		dp2.setLayer(namePane, 1); 
		
		panel2.add(dp2);
		frame2.setVisible(true);
		
		ActionListener startBtnClicked = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e2) {
//				frame2.setVisible(false);
				frame2.dispose();
				GamePlay gp = new GamePlay();
			}
		};
		enterGameBtn.addActionListener(startBtnClicked);
  
	}
 
	private ActionListener mouseAction() {
		return null;
	}
 
	@Override
	public void mouseClicked(MouseEvent e) {	
		Object s = e.getSource();
		if (s.equals(playerImgLbl1)) {
			System.out.println("Player img 1 clicked");
		}else if(s.equals(playerImgLbl2)) {
		System.out.println("Player img 2 clicked");
		}else if (s.equals(cpuImgLbl1)) {
			System.out.println("CPU1 img 1 clicked");
		}else{
			System.out.println("CPU2 img 2 clicked");
		}
 	
	}

	@Override
	public void mousePressed(MouseEvent e) {	

	}

	@Override
	public void mouseReleased(MouseEvent e) {	
	}

	@Override
	public void mouseEntered(MouseEvent e) {	
	}

	@Override
	public void mouseExited(MouseEvent e) {		
	}
	
	

}