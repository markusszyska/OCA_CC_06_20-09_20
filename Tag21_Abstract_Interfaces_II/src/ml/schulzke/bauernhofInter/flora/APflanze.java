package ml.schulzke.bauernhofInter.flora;

import ml.schulzke.bauernhofInter.IEssbar;

public class APflanze implements IEssbar{
	

	@Override
	public void wirdGefressen() {
		System.out.println("Gemuese wird gefressen");	
		
	}

	@Override
	public void frisst(IEssbar p1) {
		// TODO Auto-generated method stub
		
	}
}
