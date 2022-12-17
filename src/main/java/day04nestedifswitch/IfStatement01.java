package day04nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        /*
        type code, get age from user and decide which stage on it
        -0-4=>baby
        -5-12=>child
        -13-20=>tenager
        21-30=> adult
        else not expected age
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");

        byte age=input.nextByte();

        if(age<0){
            System.out.println("Invalid age");
        }
        else if(age<=4 && age>=0){
            System.out.println("baby");
        }else if (age<=12 &&age>=5){
            System.out.println("Child");
        }else if(age<=21 && age>=13){
            System.out.println("Teenager");
        }else if(age<=30 && age>=21){
            System.out.println("Adult");
        }

    }
}
