package testmyself;

import java.util.Scanner;

public class ForLoopUniqueStringAdding {
    public static void main(String[] args) {
        /*
        find the users input and add them up
         */
    Scanner input=new Scanner(System.in);
        System.out.println("Enter digits");
    String num=input.next();
   int sum=0;

   for(int i=0;i<num.length();i++){
       String digits=num.substring(i,i+1);

       if(num.indexOf(digits)==num.lastIndexOf(digits)){
           sum=sum+Integer.valueOf(digits);
       }

   }

        System.out.println(sum);

    }
}
