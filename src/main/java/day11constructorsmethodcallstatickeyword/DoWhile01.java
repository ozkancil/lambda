package day11constructorsmethodcallstatickeyword;

public class DoWhile01 {
    public static void main(String[] args) {
        /*
        Type code to print digits just in the decimal part of the given decimal number with an asteric. for exaample
        75.4238==> *4*2*3*8
         */
//        double num = 75.4238;
//
//        String str = String.valueOf(num);
//        String decPart = str.split("\\.")[1];// just dot has a different meaning so use \\ for choosing dots, \\.
//        //now you got half of the numbers .4238. now use those to concatenate them . take each number and add it to *
//        int i = 0;
//        String sum = "";
//
//        do {
//            String r = decPart.substring(i, i + 1);//the reson we do substring here is I need to get
        //character one by one. if i do sum=sum+r without the substring then I will only get repeated numbers/
        //so a substring is required for me to get each character one by one , and add it one after another.
        //Because substring gives me each character individually.
//            sum = sum + "*" + r;
//            i++;
//        } while (i < decPart.length());
//
//
//        System.out.println("===========================");
//        System.out.println("===========================");
//        System.out.println("===========================");
//        System.out.println("===========================");

        /*
        type the numbers after the digits and add star betwn them
         */
//        double num1 = 75.423888;
//        String add = "";
//
//        String strValueOfnum1 = String.valueOf(num1);
//
//        String split = strValueOfnum1.split("\\.")[1];
//        int lenght = split.length();
//
//
//        //System.out.println(split);
//        do {
//            char idx = split.charAt(lenght);
//            add = add + "*" + idx;
//
//
//            System.out.println(add);
//            lenght++;
//
//        } while (true);

        double num=75.4321;
        String string=String.valueOf(num);
        String split=string.split("\\.")[1];///
        String add="";

        for(int i=0;i<split.length();i++){//
            char c=split.charAt(i);
            add=add+"*"+c;
        }
        System.out.println(add);

    }
}