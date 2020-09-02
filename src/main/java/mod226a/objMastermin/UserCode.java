package mod226a.objMastermin;

public class UserCode {

    String userCode;

    /**
     * Konstrultor von UserCode mit dem String parameter.
     * @param code Eingabe welche zeichen der Code eig. hat.
     */

    public UserCode(String code){
        userCode = code;
    }

    /**
     * Umwandlung und rückgabe des userCode zu char array.
     * @return Rückgabe des userCodes als char array.
     */

    public char[] userCodeToCharArray(){
        String userCode = String.valueOf(this.userCode);
        return userCode.toCharArray();
    }

}
