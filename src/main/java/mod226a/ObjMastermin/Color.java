package mod226a.ObjMastermin;

public enum Color {

    RED('r'),
    BLUE('b'),
    GREEN('g'),
    YELLOW('y'),
    BLACK('s'),
    WHITE('w');

    public char color;

    Color(char color){
        this.color = color;
    }

    public char getColor(){
        return this.color;
    }

}
