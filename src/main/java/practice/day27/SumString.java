package practice.day27;

import java.util.Scanner;

public class SumString {
    /*
    create a method that accepts a string as a parameters
     and finds the sum of digits in that string.
     Example:
     input; j/4\4 1$ 34$*
     output:16
     hint:
     Character.isDigit()
     Integer.valueOf
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter input");
        String str=input.nextLine();
sumOfDigits(str);
    }
    public static void sumOfDigits(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                sum+=Integer.valueOf("",str.charAt(i));
            }
        }
        System.out.println(sum);
    }

}
