package zeitner.switchcase;

public class SwitchCase {
	public static void main(String[] args) {
		String wert = "mini";
		switch (wert) {
		case "maxi": {
			int a = 1;
			System.out.println("nur maxi konfiguration durchgeführt a = " + a);
			break;
		}
		case "medium": {
			int a = 2;
			System.out.println("nur medium konfiguration durchgeführt a = " + a);
			break;
		}
		case "mini": {
			int a = 3;
			System.out.println("nur mini konfiguration durchgeführt a = " + a);
			break;
		}
		}
	}
}
