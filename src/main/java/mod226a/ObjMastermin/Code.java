package mod226a.ObjMastermin;

public class Code {

    String userCode;
    char[] code;

    public Code(String code){
        userCode = code;
    }

    public Code(char[] code){
        this.code = code;
    }

    public char[] userCodeToCharArray(){
        String usercode = String.valueOf(this.userCode);
        char[] charcode = usercode.toCharArray();
        return charcode;
    }

    public char[] CodeToCharArray(){
        String code = String.valueOf(this.code);
        char[] charcode = code.toCharArray();
        return charcode;
    }

    public String userCodeToString(){
        String code = String.valueOf(this.code);
        return code;
    }

}
