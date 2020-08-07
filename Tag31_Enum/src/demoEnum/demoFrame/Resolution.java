package demoEnum.demoFrame;

public enum Resolution {
	SMALL(640, 480),MEDIUM(800, 600),LARGE(1024, 768);
	private final int width;
	private final int height;
	
	Resolution(int width, int height){
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	
	
}
