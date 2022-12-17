package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgramming04 {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(10);
        l.add(12);
        l.add(15);

        sumOfAlL(l);
        sumOfAllDig(1,3);

    }
    //crte method to find sum of all elemtns in the list
    public static void sumOfAlL(List<Integer>l){
      Integer sum=  l.stream().reduce(0,Math::addExact);
        System.out.println(sum);
    }
    //crte method to find sum of int from 7 to 100 elemtns in the list
    public static void sumOfSevenTo100(List<Integer>l){
        Integer sum=IntStream.range(7,101).reduce(0,Math::addExact);
        System.out.println(sum);
    }
    //2nd way
    public static void getSumOfIntFrom7to100(){
        //terminal operation means after sum u cannot use any other method
        //returns sum of elemnts in a stream
       Integer sum= IntStream.rangeClosed(7,100).sum();
        System.out.println(sum);
    }
    //creat metd to find multp of the integer from 2 to 11
    public static void getMultOf2to11(){
     Integer mul=   IntStream.rangeClosed(2,11).reduce(1,Math::multiplyExact);
        System.out.println(mul);

    }
    //crt method to calculate the factorial of a given number. ex: 5!
    public static void factorial(int x) {
        if (x < 0) {
            System.out.println("Do not use negative numbers");
        } else {
            Integer result = IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
            System.out.println(result);
        }

    }
    //crt mtdh to calc the sum of even int btwn given two integers
    public static void sumEvenBtwnTwoInt(){
       Integer sum= IntStream.rangeClosed(2,50).filter(t->t%2==0).reduce(0,Math::addExact);
        System.out.println(sum);
        
    }
    //Create mthd to calculate the sum of digits of every integers betwen given two integers
public static void sumOfAllDig(int a , int b){
      Integer sum=  IntStream.rangeClosed(a,b).reduce(0,Math::addExact);
    System.out.println(sum);
   IntStream.rangeClosed(a,b).map(Utils::sumOfDigits).forEach(Utils::printInTheSameLineWithASpace);

    Integer result=IntStream.rangeClosed(a,b).map(Utils::sumOfDigits).sum();
    System.out.println(result);
}
//6. crete methd to calculate the sum of digits of every integers betwn given two integers
    public static void sum(int a,int b){
       Integer result= IntStream.rangeClosed(a,b).map(Utils::sumOfDigits).sum();
    }

}
