package practice;

import java.util.Scanner;

public class Practice02_IfStatement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");
        //create container for hte input
        int age=input.nextInt();

        if(age>=0 || age<=4){
            System.out.println("baby");
            //look at Q03_IfElse02 same one.
        }

    }
}
