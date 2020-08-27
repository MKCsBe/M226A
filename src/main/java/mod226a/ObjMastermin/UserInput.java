package mod226a.ObjMastermin;

import java.util.Scanner;

public class UserInput {

    UserCode userCode;

    Scanner input = new Scanner(System.in);

    public void takeInput(){
        userCode = new UserCode(input.nextLine());
    }

    public String getUserCode(){
        return this.userCode.userCode;
    }
}
