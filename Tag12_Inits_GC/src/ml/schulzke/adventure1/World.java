package ml.schulzke.adventure1;

public class World {
	private int time = 0;
	
	public int getTime(){
		return this.time;
	}
	
	public void setTime(int state){
		//state 0 fight, 1 travel, 2 trade, 3 move within city/dungon
		if(state==0) {
			this.time = this.time+5;
		}else if(state==1){
			this.time = this.time+3600;
		}else if(state==2){
			this.time = this.time+300;
		}else if(state==3){
			this.time = this.time+1200;
		}
		
	}
}
