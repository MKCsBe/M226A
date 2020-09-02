package mod226a.minesweeper;

public class UserInterface {

    public void commandHint() {
        System.out.println("Geben Sie ein Kommando ein: ");
        System.out.println("T x y (z.B. T 2 3 testet auf Feld Zeile 2, Spalte 3 auf Mine");
        System.out.println("M x y (z.B. M 6 1 kehrt Markierung Feld Zeile 6, Spalte 1");
    }

    public void outputPlayerInput(ChosenField chosenField) {
        System.out.println(chosenField.userCellStyle +
                chosenField.xUserCoordinate + chosenField.yUserCoordinate);
    }

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
