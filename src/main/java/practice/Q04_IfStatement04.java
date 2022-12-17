package practice;

import java.util.Scanner;

public class Q04_IfStatement04 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Print a month name");

        String month=input.next().toLowerCase();

        if(month.equals("march") || month.equalsIgnoreCase("april")||month.equalsIgnoreCase("may")){
            System.out.println("Spring");
        }else if(month.equalsIgnoreCase("june")||month.equalsIgnoreCase("july")||month.equalsIgnoreCase("august")){
            System.out.println("Summer");
        }else if(month.equalsIgnoreCase("september")||month.equalsIgnoreCase("october")||month.equalsIgnoreCase("november")){
            System.out.println("Autumn");
        }else if(month.equalsIgnoreCase("December")||month.equalsIgnoreCase("january")||month.equalsIgnoreCase("february")){
            System.out.println("Winter");
        }else{
            System.out.println("Enter a valid month name");
        }
        System.out.println(Integer.MAX_VALUE);

    }
}
