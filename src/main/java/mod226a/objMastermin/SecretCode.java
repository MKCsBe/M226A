package mod226a.objMastermin;

public class SecretCode {

    /**
     * Speichern des code als Char array zur verfügung stellen.
     */
    char[] code;

    /**
     * Konstruktor der Klasse SecretCode.
     * @param code char array der der Code ist.
     */

    public SecretCode(char[] code){
        this.code = code;
    }

    public char[] CodeToCharArray(){
        String code = String.valueOf(this.code);
        return code.toCharArray();
    }

}
