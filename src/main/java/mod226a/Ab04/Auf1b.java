package mod226a.Ab04;

import java.util.Arrays;
import java.util.Random;

public class Auf1b {

    public static int[][][] temp = new int[6][3][4];
    public static int min = 100;

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print("( ");
                for (int l = 0; l < 4; l++) {
                    temp[i][k][l] = random();
                    if (temp[i][k][l] < min) {
                        min = temp[i][k][l];
                    }
                    System.out.print(temp[i][k][l] + " ");
                }
                System.out.print(") ");
            }
            System.out.print("\n");
        }
        posOutput();


    }

    private static int random() {
        Random rand = new Random();
        int ran = rand.nextInt(11) + 20;
        return ran;
    }

    public static void posOutput() {
        System.out.println("Minimum der Zahlen ist: " + min + ", an der Position: ");
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 3; k++) {
                for (int l = 0; l < 4; l++) {
                    if (temp[i][k][l] == min)
                        System.out.println("Zeile: " + (i + 1) + " Gruppe: " + (k + 1) + " Element: " + (l + 1));
                }
            }
        }
    }
}
