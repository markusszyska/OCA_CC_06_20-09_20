package gameGuiTest2;

 
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
 

public class TheTimer {
	private int timer3Sec;
	public JLabel countDown1;
	
	Timer myTimer = new Timer();
	
	public int getTimer3Sec() {
		return timer3Sec;
	}
	public void setTimer3Sec(int timer3Sec) {
		this.timer3Sec = timer3Sec;
	}

	public TheTimer(int timer3Sec) {
		super();
		this.timer3Sec = timer3Sec+1;
	}
	
	public String toString() {
//		timer3Sec--;
		
		return "TheTimer passed: ";// + timer3Sec;
	}
	
	TimerTask task = new TimerTask() {
		@Override
		public void run() {
			timer3Sec--;
			System.out.println(timer3Sec);
			if (timer3Sec == 1) {
//				myTimer.schedule(task, 1000);
//				System.out.println(startLabel());
//				countDown1.setText(String.valueOf(timer3Sec));
				myTimer.cancel();
			}
			
//			for (int i = timer3Sec; i > 0; i--) {
//				System.out.println("Time now " +i);
		}
	};
	public void start() {
		myTimer.scheduleAtFixedRate(task,1000,1000);
	}
	 
	public String startLabel(){
//		myTimer.schedule(task, 1000);
		return "START";
	}
	
//	public void countDown1() {
//		countDown1 = new JLabel(" ");
//		countDown1.setBounds(540,120,250,60);
//		countDown1.setOpaque(false);
//		countDown1.setFont(new Font("Airstrike", Font.PLAIN, 60));
//		countDown1.setForeground(Color.red);
		
//	}
	
}
