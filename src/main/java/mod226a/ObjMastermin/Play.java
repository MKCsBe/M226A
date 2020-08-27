package mod226a.ObjMastermin;

public class Play {

    int tries;
    InputValidator validator = new InputValidator();
    Check checker = new Check();
    UserInput input = new UserInput();
    UserInterface userinterface = new UserInterface();
    Code inputCode;
    Code secretCode;
    CodeGenerator generator = new CodeGenerator();

    public void game() {
        generator.generateCode();
        secretCode = generator.getCode();
        boolean end = false;
        while (!end) {
            tries += 1;
            userinterface.firstOutput();
            try {
                input.takeInput();
                inputCode = input.getUserCode();
                if (validator.completeValidation(inputCode)) {
                    userinterface.tryResult(inputCode, secretCode);
                    if (checker.inCorrectPos(inputCode, secretCode) == 4)
                        end = true;
                } else System.out.println("Falsche Eingabe");
            } catch (Exception e) {
                System.out.println("Nochmal");
            }
        }
        userinterface.gameEnd(tries, input.getUserCode());
    }

}
