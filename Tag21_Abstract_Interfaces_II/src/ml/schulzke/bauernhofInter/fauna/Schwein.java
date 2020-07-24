package ml.schulzke.bauernhofInter.fauna;

import ml.schulzke.bauernhofInter.IEssbar;

public class Schwein extends Tier  implements IEssbar{
	
	public Schwein(){
		this.setFood(3);
	}

	@Override
	void machGeraeusch() {
		System.out.println("Grunz");
	}

	public
	void frisst(IEssbar p) {
		System.out.println("Grunz frisst:"); p.wirdGefressen();
	}

	@Override
	public void wirdGefressen() {
		System.out.println("Schwein wird gefressen!");
	}

}
