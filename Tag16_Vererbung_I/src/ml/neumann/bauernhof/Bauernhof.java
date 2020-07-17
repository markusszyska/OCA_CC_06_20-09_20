package ml.neumann.bauernhof;

import ml.neumann.bauernhof.fauna.Bauer;
import ml.neumann.bauernhof.gebaeude.Stall;

public class Bauernhof {
	Stall bauernhofStall; 
	Bauer bauernhofname;

public Stall getBauernhofStall() {
	return bauernhofStall;
}
public void setBauernhofStall(Stall bauernhofStall) {
	this.bauernhofStall = bauernhofStall;
}
public Bauer getBauernhofname() {
	return bauernhofname;
}
public void setBauernhofname(Bauer bauernhofname) {
	this.bauernhofname = bauernhofname;
}

//Konstruktoren 
public Bauernhof () {
	this.setBauernhofStall(new Stall());
}

public Bauernhof(Stall bauernhofStall, Bauer bauernhofname) {
	this.bauernhofStall = bauernhofStall;
	this.bauernhofname = bauernhofname;
}

}
