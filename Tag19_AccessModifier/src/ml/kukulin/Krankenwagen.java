package ml.kukulin;

public class Krankenwagen extends Auto{
	  private boolean blaulicht = false; 
public Krankenwagen() {
	
	 new Auto();
	blaulicht = false;
	setMaxGw(100);
}
	
public  void	setBlaulicht( boolean blaulicht){
		
	this.blaulicht = blaulicht;
	}
public boolean getBlaulicht() {

return blaulicht;


}

}