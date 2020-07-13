package demoInit;

public class GrandParentInit {
	static {
		System.out.println("GrandParentInit static init block");
	}
	{
		System.out.println("GrandParentInit non static init block");
	}
	public GrandParentInit() {
		System.out.println("GrandParentInit constructor");
	}
}
