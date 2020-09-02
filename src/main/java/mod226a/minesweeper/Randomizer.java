package mod226a.minesweeper;

import java.util.Random;

public class Randomizer {

    Random rand = new Random();

    public int randomX() {
        return rand.nextInt(8);
    }

    public int randomY() {
        return rand.nextInt(8);
    }

    public void createBombs(Cell[][] bombs) {

    }
}


