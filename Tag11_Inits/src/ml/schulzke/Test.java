package ml.schulzke;

public class Test {

	public static void main(String[] args) {
		Dreieck d = new Dreieck();
		System.out.println (d.umfang());
		System.out.println(d.umfang(d.getP1(), d.getP2(), d.getP3()));
	}

}