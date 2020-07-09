package ml.salastexido;

import ml.salastexido.bauernhofsimulator.Kuh;

public class Main {
    public static void main(String[] args) {
        Kuh kuh = new Kuh("Lola","White","Black",20,100);
        kuh.laufen();
        kuh.laufen();
        kuh.laufen();
        System.out.println("Die Kuh " + kuh.getName() + " hat " +  kuh.getGewicht() + " Kg Gewicht abgenommen" );

        kuh.freseen();
        kuh.freseen();
        System.out.println("Die Kuh " + kuh.getName() + " hat " +  kuh.getGewicht() + " Kg Gewicht zugenommen" );

        kuh.melken();
        kuh.melken();
        kuh.melken();
        kuh.melken();
        System.out.println("Die Kuh " + kuh.getName() + " hat " +  kuh.getMilchmenge() + " Milchmenge weniger" );
    }
}
