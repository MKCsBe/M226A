package mod226a.ObjMastermin;

import java.util.Random;

public class CodeGenerator {

    RandomGenerator rand = new RandomGenerator();

    public void generateCode(char[] code) {
        for (int i = 0; i < 4; i++) {
            int r = rand.randInt(0,5);
            switch (r){
                case 0:
                    code[i] = Color.RED.getColor();
                    break;
                case 1:
                    code[i] = Color.BLUE.getColor();
                    break;
                case 2:
                    code[i] = Color.GREEN.getColor();
                    break;
                case 3:
                    code[i] = Color.YELLOW.getColor();
                    break;
                case 4:
                    code[i] = Color.BLACK.getColor();
                    break;
                case 5:
                    code[i] = Color.WHITE.getColor();
                    break;
            }
        }
    }

}
