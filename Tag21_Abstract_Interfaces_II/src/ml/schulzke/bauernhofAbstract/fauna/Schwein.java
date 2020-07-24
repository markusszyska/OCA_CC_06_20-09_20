package ml.schulzke.bauernhofAbstract.fauna;

import ml.schulzke.bauernhofAbstract.flora.APflanze;

public class Schwein extends ATier{

	@Override
	void machGeraeusch() {
		System.out.println("Grunz");
	}

	@Override
	public
	void frisst(APflanze p) {
		System.out.println("Grunz frisst:"); p.wirdGefressen();
	}

}
