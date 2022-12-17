package testmyself;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        System.out.println("create a user and enter users needs into student portal");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter amount of students");
        int amount= input.nextInt();

        String idx[]=new String[amount];

        for(int i=0;i<amount;i++){
            System.out.println("Enter "+(i+1)+" Students names");
            String studentNames=input.next();
            if (!studentNames.equalsIgnoreCase("q")){
            idx[i]=studentNames;
                System.out.println(Arrays.toString(idx));
        }


        }




    }
}
