package mod226a.Minesweeper;

public class Cell {

    int xCoordinate;
    int yCoordinate;

    int bombsInArea;

    boolean marked = false;

    String style;

    public Cell(int xCoordinate, int yCoordinate, String style){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.style = style;
    }

    public void mark(int xCoordinate, int yCoordinate){

    }

    public void uncover(int xCoordinate, int yCoordinate, String style){

    }

}
