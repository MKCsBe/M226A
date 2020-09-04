package mod226a.objMastermin;

import java.util.Random;

public class RandomGenerator {


    /**
     * Erstellen einer PseudoRandom Zahl.
     * @param min kleinste zahl.
     * @param max grösste Zahl.
     * @return gibt eine Int in dem gewhählten bereich an.
     */
    public int randInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
