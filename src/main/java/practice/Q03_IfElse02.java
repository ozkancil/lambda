package practice;

import java.util.Scanner;

public class Q03_IfElse02 {
    public static void main(String[] args) {
        /*
        type code, get afe from user and decide which stage on it
        -0-4=>baby
        -5-12=>child
        -13-20=>tenager
        21-30=> adult
        else not expected age
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter age please");
        double age=input.nextDouble();
        if(age>30){
            System.out.println("Not expected age");
        }else if(age>=0 && age<=4){
            System.out.println("Baby");
        }else if(age>=5 && age<=12){
            System.out.println("Child");
        }else if(age>=13 & age<=20){
            System.out.println("Teenager");
        }else if (age>=21 && age<=30){
            System.out.println("Adult");
        }
//        if(age>30){
//            System.out.println("Not expected age");
//        }else if(age>=0 || age<=4){
//            System.out.println("Baby");
//        }else if(age>=5 || age<=12){
//            System.out.println("Child");
//        }else if(age>=13 || age<=20){
//            System.out.println("Teenager");
//        }else if (age>=21 || age<=30){
//            System.out.println("Adult");
//        }
    }
}
