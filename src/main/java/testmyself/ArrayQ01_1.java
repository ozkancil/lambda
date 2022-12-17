package testmyself;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQ01_1 {

    public static void main(String[] args) {
        //ask user to enter names into the application by using an array the and take the number of elements and then
        //print them on the console
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of names you want");
        int length=scan.nextInt();
        String amountOfNames[]=new String[length];

        for (int i=0;i<length;i++){
            System.out.println("Enter the names you want");
            String names=scan.next();
            if(!names.equalsIgnoreCase("q")){
                amountOfNames[i]=names;
            }else{
            System.out.println("loop has been exited");
            break;
        }}
        System.out.println(Arrays.toString(amountOfNames));

        //Type code to print the sum of the minimum and maximum integers in an array.
//        int arr[]={12,56,89,5,34,92};
//        System.out.println(Arrays.toString(arr));
//
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        int minValue=arr[0];//the lowest number
//        int maxValue=arr.length-1;//this gives us the maximum value in the array

        //Type code to print the sum of the minimum and maximum integers in an array.
        int arr1[]={12,56,89,5,34,92};
//        Arrays.sort(arr1);
//        int minValue=arr1[0];
//        int maxValue=arr1.length-1;
        Arrays.sort(arr1);
        int maxValue=arr1.length;
        int minValue=arr1[0];


    }
}
