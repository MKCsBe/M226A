package mod226a.ObjMastermin;

public class InputValidator {

    /**
     * Überprüft ob alle Eingaben korrekt sind.
     * @param userCode Code des Spielers.
     * @return gibt wahr oder falsch zurück.
     */

    public boolean completeValidation(UserCode userCode) {
        String code = userCode.userCode;
        if (code.length() == 4 && contains(userCode))
            return true;
        else return false;
    }

    /**
     * Überprüft ob die eingabe in dem Color Enum enthalten sind.
     * @param userCode Code des Spielers.
     * @return gibt wahr oder falsch zurück.
     */

    public boolean contains(UserCode userCode) {
        boolean cont;
        int counter = 0;
        String tryCode = userCode.userCode;

        for (Color c : Color.values()) {
            for (int i = 0; i < tryCode.length(); i++) {
                if (c.color == tryCode.charAt(i))
                    counter += 1;
            }
        }

        if (counter == 4)
            cont = true;
        else cont = false;
        return cont;
    }
}
