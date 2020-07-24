package ml.schulzke.bauernhofAbstract.fauna;

import ml.schulzke.bauernhofAbstract.flora.*;

public class Kuh extends ATier{
	@Override
	void machGeraeusch() {
		System.out.println("Muh");
	}

	@Override
	public
	void frisst(APflanze p) {
		System.out.println("Muh frisst:"); p.wirdGefressen();
	}
}
