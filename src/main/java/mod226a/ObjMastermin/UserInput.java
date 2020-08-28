package mod226a.ObjMastermin;

import java.util.Scanner;

public class UserInput {

    UserCode userCode;

    Scanner input = new Scanner(System.in);

    /**
     * Deklarierung des userCodes per Input des Spielers
     */

    public void takeInput(){
        userCode = new UserCode(input.nextLine());
    }

    /**
     * Gibt einem den Code,den der Spieler eingegeben hat als String zurück
     * @return Zurückgeben des Codes als String.
     */

    public String getUserCode(){
        return this.userCode.userCode;
    }
}
