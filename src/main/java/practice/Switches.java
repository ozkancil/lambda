package practice;

import java.util.Scanner;

public class Switches {
    /*
    Use switch statement to create a converter which converts mile to km, second to hour,
fahrenheit to celsius. Find the formulas for conversions from Google.
a) When user entered 10 and mileToKm String, your code should print "16 km" (The number
will be dynamic) on the console
b) When user entered 7200 and secondsToHours String, your code should print "2 Hours"(The
number will be dynamic) on the console
c) When user entered 83 and fahrenheitToCelsius String, your code should print "28.3333
celsius"(The number will be dynamic) on the console
d) When user entered operation different from mileToKm, secondsToHours, fahrenheitTo-
Celsius your code should print "That operation was not defined for that converter"

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What would you like to enter?:in miles, km, second or fahrenheit ");
        String frml=scan.next().toLowerCase();
        System.out.println("Enter your "+frml);
        double convert=scan.nextInt();
        double hours=3600;
        double mile=1.609344;

        switch (frml){
            case "miles":
                System.out.println(convert* mile);
                break;
            case "seconds":
                System.out.println(convert/hours);
                break;
            case "fahrenheit":
                System.out.println((convert-32)*.5556);
                break;
            default:
                System.out.println("Please enter proper conversions");
  }
    }
}
