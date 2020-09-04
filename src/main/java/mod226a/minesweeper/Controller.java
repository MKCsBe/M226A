package mod226a.minesweeper;

public class Controller {

    /**
     * Erstellen der Eigenschaften
     * */

    boolean gameEnd = false;
    boolean win = false;

    /**
     * zählt wie viele Bomben drum herum sind
     * @param cells sind alle Cell Objekte
     */

    public void increaseCellBombCountAround(Cell[][] cells) {

        for (int x = 0; x < cells.length; x++) {
            for (int y = 0; y < cells.length; y++) {
                if (!cells[x][y].isBomb)
                    for (int i = -1; i < 2; i++) {
                        for (int k = -1; k < 2; k++) {
                            if ((x + i) >= 0 && (x + i) < cells.length && (y + k) >= 0 && (y + k) < cells.length) {
                                if (cells[x + i][y + k].isBomb)
                                    cells[x][y].bombsInArea += 1;
                            }
                        }
                    }
            }
        }

    }

    /**
     * deckt alle 0 auf die drum herum sind
     * @param cells alle Cell Objekte
     */

    public void uncoverAllZerosAround(Cell[][] cells) {
        for (int h = 0; h < cells.length; h++)
            for (int x = 0; x < cells.length; x++)
                for (int y = 0; y < cells.length; y++)
                    if (cells[x][y].uncovered && cells[x][y].bombsInArea == 0)
                        for (int i = -1; i < 2; i++)
                            for (int k = -1; k < 2; k++)
                                if ((x + i) >= 0 && (x + i) < cells.length && (y + k) >= 0 && (y + k) < cells.length) {
                                    cells[x + i][y + k].uncover();
                                    cells[x + i][y + k].setStyle();
                                }
    }

    /**
     * überprüft ob der Spieler auf eine bombe geklickt hat
     * @param cells Alle Cell Objekte
     * @param x Zeilenangabe
     * @param y Spaltenangabe
     */
    public void checkIfInputIsBomb(Cell[][] cells, int x, int y) {
        if (cells[x][y].isBomb) {
            gameEnd = true;
            win = false;
        }
    }

    /**
     * überprüft ob alle Bombem markiert sind
     * @param cells Alle Objekte der Klasse Cell
     */

    public void checkIfGameWon(Cell[][] cells) {
        int count = 0;
        for (int x = 0; x < cells.length; x++)
            for (int y = 0; y < cells.length; y++) {
                if(cells[x][y].isBomb)
                if (cells[x][y].style.equals("!")) count += 1;
            }
        if (count == 10) {
            gameEnd = true;
            win = true;
        }
        count = 0;
    }
}



