package day10loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {
        /*
        1. type code to get the output like
           week1:
           day:1
           day:2
           day:3
           .....
           week: 2
           day:1
           day:2
           day:3
           ......
           week: 3
           day:1
           day:2
           day:3
           .............
         */
//        for (int i=1;i<5;i++){
//            System.out.println("Week: "+i);
//            for(int k=1; k<8; k++){
//                System.out.println("Day: "+k);
//            }
//        }
        /*
        2 example: write a java program to print rectangle star pattern using for loop
        ****
        ****
        ****
        ****
         */
        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter the number of the rows");
//        int row=scan.nextInt();
//
//        System.out.println("Enter teh number of columns");
//        int columns=scan.nextInt();
//
//        for (int i=1; i<=row;i++){
//            for (int k=1;k<=columns;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        System.out.println("Enter the number of the rows");
        int numOfRows=scan.nextInt();
        for (int i=1;i<=numOfRows;i++){
            for (int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }


    }
}
