package dynamischeKonstruktoren;

public class Bouncer extends BodyBuilder{
	String who = "Ich bin ein Bouncer";
	
	public Bouncer() {
		super();
	}	
	public void whoAmI() {
		System.out.println(who);
	}
}
