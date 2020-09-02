package mod226a.minesweeper;

public class Cell {

    int xCoordinate;
    int yCoordinate;

    int bombsInArea = 0;

    boolean marked = false;

    String style;

    boolean isBomb = false;

    public Cell(int xCoordinate, int yCoordinate, boolean isBomb){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.isBomb = isBomb;
    }

    public void mark(int xCoordinate, int yCoordinate){

    }

    public void uncover(int xCoordinate, int yCoordinate, String style){

    }

    public String inAreatoString(){
        return Integer.toString(bombsInArea);
    }

}
