package bauernhof_final_vor_vererbung;

public class BauernhofMain {
	public static void main(String[] args) {
		Bauer b = new Bauer();
		System.out.println(b);
		System.out.println("------------Ab hier wird gefuttert--------");
		Kartoffel k = new Kartoffel();
		Moehre m = new Moehre();
		
		b.fuettern(b.getStall().getKuh(), k);
		
		
		
		
	}
	

}
