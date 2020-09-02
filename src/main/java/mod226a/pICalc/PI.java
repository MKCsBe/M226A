package mod226a.pICalc;

public class PI {

    public static double calculate(){
        double piSquared = 0;
        double numerator = 1;
        double denominator = 1;

        for (int i = 1; i<1000;i++){
            piSquared = piSquared + (numerator/denominator);
            numerator = -numerator;
            denominator +=2;
        }
        System.out.print(piSquared * 4 );
        return piSquared * 4;
    }
}
