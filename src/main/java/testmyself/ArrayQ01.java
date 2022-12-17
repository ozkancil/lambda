package testmyself;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQ01 {
    public static void main(String[] args) {
        //ask user to enter names into the application by using an array the and take the number of elements and then
        //print them on the console
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the amount of names you would like");
        int length=scan.nextInt();
        String amount[]=new String[length];

        for(int i=0;i<length;i++){

            System.out.println("Enter the "+ length +" names you would like");
            String names=scan.next();
            if(!names.equalsIgnoreCase("q")){
                amount[i]=names;
            }else{
            break;
        }
        }
        System.out.println(Arrays.toString(amount));
    }

}
