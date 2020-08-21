package mod226a.Ab05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Auf1 {

    public static void main(String[] args) {

        int i1 = 0;
        int i2 = 0;
        int op = 0;

        int result = 0;

        while (true)
        {
            Scanner input = new Scanner(System.in);
            try {
                System.out.println("Operand1 bitte: ");
                i1 = input.nextInt();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Eingabefehler");
            }
        }
        while (true)
        {
            Scanner input = new Scanner(System.in);
            try {
                System.out.println("Operand2 bitte: ");
                i2 = input.nextInt();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Eingabefehler");
            }

        }
        while (true)
        {
            Scanner input = new Scanner(System.in);
            try {
                System.out.println("Operator bitte: ");
                op = input.nextInt();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Eingabefehler");
            }
        }


        System.out.println("Ergebnis: " + calc(i1,i2,op));
    }

    public static int calc(int operand1, int operand2, int operator) {

        switch (operator) {
            case 1:
                return operand1 + operand2;
            case 2:
                return operand2 - operand1;
            case 3:
                return operand1 * operand2;
            case 4:
                return operand1 / operand2;
            case 5:
                return operand1 % operand2;
            default:
                System.out.println("Ungültiger Operatorwert!");
                return 0;
        }
    }
}
