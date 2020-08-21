package mod226a.Ab03;

import java.util.Random;

public class AufgabeXO {

    public static void main(String[] args) {

        char x = 'X';
        char o = 'O';
        char[] out;
        out = new char[10];
        int distance = 0;
        int index = 0;
        String outw = "";
        int z = out.length;

        for (int i = 0; i < 10; i++) {

            int rand = newRan();

            int runs = 0;
            for (int y = 0; y < out.length; y++)
            out[y] = o;
            outw = "";
            index = 0;
            distance = z/rand;

            while (runs < rand)
            {
                runs++;
                if (index < 10)
                out[index] = x;
                index = index + distance;
            }
            for (int y = 0; y < out.length; y++) {
                outw += out[y];
            }
            System.out.println("Zufallszahl: " + rand + "  " + outw);
        }
    }

    public static int newRan() {
        Random ran = new Random();
        int rand = ran.nextInt(4) + 1;
        return rand;
    }
}
