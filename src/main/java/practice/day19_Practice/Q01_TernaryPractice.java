package practice.day19_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01_TernaryPractice {
    public static void main(String[] args) {
        /*
        Type code to find the common elements between two string arrays
        without case sensitivity
        input1: john,brad,angel, sofia, emily, input2: sofia, brad, grace, emily , hazel
        output: brad, sofia, emily.
         */

        /*
        ask user to enter an integer and print even on the console for even integers, increase the value by 3
        . for odd integers print it on the console by using ternary.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();


        int oddEven=num%2==0? num+3:num;
        System.out.println(oddEven);

        /*
        input1: john,brad,angel, sofia, emily,
        input2: sofia, brad, grace, emily , hazel
        output: brad, sofia, emily.
         */

        String arr[]={"john", "brad","angel","sofia","emily"};
        String brr[]={"sofia","brad","grace","emily","hazel"};

        List<String> list=new ArrayList<>();


        for(String w:arr){
            for(String u:brr){
                if(w.equalsIgnoreCase(u)){
        list.add(u);
                }
            }
        }

        System.out.println(list);

    }
}
