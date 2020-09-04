package mod226a.minesweeper;

public class Play {

    /**
     * Instanzieren von nötigen Objekten
     */

    UserInterface userInterface = new UserInterface();
    UserInput input = new UserInput();
    Field field = new Field();
    Cell[][] cells = new Cell[8][8];
    Controller control = new Controller();

    /**
     * generiert alle Cell Objekte
     * Zeigt das Feld
     * Gibt den Syntax an
     * Nimmt Spieler eingabe
     * Speichert diese in Variablen
     * Überprüft eingabe
     * überprüft ob es eine Bombe war wenn der spieler sie umdreht
     * überprüft ob das Spiel gewonnen wurde
     * Alles in einem Loop bis das Spiel gewonnen oder verloren wurde
     *
     * Wenn gewonnen wird ausgabe "Du hast gewonnen"
     * Ansonsten "Du hast verloren"
     */

    public void start() {
            field.generate(cells);
        do {
            userInterface.showField(cells);
            userInterface.commandHint();
            input.takeInput();
            int x = input.xUserCoordinate;
            int y = input.yUserCoordinate;
            System.out.println(x+ " " + y);
            input.checkAction(cells, x, y);
            if (input.userCellStyle.equals("T"))
            control.checkIfInputIsBomb(cells, x, y);
            control.checkIfGameWon(cells);
        } while (!control.gameEnd);

        if (control.win) System.out.println("Du hast gewonnen");
        else System.out.println("Du hast verloren");

    }

}
