package ml.schulzke.adventure;

public class World {
	
	Controls controls = new Controls();
	private int time = 0;
	private int day = 5;
	
	public int getTime(){
		return this.time;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	
	public int getDay(){
		return this.day;
	}
	
	public void setTime(int state){
		/* 0 fight 5seconds,
		 * 1 travel/wait 1hour
		 * 2 trade 5min
		 * 3 move within city/dungon 20min
		 * 4 sleep/eat 10hours
		 */
		if(state==0) {
			this.time = this.time+5;
		}else if(state==1){
			this.time = this.time+3600;
		}else if(state==2){
			this.time = this.time+300;
		}else if(state==3){
			this.time = this.time+1200;
		}else if(state==4){
			this.time = this.time+36000;
		}
		
		if(this.getTime()>=86400) {
			this.time = this.time-86400;
			this.setDay(this.getDay()+1);
		}
		
	}

	
	public String showTime() {
		
		System.out.println("Es ist der "+this.getDay()+". Tag des Achet II im Lande Kemet!");
		
		String out = "";
		if(this.getTime()>=0&&this.getTime()<=3600) {
			out = "Die Sonne geht auf... Es ist die erste Stunde des Tages!";
		}else if(this.getTime()>=3601&&this.getTime()<=14400) {
			out = "Es ist früh am Morgen, circa die "+Math.round(this.getTime()/3600)+". Stunde des Tages...";
		}else if(this.getTime()>=14401&&this.getTime()<=28800) {
			out = "Es ist Mittag und die Sonne brennt, circa die "+Math.round(this.getTime()/3600)+". Stunde des Tages...";
		}else if(this.getTime()>=28801&&this.getTime()<=39600) {
			out = "Es wird kühler der Abend bricht an circa die "+Math.round(this.getTime()/3600)+". Stunde des Tages...";
		}else if(this.getTime()>=39601&&this.getTime()<=43200) {
			out = "Die letzte Stunde des Tages bricht an es ist die "+Math.round(this.getTime()/3600)+". Stunde des Tages...";
		}else if(this.getTime()>=43201&&this.getTime()<=54000) {
			out = "Die Sterne gehen auf es die "+Math.round((this.getTime()-43200)/3600)+". Stunde der Nacht...";
		}else if(this.getTime()>=54001&&this.getTime()<=75600) {
			out = "Die Sterne stehen in voller Pracht am Himmelszelt, es ist die "+Math.round((this.getTime()-43200)/3600)+". Stunde der Nacht...";
		}else if(this.getTime()>=75601&&this.getTime()<=86400) {
			out = "Die Sterne gehen unter und es dämmert, es ist die "+Math.round((this.getTime()-43200)/3600)+". Stunde der Nacht...";
		}
		
		return out;
	}
}
