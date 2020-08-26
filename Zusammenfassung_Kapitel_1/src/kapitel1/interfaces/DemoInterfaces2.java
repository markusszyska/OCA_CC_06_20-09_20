package kapitel1.interfaces;

/*
 * Betreff implements und extends:
 * 
 * Klassen:
 * - Eine Klasse kann nur von einer anderen Klasse erben.
 * - Eine Klasse kann beliebig viele Interfaces implementieren.
 * - Eine Klasse kann nicht von einem Interface erben.
 * 
 * Interfaces:
 * - Ein Interface kann von beliebig vielen Interfaces erben.
 * - Ein Interface kann kein Interface implementieren
 * - Ein Interface kann nur von Interfaces erben, nicht von Klassen
 * 
 */

public class DemoInterfaces2 implements I3,I4,I5{

}

interface I3 {}
interface I4{}
interface I5 extends I4, I3{}