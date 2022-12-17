package day09loops;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /* Ask user to enter a password
        If the initial of the password is uppercase then check if its 'A' or not.
        if it is 'A' the output will be "valid password"
        otherwise the output will be "invalid password"
        For Ex: Ali ==> Valid password = ali ==> Invalid - Mark ==> Invalid
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter password");
        char pwdInitial = scanner.next().charAt(0);

        if(pwdInitial>='A' && pwdInitial<='Z'){
            if(pwdInitial == 'A'){
                System.out.println("Valid password");

            } else {
                System.out.println("invalid password");
            }
        }
    }
}
