package day02typecastingscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        // get hte width and length of a user an calculae the are of hte rectangle
        Scanner input= new Scanner(System.in);
        System.out.println("enter the width");
        int width=input.nextInt();
        System.out.println("Enter the length");
        int length=input.nextInt();

        System.out.println("The are of the rectangle is "+width*length);

    }

}
