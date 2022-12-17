package day05ternarystringmanipulations;

import java.util.Locale;
import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        /*
        ask suer to enter coutnry name among maerica, englan, germany, turkey, india, oeru , spain , bulgaria, albania, frane
        trype code to pring abbrevaition of the countreis. "us, uk, de, tr, etc.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter teh country name");

        String country=input.nextLine().toLowerCase();

        switch(country){//for swtiches you can only use int, byte , short, char, Sring. So no long, boolean, float and double cannot be used in switch statement.
            case "america":
                System.out.println("USA");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("GM");
                break;
            case "turkey":
                System.out.println("TK");
                break;
            case "india":
                System.out.println("IN");
            case "peru":
                System.out.println("Pe");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("enter a proper country name");
        }

    }
}
