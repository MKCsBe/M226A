package mod226a.minesweeper;

import java.util.Scanner;

public class ChosenField {

    Scanner input = new Scanner(System.in);

    int xUserCoordinate;
    int yUserCoordinate;
    String userCellStyle;


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
}
