package day03ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        String b="yes";
        boolean a=(b=="a");
        /*
        Example1: type code  to print weekday for the weekday names, weekend day for the weekend day names
        Monday-->Friday==> weekday      Saturday, SUnday==> Weekend day
         */
        Scanner input = new Scanner(System.in);
        String weekday = input.next();
        //has many repetitions. which is not good.
        if (weekday.equals("Monday")) {
            System.out.println("Weekdday");
        }
        if (weekday.equals("Tuesday")) {
            System.out.println("Weekdday");
            if (weekday.equals("Monday")) {
                System.out.println("Weekdday");
            }
            if (weekday.equals("Wednesday")) {
                System.out.println("Weekdday");
            }
            if (weekday.equals("Thursday")) {
                System.out.println("Weekdday");
            }
            if (weekday.equals("Friday")) {
                System.out.println("Weekdday");
            }
        }
        //2nd way: lets use else
        if (weekday.equalsIgnoreCase("Monday") || weekday.equalsIgnoreCase("Tuesday") || weekday.equalsIgnoreCase("Wednesday") || weekday.equalsIgnoreCase("Thursday")
                || weekday.equalsIgnoreCase("Friday")) {
            System.out.println("Weekday");
        }
           else if (weekday.equalsIgnoreCase("Saturday")||weekday.equalsIgnoreCase("Sunday")){
            System.out.println("Weekend");
        }else{
            System.out.println("Invalid day name");
        }
/*
"OR" operator can be used just with booleans. || = OR
true|| true==> true
 */
        boolean isWeekday=(weekday.equalsIgnoreCase("Monday")
                || weekday.equalsIgnoreCase("Tuesday") || weekday.equalsIgnoreCase("Wednesday")
                || weekday.equalsIgnoreCase("Thursday")
                || weekday.equalsIgnoreCase("Friday"));

        boolean isWeekEnd=  weekday.equalsIgnoreCase("Saturday")
                || weekday.equalsIgnoreCase("Sunday");

        if (isWeekday) {
            System.out.println("Weekday");
        }
        else if (isWeekEnd){
        System.out.println("Weekend");
        }else{
            System.out.println("Invalid day name");
        }
        /*
        beauty of if-else if statement
        after finding true java does not check the other conditions.
         */

    }}