package mod226a.minesweeper;

public class UserInterface {

    /**
     * Gibt dem Spieler den Syntax der eingabe
     */

    public void commandHint() {
        System.out.println("Geben Sie ein Kommando ein: ");
        System.out.println("T x y (z.B. T 2 3 testet auf Feld Zeile 2, Spalte 3 auf Mine");
        System.out.println("M x y (z.B. M 6 1 kehrt Markierung Feld Zeile 6, Spalte 1");
    }

    /**
     * Zeigt dem Spieler das Spielfeld an
     * @param cells Alle Cell Objekte
     */

    public void showField(Cell[][] cells) {
        for (int i = 0; i < 9; i++) {
            if (i == 0)
                System.out.print("  0 1 2 3 4 5 6 7");
            else {
                System.out.print((i - 1) + " ");
                for (int k = 0; k < cells.length; k++) {
                    System.out.print(cells[i - 1][k].style + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
