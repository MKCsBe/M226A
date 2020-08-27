package mod226a.ObjMastermin;

public class SecretCode {

    char[] code;

    public SecretCode(char[] code){
        this.code = code;
    }

    public char[] CodeToCharArray(){
        String code = String.valueOf(this.code);
        return code.toCharArray();
    }

    public String codeToString(){
        return this.code.toString();
    }

}
