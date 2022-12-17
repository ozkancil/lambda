package practice.day15_Arrays_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_Arrays {
    public static void main(String[] args) {


        //09/20/2022 is given. print the date like month:09 day 20 year 2022
        //ask user to enter names into the application by using an array then take the number of elements and then
        //print them on the console
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of names you want to insert");
        int length=input.nextInt();
        String names[]=new String[length];

        //2. step: insert element into the array
        for(int i=0;i<length;i++){
            System.out.println("Enter the names "+(i+1)+ ". element. Please press 'Q' to quit the application");
            String employeeNames=input.next();

            if (!employeeNames.equalsIgnoreCase("Q")){
                names[i]=employeeNames;

            }else{
                break;
            }

        }
        System.out.println(Arrays.toString(names));

        //Type code to print the sum of the minimum and maximum integers in an array.
        int arr[]={12,56,89,5,34,92};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int minValue=arr[0];//the lowest number
        int maxValue=arr.length-1;//this gives us the maximum value in the array



    }
}