package day09loops;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {
        //example 1: type code to print characters in a string, except "m"
        // for example: andromeda==> androeda
//        String str="Andromeda";
//        //1st way
//        for (int i=0; i<str.length();i++){
//            char ch=str.charAt(i);
//
//            if(ch!='m'){
//                System.out.println(ch);
//            }
//        }

            //2nd way
//        System.out.println();
//        String mo="mom";
//        for (int i=0;i<mo.length();i++){
//            char m=mo.charAt(i);
//
//            if(m=='m'){
//                continue;//means keep going and skip the mentioned value which is 'm' here and keep on printing the rest
//            }
//                System.out.print(m);
//        }

        //example 2: type code to print characters before "m" in a string
        String city="Luxembourg";

//        for (int i=0; i<city.length();i++){
//            char ch=city.charAt(i);
//            if(ch=='m'){
//                break;//means stop here at the given value.
//            }
//            System.out.print(ch);
//        }
//
//        System.out.println();

        //example 3: write code to find the sum of the unique digits in an integer
        //user will give 1232==> 1+3=4. dont add 2 cuz they are repeated
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter an integer to see the sum of the unique digits");
//
//        String num=input.next();
//        int sum=0;
//        for (int i=0; i<num.length();i++){
//            String digit=num.substring(i,i+1);    //substring is substring(1,2); get index 1 but not 2.
//
//            if(num.indexOf(digit)==num.lastIndexOf(digit)){   //this is used to get unique characters.
//                sum=sum+Integer.valueOf(digit);
//            }
//
//        }
//        System.out.println(sum);

    //==============================================
        Scanner scan=new Scanner(System.in);//1
        System.out.println("Enter your digits");//2
        String digits=scan.next();//3
        int sum1=0;//4
        for(int i=0;i<digits.length();i++){//5
            String rs=digits.substring(i,i+1);//6
            if(digits.indexOf(rs)==digits.lastIndexOf(rs)){//7
                sum1= sum1+Integer.valueOf(rs);//8
            }
        }
        System.out.println(sum1);//9
    }
}
