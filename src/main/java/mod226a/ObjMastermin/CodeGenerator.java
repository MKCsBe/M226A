package mod226a.ObjMastermin;

import java.util.Random;

public class CodeGenerator {

    RandomGenerator rand = new RandomGenerator();

    char[] colours = new char[4];

    Code code;

    public void generateCode() {
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
        code = new Code(colours);
    }

    public Code getCode(){
        return this.code;
    }

}
