package testmyself;

public class Loops {
    /* type code to print digits just in the decimal part of the given decimal number with an
            asterisk. Ex 75.4238 ==> *4*2*3*8
         */

    public static void main(String[] args) {


//        double num = 75.4238;
//
//        String str = String.valueOf(num);
//
//        String decimalPart = str.split("\\.")[1];
//
//        String decimalWithNum = "";
//
//        int i = 0;
//
//        do {
//            String r = decimalPart.substring(i, i + 1);
//
//            decimalWithNum =  decimalWithNum + "*" + r;
//            i++;
//
//        } while (i < decimalPart.length());
//
//        System.out.println(decimalWithNum);

        int num=1234;//String.valueOf(num)... We couldnt use length. Why? Because to get the length in int we need an array.
        int[] num1={1,2,3,4};//We can get the length of this.
      int sum=0;
        for (int k=0;k<num1.length;k++){//length()
            sum=sum+num1[k]; //0 1 2 3
        }
        System.out.println(sum);

        //length() method can he used with strings only
        //length can be used with primitive data types.

        String letters="ozkan";//
        int l=letters.length();//we got the length, NOT index.
        System.out.println(l);
        int idx=0;
        String add="";
        do{
           char character= letters.charAt(idx);
            add=add+character;
            idx++;
        }while(idx<letters.length());
        System.out.println(add);
    }

}