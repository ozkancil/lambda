package day34_lambdafp;

import day32lambda.UtilsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda_IntStream {
    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>();
//
//        list.add(8);
//        list.add(9);
//        list.add(131);
//        list.add(10);
//        list .add(9);
//        list .add(10);
//        list .add(2);
//        list .add(2);
//        list .add(8);
//
//        System.out.println(getSumFromSevenToOneHUndered());
//        System.out.println(getSumFromSevenToOneHUndered02());
//        System.out.println(mltpIntFromTwoToEleven());
//        System.out.println(calculateFactorial(-2));
   //     System.out.println(calculateFactorial02(5));
        System.out.println(calcualteSumOfEven(-9,-3));
//        System.out.println(findSumOfDigitsInGivenRange(1,3));

       // System.out.println(mltpIntFromTwoToEleven());
    }
    //cre methdo to find the sum of the integers from 7 to 100
    //1st way.
    public static int getSumFromSevenToOneHUndered(){
       return IntStream.range(7,101).reduce(0,Math::addExact);

    }
    //2nd way
    public static int getSumFromSevenToOneHUndered02(){
      return   IntStream.rangeClosed(7,100).reduce(0,Math::addExact);
    }
    //Create a method to find the multiplication of the integers from 2 inclusive to 11 inclusive
    public static int mltpIntFromTwoToEleven(){
      return  IntStream.rangeClosed(2,11).reduce(1,Math::multiplyExact);

    }
    //calcualte the factorial of a given number( 5 factorial=1*2*3*4*5==>5!=1*2*3*4*5
    public static int calculateFactorial(int x){
        //1st way.
        if(x>0) {
            return IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
        }
        else{
            System.out.println("Do not use negative numbers in factorial operations");

            return 0 ;
        }

    }
    public static Object calculateFactorial02(int x){
        return x>0? IntStream.rangeClosed(1,x).reduce(1,Math::multiplyExact):"Do not use negative numbers in factorial operations;";
    }
    //create a method to calculate the sum of even integers between given two integers
    public static int calcualteSumOfEven(int a,int b){
        int x=0;
        if(a>b){
            x=a;
            a=b;
            b=x;
        }
       return IntStream.rangeClosed(a,b).filter(UtilsClass::checkToBeEven).sum();

    }
    //create method to calculate sum of digits of every integers between two integers
public static int findSumOfDigitsInGivenRange(int a , int b){
        int x=0;
        if (a>b){
            x=a;
            a=b;
            b=x;
        }
       return IntStream.rangeClosed(a,b).map(UtilsClass::getSumOfDigits).sum();

}

}
