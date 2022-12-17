package day08stringmanipulatoinloops;

public class Stringmanipulations01 {
    public static void main(String[] args) {
        String str="Java is easy Java is OOP";
        String result1=str.replaceFirst("Java","Apex");
        System.out.println(result1);

        /*
        example 1: String shirtPrice="$12.99"
        String bookPrice="$35.99";
        Type the sum of both variables
         */

        String shirtPrice="$12.99";
        String bookPrice="$35.99";
        String shirt=shirtPrice.replace("$","");
        String book=bookPrice.replace("$","");

        //valueOf() method converts String data type to numeric data type types
        double shirtInDouble=Double.valueOf(shirt);
        double bookInDouble=Double.valueOf(book);

        System.out.println(shirtInDouble+bookInDouble);
        /*
        example2: swap the integers
        a=12   b=23 ==> a=23 b=12
         */
        int a=12, b=23;

        //1 way: we used third variable
        int temp=0;

        temp=b;
        b=a;
        a=temp;
        System.out.println(a);
        System.out.println(b);

        //2way: without using third variable
        System.out.println("Second way");
        b=b-a;
        a=b+a;
        b=a-b;
        System.out.println(a);
        System.out.println(b);

    }
}
