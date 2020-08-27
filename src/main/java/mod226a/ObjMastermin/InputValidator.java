package mod226a.ObjMastermin;

public class InputValidator {


    public boolean completeValidation(Code userCode) {
        String code = userCode.userCodeToString();
        if (code.length() == 4 && contains(userCode))
            return true;
        else return false;
    }

    public boolean contains(Code userCode) {
        boolean cont;
        int counter = 0;
        String tryCode = userCode.userCodeToString();

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
