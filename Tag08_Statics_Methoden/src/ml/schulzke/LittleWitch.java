package ml.schulzke;

public class LittleWitch {

	public static void main(String[] args) {
		
		for(int clock=6;clock<=12;clock++) {
		
		switch (clock) {
		  case 6:
		    System.out.println("Morgens fr�h um 6\r\n" + 
		    		"kommt die kleine Hex.");
		    break;
		  case 7:
		    System.out.println("Morgens fr�h um 7\r\n" + 
		    		"schabt sie gelbe R�ben.");
		    break;
		  case 8:
		    System.out.println("Morgens fr�h um 8\r\n" + 
		    		"wird Kaffee gemacht.");
		    break;
		  case 9:
		    System.out.println("Morgens fr�h um 9\r\n" + 
		    		"geht sie in die Scheun'.");
		    break;
		  case 10:
		    System.out.println("Morgens fr�h um 10\r\n" + 
		    		"hackt sie Holz und Sp�n'.");
		    break;
		  case 11:
		    System.out.println("Feuert an um 11,");
		    break;
		  case 12:
		    System.out.println("kocht dann bis um 12:\r\n" + 
		    		"Fr�schebein und Krebs und Fisch.\r\n" + 
		    		"Hurtig Kinder kommt zu Tisch!");
		    break;
		}
		
	}

	}

}
