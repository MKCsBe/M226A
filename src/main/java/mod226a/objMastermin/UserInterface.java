package mod226a.objMastermin;

public class UserInterface {

    /**
     * Instanuierung eines Objektes der Check Klasse.
     */

    Check check = new Check();

    /**
     * firstOutput wird vor allen Eingaben aufgerufen und soll einem einfach nur die Regeln zum Spiel näher bringen.
     */

    public void firstOutput()
    {
        System.out.println("Geben Sie einen Versuchscode mit vier Buchstaben aus der Menge (r,g,b,y,s,w) ein: ");
    }

    /**
     * gameEnd wird genutzt sobald das Spiel gewonnen ist, und gibt eine letzte Ausgabe.
     * @param tries Anzahl der Versuche die benötigt wurden.
     * @param code  der Code, der richtig war.
     */

    public void gameEnd(int tries, UserCode code)
    {
        System.out.println("Spiel beendet. Geheimcode war " + code.userCode + " Anzahl Versuche war: " + tries);
    }

    /**
     * tryResult gibt dem Spieler den Output wie viele richtig waren und wie viele an der Falschen stelle waren.
     * @param userCode Der Code den der Spieler eingegeben hat.
     * @param code Der gesuchte geheime Code.
     */

    public void tryResult(UserCode userCode, SecretCode code)
    {
       System.out.println("Richtige Position: " + check.inCorrectPos(userCode, code) + " Richtige Farbe: " + (check.correctColor(userCode, code) - check.inCorrectPos(userCode,code)));
    }
}
