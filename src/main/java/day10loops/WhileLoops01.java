package day10loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Exmaple: Type code to print integers from 3 to 6
        //1:way: use for loop
        for (int i=3; i<7;i++){
            System.out.println(i+" ");

        }
        //2nd way while loop
        System.out.println();
        int i=3;
        while(i<7){
            System.out.println(i+" ");
            i++;

        }

        //example: tpye code to print odd inegers from 12 to 67 in the same line with a spcace between them
        int k=12;
        while(k<68){
            if(k%2!=0){
                System.out.print(k+", ");
            }
            k++;


        }

//3rd example: type code to find sum of integers from 12 to 67
        int m=12;
        int sum=0;
        while(m<68){
            sum=sum+m;
            m++;
           // System.out.println(sum);
        }
        System.out.println();
        System.out.print("Sum is: "+sum);


        /*
        input user and get the total of each digits in total.
        123==>1+2+3=6
         */
        System.out.println("Enter an integer to find the sum of the digits");
        int num=input.nextInt();
        int sumOfTheDigits=0;
        while(num>0){
            sumOfTheDigits=sumOfTheDigits+num%10;


            num=num/10;
        }
        System.out.println(sumOfTheDigits);
        /*
        user will give number and create multiplication of that number
        3*1, 3*2, etc
         */
        System.out.println("Enter integer to make a multiplication table");
        int num1= input.nextInt();
        int p=1;

        while(p<11){

            System.out.println(num1+"x"+p+" = "+ num1*p);
            p++;
        }
    }
}
