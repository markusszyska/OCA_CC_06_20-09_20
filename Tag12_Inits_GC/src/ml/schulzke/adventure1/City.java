package ml.schulzke.adventure1;

public class City {
	
	static int noOfCitys = 0; 
    { 
    	noOfCitys += 1; 
    } 
	
	private String name = "Memphis";
	private int posX = 15;
	private int posY = 15;
	
	
	public void setData(String namein,int x,int y){
		   name = namein;
		   posX = x;
		   posY = y;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public int getPosX(){
		return this.posX;
	}
	
	public void setPosX(int posX){
		this.posX = posX;
	}
	
	public int getPosY(){
		return this.posY;
	}
	
	public void setPosY(int posY){
		this.posY = posY;
	}
	
	
	public float distance(Adventurer hero) {
		return (float) Math.sqrt(((this.posX-hero.getX())*(this.posX-hero.getX()))+((this.posY-hero.getY())*(this.posY-hero.getY())));
	}

}
