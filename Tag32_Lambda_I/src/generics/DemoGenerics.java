package generics;

public class DemoGenerics {
	public static void main(String[] args) {
		Stall<Kuh> kuhStall = new Stall<Kuh>();
		Stall<Schwein> schweineStall = new Stall<Schwein>();
		
//		schweineStall.stelleTierRein(new Kuh());
		schweineStall.stelleTierRein(new Schwein());
	}
}

class Stall<T> {
	T boxen;

	public void stelleTierRein(T tier) {

	}
}
class Kuh{}

class Schwein{}