package mod226a.minesweeper;


/**
 * Substantive:
 * Field <-- Erstellt den Visuellen Bereich in der Konsole, Angabe mit bomben, Felder check nach Bomben drum herum
 * Input <-- Einnahme vom Input, Validation, Konvertierung zu Feld angabe
 * Random
 * Bombs   <-- Bekommen koordinaten, ins Feld eingefügt
 * AreaCheck
 */


public class MineSweeper {

    static Play play = new Play();

    public static void main(String[] args) {
        play.start();
    }

}
