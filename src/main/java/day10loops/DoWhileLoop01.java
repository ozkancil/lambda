package day10loops;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
     /*
     while loop
     when you use while loop zero execution is possible.
     we executed by nothing came out even though it was zero execution it runs the code and gets nothing
      */
//        int i=1;
//        while(i<1){
//            System.out.println("While loop");
//            i++;
//        }
//
//        /*
//        do-while
//        do while the body is executed at least once, in while zero execution is possible.
//        but in do while zero execution is not possible.
//         */
//        int k=1;
//        do{
//            System.out.println("do-while loop");
//            k++;
//        }while(k<1);
//









/*
if integer is less than 100 tell user "won!"
otherwise tell user "lost!"
 */
        Scanner input=new Scanner(System.in);
        int game=0;//we create this outside the main bracket so that we can use it inside the bracket.
        do{
            System.out.println("Enter a number to play");
            game=input.nextInt();
           if(game<100) {

               System.out.println("Won!");
           }

        }while(game<100);
        System.out.println("Lost!");








        //infinite loops
        for (int p=1;p<10;p--){
            System.out.println(p+" ");// this has become an infinite loop.
        }

        for (int p=1;p<10;) {// this is an infinite loop as well
            System.out.println(p + " ");

        }

        //infinite loop
        int a=0;
        while(a==0){
            System.out.println("hi");//this is an infinite loop. if we add a++; it will break out of it
            //a++;
        }

        int r=0;
        while(true){//by putting true we create an infinite loop. we break the loop by putting break; inside the loop body.
            System.out.println("hi");
            r++;// until its infinite loop
            if(r==5){
                break;//we break the infinite loop here
            }
        }

    }
}
