package ml.assmann.farm.objects;

public class Farm {

	/*
	 * Attribute
	 */
	private Barn barn;

	/*
	 * Getter/Setter
	 */
	public Barn getBarn() {
		return this.barn;
	}

	public void setBarn(Barn barn) {
		this.barn = barn;
	}

	/*
	 * Constuctors
	 */
	public Farm() {
		this.setBarn(new Barn());
	}
}
