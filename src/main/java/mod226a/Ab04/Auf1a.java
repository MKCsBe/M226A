package mod226a.Ab04;

import java.util.Arrays;
import java.util.Random;

public class Auf1a {

    public static void main(String[] args) {

        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = random();
        }

        System.out.println("Unsortierte Zahlen: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Soriterte Zahlen: " + Arrays.toString(arr));
    }

    public static int random()
    {
        Random rand = new Random();
        int ran = rand.nextInt(50) + 1;
        return ran;
    }
}
