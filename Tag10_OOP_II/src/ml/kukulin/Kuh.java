package ml.kukulin;

public class Kuh {
	
	//Attribute
	
	public String name;
	public String hauptfarbe;
	public String fleckenfarbe;
	public int milchmenge;
	public float gewicht;
	
	public int lauf;
	public int fress;
	public int melken;
	
	
	public Kuh(String name, String hauptfarbe, String fleckenfarbe, int milchmenge,float gewicht) {
		
		this.name = name; 
		this.hauptfarbe = hauptfarbe;	
		this.fleckenfarbe = fleckenfarbe;
		this.milchmenge = 0;
		this. gewicht = 0;
		
	}
	
	
	//Metoden
	public float laufen(int lauf,float gewicht) {
		
	this.gewicht = gewicht - lauf/100;
	
	if (this.gewicht > 0) {
	return gewicht;	}
	else {
		System.out.println("tod");
		return 0;}
	}
	
		
	public float fressen(int fress, float gewicht) {
		
		this.gewicht = gewicht + fress/100;
		
		if (this.gewicht < 750 && this.gewicht > 0) {
		return gewicht;	}
		else {
			System.out.println("Achtung !  Gewicht ");
			return gewicht;}
		}	
		
		
		public float melken( float gewicht) {
			
			
			
			if (this.gewicht < 450  && this.gewicht > 350) {
			return milchmenge = 16;	
			}else if 
			 (this.gewicht < 550  && this.gewicht > 450){
				return milchmenge =19;
			 }else if 
			 (this.gewicht < 650  && this.gewicht > 550)
				return milchmenge = 22;
			else if
			(this.gewicht < 750  && this.gewicht > 650)
				return milchmenge = 25;
			else {
				System.out.println("Achtung !  Gewicht ");
				return -1;
			}
			}		
		
		
	}
	
	


