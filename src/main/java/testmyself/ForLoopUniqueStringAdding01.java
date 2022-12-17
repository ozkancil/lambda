package testmyself;

import java.util.Scanner;

public class ForLoopUniqueStringAdding01 {
    public static void main(String[] args) {
        /*
        print the addition of the user given string. but
        only the unique numbers
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter digits");
        String digits=input.next();
int sum=0;
        for (int i=0; i<digits.length();i++){
        String num=digits.substring(i,i+1);
        if(digits.indexOf(num)==digits.lastIndexOf(num)){
            sum=sum + Integer.valueOf(num);
        }
        }
        System.out.println(sum);
    }
}
// a>0 ? "negative": "Positive";