package mod226a.minesweeper;


public class Field {

    /**
     * Instanzierund von Objekten
     */

    Randomizer rand = new Randomizer();
    Controller controller = new Controller();

    /**
     *  erstellt alle Cell Objekte in einem Array
     * @param cells Alle Cell Objekte
     */
    public void generate(Cell[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int k = 0; k < cells.length; k++) {
                cells[i][k] = new Cell(i, k, false);
                cells[i][k].setStyle();
            }
        }
        generateBombs(cells);
        controller.increaseCellBombCountAround(cells);
    }

    /**
     * Erstellt 10 Bomben
     * @param cells Alle Cell Objekte
     */
    public void generateBombs(Cell[][] cells) {

        for (int i = 0; i < 10; i++) {
            int x = rand.randomX();
            int y = rand.randomY();
            if (!cells[x][y].isBomb) {
                cells[x][y].isBomb = true;
                cells[x][y].bombsInArea = -1;
            } else i -= 1;
        }
    }

}
