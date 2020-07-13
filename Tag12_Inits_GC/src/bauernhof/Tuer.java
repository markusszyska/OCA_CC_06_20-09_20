package bauernhof;

public class Tuer {
	private int id;
	private boolean open;
	private Schluessel key;
	
	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Tuer() {
		
	}
}
