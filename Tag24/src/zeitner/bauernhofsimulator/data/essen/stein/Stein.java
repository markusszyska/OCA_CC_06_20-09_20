package zeitner.bauernhofsimulator.data.essen.stein;

import zeitner.bauernhofsimulator.data.IExplodierbar;
import zeitner.bauernhofsimulator.data.essen.IEssbar;

public class Stein implements IEssbar, IExplodierbar {

	@Override
	public void wirdgefressen(int menge) {
		System.out.println("Der Stein wurde gefressen");

	}

	@Override
	public void bumm() {
		System.out.println("Der Stein ist explodiert");
		
	}

}
