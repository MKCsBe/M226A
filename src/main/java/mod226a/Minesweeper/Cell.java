package mod226a.Minesweeper;

public class Cell {

    int xCoordinate;
    int yCoordinate;

    int bombsInArea = 0;

    boolean marked = false;

    String style;
    String description;

    public Cell(int xCoordinate, int yCoordinate, String style, String description){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.style = style;
        this.description = description;
    }

    public void mark(int xCoordinate, int yCoordinate){

    }

    public void uncover(int xCoordinate, int yCoordinate, String style){

    }

}
