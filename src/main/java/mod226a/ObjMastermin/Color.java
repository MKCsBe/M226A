package mod226a.ObjMastermin;

public enum Color {

    RED('r',0),
    BLUE('b',1),
    GREEN('g',2),
    YELLOW('y',3),
    BLACK('s',4),
    WHITE('w', 5);

    char color;
    int index;

    Color(char color, int index){
        this.color = color;
        this.index = index;
    }


}
