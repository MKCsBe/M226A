package mod226a.ObjMastermin;

public class Play {

    /**
     * Instanzierung der Variable für die Anzahl Versuche (tries)
     * Deklarierung von Objekten der Klassen: InputValidator, Check, UserInput, UserInterface, UserCode, SecretCode und CodeGenerator.
     */

    int tries;
    InputValidator validator = new InputValidator();
    Check checker = new Check();
    UserInput input = new UserInput();
    UserInterface userinterface = new UserInterface();
    UserCode inputCode;
    SecretCode secretCode;
    CodeGenerator generator = new CodeGenerator();


    /**s
     * Z.25 erstellung des PseudoRandom Codes.
     * Z.26 Deklarieren einer Boolean.
     * Z.27-42 While loop der solange gemacht wird bis die eingabe korrekt ist und das Spiel
     * gewonnen wurde falls es eine falsche Eingabe gibt wird es wiederholt und wenn nicht wird geschaut was richtig war
     * Z.46 Aufgerufen wenn das Spiel gewonnen wurde und gibt den End output.
     */

    public void game() {
        secretCode = new SecretCode(generator.generateCode());
        boolean end = false;
        while (!end) {
            tries += 1;
            userinterface.firstOutput();
            try {
                input.takeInput();
                inputCode = new UserCode(input.getUserCode());
                if (validator.completeValidation(inputCode)) {
                    userinterface.tryResult(inputCode, secretCode);
                    if (checker.inCorrectPos(inputCode, secretCode) == 4)
                        end = true;
                } else System.out.println("Falsche Eingabe");
            } catch (Exception e) {
                System.out.println("Nochmal");
            }
        }
        userinterface.gameEnd(tries, inputCode);
    }

}
