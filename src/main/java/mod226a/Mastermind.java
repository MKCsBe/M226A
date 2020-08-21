package mod226a;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {

    public static char[] colours = {'r', 'g', 'b', 'y', 'w', 's'};
    public static char[] code = new char[4];
    public static char[] trial = new char[4];
    public static Scanner input = new Scanner(System.in);
    public static int tries;
    public static boolean end;

    public static void main(String[] args) {
        Play(code, trial, colours);
    }

    public static int randInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static int inArray(char[] trial, char[] code) {
        int has = 0;

        char[] pseudocode = code.clone();
        char[] pseudotrial = trial.clone();

        for (int i = 0; i < code.length; i++) {
            for (int k = 0; k < code.length; k++)
                if (pseudocode[k] == pseudotrial[i]) {
                    has += 1;
                    pseudocode[k] = 'k';
                    pseudotrial[i] = 'i';
                }
        }

        return has;
    }

    public static int samePos(char[] trial, char[] code) {
        int has = 0;

        for (int i = 0; i < code.length; i++) {
            if (trial[i] == code[i])
                has += 1;
        }

        return has;
    }

    public static void generateCode(char[] code, char[] colours) {
        for (int i = 0; i < 4; i++) {
            int r = randInt(0, 5);
            code[i] = colours[r];
        }
    }

    public static void Play(char[] code, char[] trial, char[] colours) {
        generateCode(code, colours);
        String written = "";
        while (!end) {
            tries += 1;
            output();
            try {
                written = input.nextLine();
                if (written.length() == 4 && contains(written, colours)) {
                    for (int i = 0; i < written.length(); i++) {
                        trial[i] = written.charAt(i);
                    }
                    tryResult(trial, code);
                    if (samePos(trial, code) == 4) {
                        end = true;
                    }
                }
                else System.out.println("Falsche Eingabe");
            } catch (Exception e) {
                System.out.println("Nochmal");
            }
        }
        gameEnd(tries, written);
    }

    public static boolean contains(String written, char[] colours) {
        boolean cont;
        int counter = 0;

        for (char c : colours)
            for (int i = 0; i < written.length(); i++)
            {
                if (c == written.charAt(i))
                    counter += 1;
            }

        if (counter == 4)
            cont = true;
        else cont = false;
        return cont;
    }

    public static void gameEnd(int tries, String code)
    {
        System.out.println("Spiel beendet. Geheimcode war " + code + " Anzahl Versuche war: " + tries);
    }

    public static void tryResult(char[] trial,char[] code)
    {
        System.out.println("Richtige Position: " + samePos(trial, code) + " Richtige Farbe: " + (inArray(trial, code) - samePos(trial,code)));
    }

    public static void output()
    {
        System.out.println("Geben Sie einen Versuchscode mit vier Buchstaben aus der Menge (r,g,b,y,s,w) ein: ");
    }

    /**
     * HAAAAAA
     */
}
