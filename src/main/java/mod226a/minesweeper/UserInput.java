package mod226a.minesweeper;

import java.util.Scanner;

public class UserInput {

    Scanner input = new Scanner(System.in);
    Controller control = new Controller();

    /**
     * Erstellen der Eigenschaften
     */

    int xUserCoordinate;
    int yUserCoordinate;
    String userCellStyle;
    int markcounter = 0;

    /**
     * nimmt die Spielereingabe entgegen
     */

    public void takeInput() {
        boolean incorrect = true;
        do {
            try {
                userCellStyle = input.next();
                if (userCellStyle.length() == 1) {
                    xUserCoordinate = input.nextInt();
                    yUserCoordinate = input.nextInt();
                    incorrect = false;
                } else System.out.println("Falsche Eingabe");
            } catch (Exception e) {
                System.out.println("Falsch eingegeben!");
                incorrect = true;
            }
        } while (incorrect);
    }

    /**
     * überprüft was genau eingegeben wurde
     * @param cells Alle Cell Objekte
     * @param x Zeilenangabe
     * @param y Spaltenangabe
     */

    public void checkAction(Cell[][] cells, int x, int y) {
        if (userCellStyle.equals("T")) {
            cells[x][y].uncover();
            cells[x][y].setStyle();
            control.uncoverAllZerosAround(cells);
        } else if (userCellStyle.equals("M")) {
            if (cells[x][y].marked ) {
                markcounter -= 1;
                cells[x][y].mark();
                cells[x][y].setStyle();
            }
            else if (!cells[x][y].marked && markcounter < 10) {
                cells[x][y].mark();
                cells[x][y].setStyle();
                markcounter += 1;
            }
        } else System.out.println("Bitte nur M oder T");

    }
}
