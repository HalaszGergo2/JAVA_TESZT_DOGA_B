package hu.ruander;

import hu.ruander.alakzatok.FemAlakzat;

import java.util.ArrayList;

public class FemAlakzatokProgram {
    private ArrayList<FemAlakzat> femAlakzatok;

    public FemAlakzatokProgram() {
        this.femAlakzatok = new ArrayList<>();
    }

    public void ujAlakzat(FemAlakzat alakzat) {
        femAlakzatok.add(alakzat);
    }

    public ArrayList<FemAlakzat> getLista() {
        return femAlakzatok;
    }

}
