package day02typecastingscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*
        Scanner Class: we will get data from user into our codes
        //how to get data from user?
        1. create an object from Scanner Class
          */
        //class name   object name      assignemnt operator          new keyword      Constructor==> Class Name + ()
        Scanner           input              =                           new            Scanner(System.in);

        //2. Give a message to user about the data you ask
        System.out.println("Enter your address");
        String address=input.nextLine();
        System.out.println(address);


        System.out.println("Enter your age");

        //3. Get the data by the help of the "input" object
        //input.nextInt();
       //WE NEED SCANNER CLASS TO INPUT DATA INTO CONSOLE. WHAT WE SEE IN THE INPUT COMES FROM THE SCANNER CLASS
        int age=input.nextInt();
        System.out.println(age);
        //so using scanner class we make an object and we give it a name. above is input.
        System.out.println("enter your name");

       // input.next(); Used for Strings
       String name=input.next();
        System.out.println(name);
        //i need to write the address part before because it will give a prolbem if i dont. i skips the address. and you must do .nextLine();



    }
}
