package exceptions_regeln.demo01throw_throws;

public class Demo02Throws {

	/*
	 * throws wird benutzt um an einer Methode den Hinweis anzuhaengen, dass eine
	 * Exception auftreten koennte, bzw um das Abfangen der Exception an die
	 * aufrufende Stelle weiterzuleiten.
	 * 
	 * Checked Exceptions verlangen eine Behandlung entweder per Try/Catch oder
	 * ueber das Delegieren an die naechst hoehere Stelle.
	 * 
	 * Unchecked Exceptions koennen, muessen jedoch nicht behandelt werden.
	 * Auch hier ist die Nutzung eines Try Catch Blockes oder eine
	 * Delegation moeglich
	 */
	public static void main(String[] args) {
		dividierenTryCatch(1.0, 1.0);
		
		try {
			dividierenOhneTryCatch(1.0, 1.0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static double dividierenTryCatch(double zahl1, double zahl2) {
		double result = 0;
		if (zahl2 == 0) {
			try {
				throw new Exception("Teiler war 0");
			} catch (Exception e) {
				System.out.println("Teiler wurde auf 1 gesetzt");
				zahl2 = 1;
			}
		}
		result = zahl1 / zahl2;
		return result;
	}

	public static double dividierenOhneTryCatch(double zahl1, double zahl2)throws Exception {
		double result = 0;
		if(zahl2 == 0) {
			throw new Exception("Teiler war 0");
		}
		System.out.println("Teiler war nicht 0");
		result = zahl1/zahl2;
		return result;
	}

	public static void weiterleiter() throws Exception {
		dividierenOhneTryCatch(1.0, 1.0);
	}

}
