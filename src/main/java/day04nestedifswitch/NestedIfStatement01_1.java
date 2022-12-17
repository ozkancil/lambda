package day04nestedifswitch;

import java.util.Scanner;

public class NestedIfStatement01_1 {
    public static void main(String[] args) {
        /*
        ask user to enter a password
        if the initial of the password is uppercase then check if it is 'A' or not.
        if it is 'A' the output will be "valid Password"
        for example; ali==> valid password - ali==> invalid - mark==>invalid

        if the initial of the passwored is lowercase then check if it is 'z' or not.
        if it is 'z' the output will be "valid password"
        otherwise the output will be "Invalid password"
        For example; zoe==> valid password - Zoe==>invalid - john==>invalid.
         */
        Scanner input=new Scanner(System.in);
        char pwdInitial=input.next().charAt(0);

        if(pwdInitial>='A' || pwdInitial<='Z'){
            if (pwdInitial == 'A') {
                System.out.println("Valid pass");
            }else {
                System.out.println("invalid pass");
            }
        }else if(pwdInitial>='a'||pwdInitial<='z'){
            if(pwdInitial=='z'){
                System.out.println("valid pass");
            }else{
                System.out.println("invalid pass");
            }
        }else{
            System.out.println("Invalid password");
        }
    }
}
