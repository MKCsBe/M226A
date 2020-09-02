package mod226a.ab05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Auf1 {

    public static void main(String[] args) {

        int i1 = 0;
        int i2 = 0;
        int op = 0;
        String i11 = "Operand1";
        String i22 = "Operand2";
        String oper = "Operator";

        int result = 0;

        i1 = inputValidator(i11);
        i2 = inputValidator(i22);
        op = inputValidator(oper);


        System.out.println("Ergebnis: " + calc(i1, i2, op));
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
                if (operand2 == 0) {
                    System.out.println("Division mit 0 nicht möglich. Defaultergebnis 0!");
                    return 0;
                } else return operand1 / operand2;
            case 5:
                return operand1 % operand2;
            default:
                System.out.println("Ungültiger Operatorwert!");
                return 0;
        }
    }

    public static int inputValidator(String opera) {
        int op;
        while (true) {
            Scanner input = new Scanner(System.in);
            try {
                System.out.println(opera + " bitte: ");
                op = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Eingabefehler");
            }
        }
        return op;
    }
}
