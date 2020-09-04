package mod226a.minesweeper;

public class Cell {

    /**
     * Erstellen der Eigenschaften
     */

    int xCoordinate;
    int yCoordinate;

    int bombsInArea = 0;

    boolean marked = false;
    boolean uncovered = false;

    String style;

    boolean isBomb = false;

    /**
     * Cell ist der Konstruktor von der Klasse Cell
     * @param xCoordinate gibt die Zeile an
     * @param yCoordinate gibtb die Spalte an
     * @param isBomb Zeigt ob es eine Bombe oder nicht ist
     */

    public Cell(int xCoordinate, int yCoordinate, boolean isBomb) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.isBomb = isBomb;
    }

    /**
     * setStyle ändert den Inhalt der angezeigt wird von einer Cell
     */

    public void setStyle() {
        if (uncovered && !isBomb) {
            style = Integer.toString(bombsInArea);
            uncovered = true;
        }
        else if (isBomb && uncovered){
            style = "*";
        }
        else if (marked){
            style = "!";
        } else style = " ";
    }

    /**
     * mark verändert den Wert marked
     */
    public void mark(){
        if (marked) marked = false;
        else marked = true;
    }

    /**
     * uncover ändert den wert von uncovered
     */

    public void uncover() {
        uncovered = true;
    }

}
