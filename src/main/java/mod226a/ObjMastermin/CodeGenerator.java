package mod226a.ObjMastermin;

import java.util.Random;

public class CodeGenerator {

    RandomGenerator rand = new RandomGenerator();

    Color[] colours = new Color[4];

    Code code = new Code(colours);

    public void generateCode() {
        for (int i = 0; i < 4; i++) {
            String r = String.valueOf(rand.randInt(0, 5));
            colours[i] = Color.valueOf(r);
        }
    }

}
