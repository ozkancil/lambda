package day04nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*
        if user enters  9 the code will print september, october november december
        if user enters 5 the code will print may, june, july , august, september, october, november, december
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter month number");
        byte monthNum= input.nextByte();
        switch(monthNum){
            case 1:
                System.out.println("september");
            case 2:
                System.out.println("october");
            case 3:
                System.out.println("nov");
            case 4:
                System.out.println("dec");
            case 5:
                System.out.println("jan");
                break;
            case 6:
                System.out.println("feb");
            case 7:
                System.out.println("mar");
            case 8:
                System.out.println("may");
            case 9:
                System.out.println("jun");
            case 10:
                System.out.println("jul");
            case 11:
                System.out.println("aug");
            case 12:
                System.out.println("sept");
                break;
            default:
                System.out.println("Enter valid month number");


        }
    }
}
