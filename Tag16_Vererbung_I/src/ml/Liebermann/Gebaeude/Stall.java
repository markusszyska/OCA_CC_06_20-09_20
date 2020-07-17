package ml.Liebermann.Gebaeude;

import ml.Liebermann.Items.Tuer;
import ml.Liebermann.Lebewesen.Kuh;
import ml.Liebermann.Lebewesen.Schwein;

public class Stall {
	private Tuer tuer = new Tuer();
	private Schwein[] schweineImStall = new Schwein[10];
	private Kuh[] kueheImStall = new Kuh[10];

	public Stall() {

	}

	public void setSchweinToStall(Schwein refSchwein) {
		boolean passtRein = false;
		for (int i = 0; i < schweineImStall.length; i++) {
			if (schweineImStall[i] == null) {
				schweineImStall[i] = refSchwein;
				passtRein = true;
				break;
			}
		}
		if (!passtRein) {
			System.out.println("Der Schweinekäfig ist voll!");
		}
	}

	public Schwein getSchweinByName(String name) {
		Schwein refSchwein = null;
		for (int i = 0; i < schweineImStall.length; i++) {
			if (schweineImStall[i] != null) {
				if (schweineImStall[i].getName().equalsIgnoreCase(name)) {
					refSchwein = schweineImStall[i];
				}
			}
		}
		if (refSchwein == null) {
			System.out.println("Dieses Schwein gibt es nicht im Stall");
		}
		return refSchwein;
	}

	public void setKuhToStall(Kuh refKuh) {
		boolean passtRein = false;
		for (int i = 0; i < kueheImStall.length; i++) {
			if (kueheImStall[i] == null) {
				kueheImStall[i] = refKuh;
				passtRein = true;
				break;
			}
		}
		if (!passtRein) {
			System.out.println("Der Kuhkäfig ist voll!");
		}
	}

	public Kuh getKuhByName(String name) {
		Kuh refKuh = null;
		for (int i = 0; i < kueheImStall.length; i++) {
			if (kueheImStall[i] != null) {
				if (kueheImStall[i].getName().equalsIgnoreCase(name)) {
					refKuh = kueheImStall[i];
				}
			}
		}
		if (refKuh == null) {
			System.out.println("Diese Kuh gibt es nicht im Stall");
		}
		return refKuh;
	}

	public boolean delKuhByRef(Kuh refKuh) {
		boolean verkauft = false;
		for (int i = 0; i < kueheImStall.length; i++) {
			if (kueheImStall[i] == refKuh) {
				kueheImStall[i] = null;
				verkauft = true;
			}
		}
		return verkauft;
	}

	public boolean delSchweinByRef(Schwein refSchwein) {
		boolean verkauft = false;
		for (int i = 0; i < schweineImStall.length; i++) {
			if (schweineImStall[i] == refSchwein) {
				schweineImStall[i] = null;
				verkauft = true;

			}
		}
		return verkauft;
	}

	public Tuer getTuer() {
		return tuer;
	}

	public void setTuer(Tuer tuer) {
		this.tuer = tuer;
	}

	public Schwein[] getSchweineImStall() {
		return schweineImStall;
	}

	public void setSchweineImStall(Schwein[] schweineImStall) {
		this.schweineImStall = schweineImStall;
	}

	public Kuh[] getKueheImStall() {
		return kueheImStall;
	}

	public void setKueheImStall(Kuh[] kueheImStall) {
		this.kueheImStall = kueheImStall;
	}

	public boolean isOffen() {
		return tuer.isOffen();
	}

}
