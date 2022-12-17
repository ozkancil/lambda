package day02typecastingscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {
        //example: Ask user to enter width, height adn the length of a rectangular prism than calculate
        // the total area.
        Scanner input=new Scanner(System.in);
        System.out.println("enter the width");
        int width=input.nextInt();

        System.out.println("enter height");
        int height=input.nextInt();

        System.out.println("enter length");
        int length=input.nextInt();

        System.out.println("Total surface are is ="+(2*(width*length)+2*(height*length)+2*(width*height)));



    }

}
