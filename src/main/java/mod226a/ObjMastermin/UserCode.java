package mod226a.ObjMastermin;

public class UserCode {

    String userCode;

    public UserCode(String code){
        userCode = code;
    }

    public char[] userCodeToCharArray(){
        String userCode = String.valueOf(this.userCode);
        return userCode.toCharArray();
    }

    public String userCodeToString(){
        String code = String.valueOf(this.userCode);
        return code;
    }
}
