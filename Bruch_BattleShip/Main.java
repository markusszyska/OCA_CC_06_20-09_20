package mboo;

import java.util.*;
import java.util.Scanner;
//Sea ​​battle game for two players.
//Each has one ship that the enemy must knock out.
public class Main {
	
	static Scanner sn = new Scanner(System.in);
	
	private static boolean isGameActive = true;

	public static void main(String[] args) {
		System.out.println("Player1, please enter your name:");		
		String tast1 =sn.nextLine();		
		
		Player one = new Player(tast1, 1);
	
		System.out.println("Player2, please enter your name:");		
		String tast2 =sn.nextLine();
		
		Player two = new Player(tast2, 1);
		
		
		System.out.println(one.getName() + " Please place your ships on the battlefield.");		
		System.out.println("Please give your X coordinate of your ship :");
		int x1 = sn.nextInt();
		System.out.println("Please give your Y coordinate of your ship :");
		int y1 = sn.nextInt();
		
		Ship s1P1 = new Ship(1);
		s1P1.addCoordinate(new Cell(x1,y1));
		
		one.addShip(s1P1);
		

		
		System.out.println(two.getName() + " Please place your ships on the battlefield.");		
		System.out.println("Please give your X coordinate of your ship :");
		int x2 = sn.nextInt();
		System.out.println("Please give your Y coordinate of your ship :");
		int y2 = sn.nextInt();		
		
		Ship s1P2 = new Ship(1);
		s1P2.addCoordinate(new Cell(x2,y2));
		
		two.addShip(s1P2);
		
		List<Player> players = new ArrayList<>();
		players.add(one);
		players.add(two);
		
		
		while(isGameActive) {
			Cell targetOne = enterCoordinate(one);
			checkGame(two, targetOne);
			
			Cell targetTwo = enterCoordinate(two);
			checkGame(one, targetTwo);
		}
	}
	
	private static Cell enterCoordinate(Player one) {
		System.out.println("[INFO] Player " + one.getName() + ": enter X coordinate");
		int x = sn.nextInt();
		System.out.println("[INFO] Player " + one.getName() + ": enter Y coordinate");
		int y = sn.nextInt();
		Cell target = new Cell(x, y);
		return target;
	}
	
	private static void checkGame(Player one, Cell target) {
		boolean isMissed = true;
		
		for (Ship s: one.getShips()) {
			for (Cell c : s.getCells()) {
				if (c.equals(target)) {
					s.getFired().add(target);
					System.out.println("You hit !!!");
					isMissed = false;
				}
			}
			if (s.getFired().size() == s.getSize()) {
				isGameActive = false;
			}
		}
		
		if (isMissed) {
			System.out.println(" Missed looser !");
		}
	}

}
