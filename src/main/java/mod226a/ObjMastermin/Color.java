package mod226a.ObjMastermin;

public enum Color {

    /**
     * Aufzählung der möglichkeiten in Color.
     */

    RED('r'),
    BLUE('b'),
    GREEN('g'),
    YELLOW('y'),
    BLACK('s'),
    WHITE('w');

    char color;

    /**
     * Konstruktor für Color.
     * @param color char um auf die Color zuzugreifen.
     */
    Color(char color){
        this.color = color;
    }

}
