package testmyself;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter digit");
//        int exponent=scan.nextInt();
//        int exp=1;
//        for (int i=0;i<exponent;i++){
//            exp=exp*2;
//        }
//        System.out.println(exp);


        int base, loopAmount, sum=1;

        System.out.println("Enter base and loop amount");
        loopAmount=scan.nextInt();

        System.out.println("Enter base");
        base=scan.nextInt();
        sum=1;
        for(int i=0;i<loopAmount;i++){
            sum=sum*base;
        }
        System.out.println(sum);
    }

}

/*
how to constantly times it by its self
i have to do a*a 20 times
i would do for(int i=0;i<20;i++){
   2x2x

}
 */