package mod226a.objMastermin;

public class Check {

    /**
     * Zählt die Menge der Farben an der Richtigen Position.
     * @param userCode Code des Spielers.
     * @param code Geheimer Code.
     * @return gibt die Menge an richtigen Farbe zurück.
     */

    public int correctColor(UserCode userCode, SecretCode code) {
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

    /**
     * Kontrolliert was an der richtigen Position ist und wie viele.
     * @param userCode Code des Spielers.
     * @param code Geheimer Code.
     * @return gibt die Menge an richtigen Positionen zurück.
     */

    public int inCorrectPos(UserCode userCode, SecretCode code) {
        int has = 0;
        char[] tryCode = userCode.userCodeToCharArray();
        char[] secretCode = code.CodeToCharArray();

        for (int i = 0; i < secretCode.length; i++) {
                if (tryCode[i] == secretCode[i]) {
                    has += 1;
                }
        }
        return has;
    }


}
