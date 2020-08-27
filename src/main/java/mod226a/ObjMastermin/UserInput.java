package mod226a.ObjMastermin;

import java.util.Scanner;

public class UserInput {

    Code userCode;

    Scanner input = new Scanner(System.in);

    public void takeInput(){
        userCode = new Code(input.nextLine());
    }

    public Code getUserCode(){
        return userCode;
    }
}
