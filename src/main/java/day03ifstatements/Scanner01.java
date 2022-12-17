package day03ifstatements;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Example: get first, middle and the last names from the user. and the SSN. Print them like the given format.
        // Tom Jim Hanks
        //234-12-3822
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter first, middle and last name. Also enter ssn");
        String first=input.next();
        String middle=input.next();
        String last=input.next();
        int ssn=input.nextInt();

        System.out.println("First name is: "+first+". Middle name is: "+middle+". Last name is: "+last+ ". SSN is "+ssn);




    }

}
