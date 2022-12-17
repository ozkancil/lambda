package day08stringmanipulatoinloops;

public class ForLoop01 {
    public static void main(String[] args) {
        /*
        exmaple 1: type code to print "hi" five time on the console
         */
        //too much repetition. difficult to maintain, type and update.
        //not recommended
//        System.out.println("Hi");
//        System.out.println("Hi");
//        System.out.println("Hi");
//        System.out.println("Hi");
//        System.out.println("Hi");

        //2nd way? to do repated actions java created loops
        //there are 4 looops in java: for looop, while loop, do while loop and for each loop

        //for loop
        //starting value, condition, increment/decrement
        for( int i=1;i<=5;i++){
            System.out.println("Hi");
        }

        //Example 2: type all integers from 11 to 44 in the same line with a space between consecutive integers
        for(int f=11; f<45; f++){
            System.out.print(f+" ");

        }
        //ex 3: type all integers from 44 to 11 in the same line with a space
        System.out.println();
        for (int i=44; i>12;i--){
            System.out.print(i+" ");
        }
        System.out.println();

    //Ex 4: type even integers from 11 to 44 in the same line with a space
       int i;
        for(i=11; i<45; i++){
        if(i%2==0){
            System.out.print(i+" ");
        }
    }

        System.out.println();
        //5th : type odd integers from 68 to 13. decrement
        for(i=68;i>12;i--){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //6th ex: type all integers which area divisible by 4 and not divisble by 6. from 120 to 11 in the same line space betwen them
        for (i=120;i>10;i--){
            if(i%4==0 && i%6!=0){
                System.out.print(i+" ");
            }
        }

}}
