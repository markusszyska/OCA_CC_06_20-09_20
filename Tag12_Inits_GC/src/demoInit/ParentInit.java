package demoInit;

public class ParentInit extends GrandParentInit{

	static {
		System.out.println("Parent static init block");
	}
	{
		System.out.println("Parent non static init block");
	}
	public ParentInit() {
		System.out.println("ParentInit constructor");
	}
}
