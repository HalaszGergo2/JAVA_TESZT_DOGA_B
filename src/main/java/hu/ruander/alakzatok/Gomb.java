package hu.ruander.alakzatok;

public class Gomb extends FemAlakzat {
    private double v;

    public Gomb(double v) {
        this.v = v;
    }

    @Override
    double terfogat() {
        return 4.188;
    }

    @Override
    public double suly() {
        return v*getFajsuly();
    }
}
