package mod226a.minesweeper;


public class Field {

    RandomCoordinates ranCoords = new RandomCoordinates();

    public void generate(Cell[][] cells, Bomb[] bombs) {
        for (int x = 0; x < cells.length; x++) {
            for (int y = 0; y < cells.length; y++) {
                for (Bomb bomb : bombs) {
                    if (x == bomb.xCoordinate && y == bomb.yCoordinate) {
                        cells[x][y] = new Cell(x, y, "*", "Bomb");
                        break;
                    } else cells[x][y] = new Cell(x, y, "0", "Normal");
                }
            }
        }
    }


    public void createBombs(Bomb[] bombs) {
        for (int i = 0; i < bombs.length; i++) {
            bombs[i] = new Bomb(ranCoords.randomX(), ranCoords.randomY());
        }
    }
}
