package day04nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //switch statement does the same with if- else if. it has just different syntax
        /*
        get the4 num of days from user and print the name of  the day
        for example 1--> sunday, 2->monday, etc.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter day number");
        byte days=input.nextByte();
        //1st wat is "if- else if"
//        if(days==1){
//            System.out.println("Sunday");
//        }else if (days==2){
//            System.out.println("Monday");
//        }else if(days==3){
//            System.out.println("Tuesday");
//        }else if(days==4){
//            System.out.println("Wednesday");
//        }else if(days==5){
//            System.out.println("Thursday");
//        }else if(days==6){
//            System.out.println("Friday");
//        }else if(days==7){
//            System.out.println("Saturday");
//        }else{
//            System.out.println("Invalid day number");
//        }
        //2nd way: switch statement
        switch(days){//in switch changing the places of cases is not important. if possible use switch.
            case 1:
                //return "Sunday";
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:      //same as else statement in if
                System.out.println("Invalid day number");
        }
        System.out.println("Good job you know your days!");

    }
}
