package ml.schulzke.bauernhofInter.fauna;

import ml.schulzke.bauernhofInter.IEssbar;

public class Wolf extends Tier implements IEssbar{
	
	public Wolf(){
		this.setFood(1);
	}

	@Override
	void machGeraeusch() {
		System.out.println("mimimimi - Jack haette auch auf die Holzverkleidung gepasst");
		
	}

	public void frisst(IEssbar p) {
		System.out.println();		
		if(p==this) {
			System.out.println("Wolf jagt seinen eigenen Schwanz!");
		}else if(p.getClass().getSimpleName().equals("Meat")||p.getClass().getSuperclass().getSimpleName().equals("Tier")) {
			System.out.println("Wolf frisst:"); p.wirdGefressen();
		}else {
			System.out.println("Wolf frisst kein vegetarisch, nur Vegetarierer!"); 
		}
	}

	@Override
	public void wirdGefressen() {
		System.out.println("Wolf wird gefressen!"); 
		
	}

}
