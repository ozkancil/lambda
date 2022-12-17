package practice;

import java.util.Scanner;

public class OzkanCils_IfStatement {
    public static void main(String[] args) {
        /*
        && operator is pesimistic. even one false condition returns false. if ou have 100 conditions and only one of the m is false
        99 conditions are true
        then && operator will return false.
         */
        Scanner input= new Scanner(System.in);
        System.out.println("ENter grades");
        int score=input.nextInt();
        if(score>50 && score<100){
            System.out.println("Pass");
        }else if(score>100 ){
            System.out.println("Check grade again");
        }else if(score<50 && score>0){
            System.out.println("Failed");
        }else{
            System.out.println("Wrong input");
        }
    }
}
