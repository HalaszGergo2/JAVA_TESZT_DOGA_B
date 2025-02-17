package hu.ruander.alakzatok;

public abstract class FemAlakzat {
    private static double fajsuly = 1.15;

    abstract double terfogat();

    public static double getFajsuly() {
        return fajsuly;
    }
}
