package lambda;

import practice.interfaces.L;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming {
    /*
    Lambda is functional programming.
    In functional programming we use functions. Our functions is methods. So lambda means we will use only functions.
    So we will use java created lambda functions (methods), java methods.

    1) Lambda is functional programming
    2)Functional programming was added to java in java 8, before we were using just
    Structural Programming. After java 8 we are able to use both.
    3) Structured Programming focuses on How to do most of the time.
    Functional Programming focuses on "what to do".
    4) Functional Programming is used with Collections and Arrays

     */

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

printElStructured(l);
        System.out.println();
printElFunctional(l);
        System.out.println();
        printElStructured01(l);

        System.out.println();
        printeElStructured02(l);
        System.out.println();
printElOddNumbers(l);
        System.out.println();
        printDistinctOfCubeOddNumbers(l);
        System.out.println();
        sumOfSquareDistinctEvens(l);
        System.out.println();
        printDistinctCubeProductOfEvenNums(l);
        System.out.println();
        getMaxEle(l);
        System.out.println();
        findMinValue(l);
        System.out.println();
        getMaxEle2(l);
        System.out.println();
        getMinEle2(l);

        System.out.println();
        getMinGreaterThanSevenEven(l);

        System.out.println();
        getHalfOfDistinctElementsReversed(l);




    }
    //create a mthd to print the list elements on the console in the same line with a space betwn two consecutive elemtns(structured)
public static void printElStructured(List<Integer>l){
        for(Integer w:l){
            System.out.print(w+" ");
        }

}
    //create a mthd to print the list elements on the console in the same line with a space betwn two consecutive elemtns(Functional Programming)
public static void printElFunctional(List<Integer>l){
l.stream().forEach(t-> System.out.print(t+" "));

}
    //create a mthd to print even numbers from the list elements on the console in the same line with a space betwn two consecutive elemtns(Structured Programming)
public static void printElStructured01(List<Integer>l){
        for (Integer w:l){
            if(w%2==0)
            System.out.print(w+" ");
        }
}
    //create a mthd to print even numbers from the list elements on the console in the same line with a space betwn two consecutive elemtns(Functional Programming)
public static void printeElStructured02(List<Integer>l){
        l.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));//name of l is called "lambda expression"

}
    //create a mthd to print distinct odd numbers from the list elements on the console in the same line with a space betwn two consecutive elemtns(Functional Programming)
public static void printElOddNumbers(List<Integer>l){
        l.stream().distinct().filter(t->t%2!=0).map(t-> t*2).forEach(t-> System.out.print(t));
}
    //create a mthd to print cube of distinct odd numbers from the list elements on the console in the same line with a space betwn two consecutive elemtns(Functional Programming)
public static void printDistinctOfCubeOddNumbers(List<Integer>l){
        l.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
}
    //create a mthd to print distinct even numbers cube them and add the cubes from the list elements on the console in the same line with a space betwn two consecutive elemtns(Functional Programming)
public static void sumOfSquareDistinctEvens(List<Integer>l){
       Integer sum= l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(0,(t,u)->t+u);//(t,u)->t+u
    System.out.println("The sum of the cubed of even distinct elements is "+ sum);

}
    //create a mthd to print distinct even numbers cube them find product of the cubes from the list elements on the console in the same line with a space betwn two consecutive elemtns(Functional Programming)
public static void printDistinctCubeProductOfEvenNums(List<Integer>l){
      int product=  l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
    System.out.println("The product is "+product);
}
//crt metd find max elemtn
    public static void getMaxEle(List<Integer>l){
        Integer maxEl=l.stream().reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
        System.out.println("the max elemtn is "+ maxEl);
    }
    //crt metd find min elemtn
public static void findMinValue(List<Integer>l){
     Integer minValue=   l.stream().reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);
    System.out.println(minValue);

}
    //crt metd find min elemtn
    public static void getMaxEle2(List<Integer>l) {
        //Returns a stream consisting of the elements of this stream, sorted according to natural order. Ascending.
       Integer  max= l.stream().distinct().sorted().reduce(Integer.MAX_VALUE, (t,u)->u);//here it says pick the max element because we are saying choose 2nd one.
        System.out.println(max);
    }
    //Get minValue
    public static void getMinEle2(List<Integer>l) {
       Integer minNum= l.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t, u)->u);
        System.out.println(minNum);
    }
    //crete method to find minimum value which is greater than 7 and even
    public static void getMinGreaterThanSevenEven(List<Integer>l){
      Integer minEl=  l.stream().distinct().filter(t->t>7).filter(t->t%2==0).reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);
        System.out.println(minEl);

    }
    //2nd way
    //crete method to find minimum value which is greater than 7 and even
    public static void getMinGreaterThanSevenEven2(List<Integer>l) {
      Integer minEl=  l.stream().distinct().filter(t -> t % 2 == 0 && t>7).sorted().findFirst().get();
      //use findFirst() method together with get() to get Integer return type.
        System.out.println(minEl);
    }
    //create a methodto find teh half of the elemnts which are distinct and greeater than 5 in reverse order in teh list
    public static void getHalfOfDistinctElementsReversed(List<Integer>l){
        //Colectors.toList turns it into a list. WOrks in stream but we perefare it in list.
       List<Double>resultList= l.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Half of the elements list "+ resultList);
    }

    }
