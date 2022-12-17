package practice.day28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterviewQuestion {

    /*
    ask user to enter two numbers then swap them.
    a=12, b=13 a=13   b=12
     */
    public static void main(String[] args) {
        try{
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number");
        double a=input.nextDouble();

        System.out.println("Enter second numbner");
        double b=input.nextDouble();

        //create a temporary container for swapping
       //we say try to do this action and if anything happens do this try and catch
           System.out.println(a+" - "+b);

           double temp=0;
           temp=b;
           b=a;
           a=temp;

           System.out.println(a+" - "+b);
       }catch (InputMismatchException e){
           System.out.println(e.getMessage());
       }catch (Exception e){
           System.out.println(e.getMessage());
       }


    }

}
