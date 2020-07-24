package ml.schulzke.bauernhofInter.fauna;

import ml.schulzke.bauernhofInter.IEssbar;

public class Kuh extends Tier implements IEssbar{
	
	public Kuh(){
		this.setFood(0);
	}
	
	@Override
	void machGeraeusch() {
		System.out.println("Muh");
	}

	public
	void frisst(IEssbar p) {
		if(p.getClass().getSimpleName().equals("Meat")) {
			System.out.println("Muh isst kein Fleisch!");
		}else {
			System.out.println("Muh frisst:"); p.wirdGefressen();
		}
		
	}

	@Override
	public void wirdGefressen() {
		System.out.println("Muh wird gefressen!");
		
	}
}
