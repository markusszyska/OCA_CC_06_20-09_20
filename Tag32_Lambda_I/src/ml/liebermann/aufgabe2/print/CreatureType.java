package ml.liebermann.aufgabe2.print;

public enum CreatureType {

	HEADY,FOOTY,TRUNKY;
	
private boolean istHungrig = true;
	
	
	
	private void printHeady(boolean istHungrig){
		if (istHungrig) {
			System.out.println("|           ||||||           |");
			System.out.println("|          |      |          |");
			System.out.println("|          | @  @ |          |");
			System.out.println("|          |      |          |");
			System.out.println("|          | ,--, |          |");
			System.out.println("|           \\____/          |");
		}
		else {
			System.out.println("|           ||||||           |");
			System.out.println("|          |      |          |");
			System.out.println("|         |  @  @  |         |");
			System.out.println("|         |        |         |");
			System.out.println("|         \\  `--´  /        |");
			System.out.println("|          \\______/         |");
		}
	}
	
	private void printFooty(boolean istHungrig){
		if (istHungrig) {
			System.out.println("|       *************        |");
			System.out.println("|     **    @   @    **      |");
			System.out.println("|   **     .-----.      **   |");
			System.out.println("|  *       `-----´       *   |");
			System.out.println("|   *********************    |");
			System.out.println("|    _|  _|  _|_  |_  |_     |");
		}
		else {
			System.out.println("|      ***************       |");
			System.out.println("|   ***     @   @     ***    |");
			System.out.println("|  *                     *   |");
			System.out.println("|  *       `-----´       *   |");
			System.out.println("|   *********************    |");
			System.out.println("|    _|  _|  _|_  |_  |_     |");
		}
	}
	
	private void printTrunky(boolean istHungrig){
		if (istHungrig) {
			System.out.println("|  @    @                    |");
			System.out.println("|   \\___/                    |");
			System.out.println("|   /   \\_________________   |");
			System.out.println("|  ( ~~~                  \\  |");
			System.out.println("|   \\_____________________/  |");
			System.out.println("|                            |");
		}
		else {
			System.out.println("|  @    @                    |");
			System.out.println("|   \\___/                    |");
			System.out.println("|   /   \\_________________   |");
			System.out.println("|  ( °-°                  \\  |");
			System.out.println("|   \\                     /  |");		
			System.out.println("|   \\___________________/   |");
		}
	}
	
	public void printArt(boolean istHungrig) {
		if(CreatureType.FOOTY == this) {
			printFooty(istHungrig);
		} else if (CreatureType.HEADY == this) {
			printHeady(istHungrig);
		}else {
			printTrunky(istHungrig);
		}
		
	}
	

}
