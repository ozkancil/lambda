package testmyself;

import java.util.Scanner;

public class Potatoes {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("words");
        String input=scan.nextLine();
String p="potatoes potatoes";
        int counter=0;
        while(input.indexOf("potatoes")!=-1){
            //
            // delete -> skip
            //skip even it skips its counts
            //0+8=8 0, counter 1             sb(8,)    (16, )  i will find what is given and notices, it knows count it
            input=input.substring(input.indexOf("potatoes")+"potatoes".length(),input.length());
            //                            0               +             8  =8  sout(8, ) =potatoes
            counter++;//1
        }
        System.out.println(counter);
    }
}
