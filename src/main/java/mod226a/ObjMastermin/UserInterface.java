package mod226a.ObjMastermin;

public class UserInterface {

    Check check = new Check();

    public void firstOutput()
    {
        System.out.println("Geben Sie einen Versuchscode mit vier Buchstaben aus der Menge (r,g,b,y,s,w) ein: ");
    }

    public void gameEnd(int tries, UserCode code)
    {
        System.out.println("Spiel beendet. Geheimcode war " + code.userCodeToString() + " Anzahl Versuche war: " + tries);
    }

    public void tryResult(UserCode userCode, SecretCode code)
    {
       System.out.println("Richtige Position: " + check.inCorrectPos(userCode, code) + " Richtige Farbe: " + (check.correctColor(userCode, code) - check.inCorrectPos(userCode,code)));
    }
}
