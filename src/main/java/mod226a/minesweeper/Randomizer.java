package mod226a.minesweeper;

import java.util.Random;

public class Randomizer {

    Random rand = new Random();

    /**
     * Erstellen von einer Random
     * @return int zwischen 0-7
     */

    public int randomX() {
        return rand.nextInt(8);
    }
    /**
     * Erstellen von einer Random
     * @return int zwischen 0-7
     */
    public int randomY() {
        return rand.nextInt(8);
    }

}


