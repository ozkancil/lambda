package practice;

import java.util.Scanner;

public class Q01_IfStatement {
    public static void main(String[] args) {
        int score=50;
        if(score<50){
            System.out.println("Fail");
        }else{
            System.out.println("pass");
        }
        int score1=50;
        if(score1<50){
            System.out.println("fail");
        }
        if(score1>50){
            System.out.println("pass");
        }
        Scanner input=new Scanner(System.in);//======
        System.out.println("Enter your grade");
        //create a container with the appropriate data type
        int score2=input.nextInt();
        //type code condition with if statment
        if(score2<50){
            System.out.println("fail");
        }
        else{
            System.out.println("pass");
        }
        //3rd way: && AND operator checks all given conditions. if all conditions are positive then && will return true.
        int score3=input.nextInt();
        System.out.println("enter ur grades");
        if(score3<50){
            System.out.println("You failed");
        }else if(score3>50 || (score<=100)){
            System.out.println("you passed");
        }else if(score3<=0 || score3>100){
            System.out.println("Enter a valid score");
        }

    }

}
