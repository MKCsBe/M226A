package mod226a.ObjMastermin;

public class CodeGenerator {

    /**
     * Deklarieren eines Objekts der RandomGenerator Klasse.
     */

    RandomGenerator rand = new RandomGenerator();

    char[] colours = new char[4];

    /**
     * Erstellen eines 4 stelligen codes über PseudoRandom zahlen.
     * @return gibt den char array zurück.
     */

    public char[] generateCode() {
        for (int i = 0; i < 4; i++) {
            int r = rand.randInt(0, 5);
            switch (r){
                case 0:
                    colours[i] = 'r';
                    break;
                case 1:
                    colours[i] = 'b';
                    break;
                case 2:
                    colours[i] = 'g';
                    break;
                case 3:
                    colours[i] = 'y';
                    break;
                case 4:
                    colours[i] = 's';
                    break;
                case 5:
                    colours[i] = 'w';
                    break;
            }
        }
        return colours;
    }
}
