package mod226a.ObjMastermin;

public class Check {

    public int correctColor(Code userCode, Code code) {
        int has = 0;
        char[] tryCode = userCode.userCodeToCharArray();
        char[] secretCode = code.CodeToCharArray();

        //noinspection DuplicatedCode
        for (int i = 0; i < secretCode.length; i++) {
            for (int k = 0; k < tryCode.length; k++)
                if (tryCode[k] == secretCode[i]) {
                    has += 1;
                    tryCode[k] = 'k';
                    secretCode[i] = 'i';
                }
        }
        return has;
    }

    public int inCorrectPos(Code userCode, Code code) {
        int has = 0;
        char[] tryCode = userCode.userCodeToCharArray();
        char[] secretCode = code.CodeToCharArray();

        //noinspection DuplicatedCode
        for (int i = 0; i < secretCode.length; i++) {
                if (tryCode[i] == secretCode[i]) {
                    has += 1;
                }
        }
        return has;
    }


}
