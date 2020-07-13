package ml.vi.bauernhof;

public class Stall {

	public Schwein schwein;
	public Stall s;
	private boolean isOpen = true;
	private int key = 123;
	
	public void open(int key) {
		
		if(key == this.key)
			isOpen = true;
		System.out.println("Tür ist offen: " + isOpen);
		
	}
	
	public void close(int key) {
		
		if(key == this.key)
			isOpen = false;
		System.out.println("Tür ist offen: " + isOpen);
		
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	

	
}
