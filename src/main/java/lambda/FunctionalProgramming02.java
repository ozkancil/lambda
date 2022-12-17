package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming02 {
    /*
    Method References:
    ClassName::MethodName without method parenthesis.
    Example==>   String::Length
                 ArrayList::Size -> this is a method.
                 we use only func program there is no structural program in lambda.
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
        getMinGreaterThanSevenEven2(l);
    }
    //crtee method to pring on the console in the same line w/space btwen two consecutive elemtns
    public static void printElFunctional(List<Integer>l){
        //if java has any method we prefer to use it, if java does not have it we create
        //the method inside the Utils class and use it
        //l.stream().forEach(Utils::printInTheSameLineWithASpace);
    }
    //crtee method to pring even on console same line
    public static void prrintEvenSpace(List<Integer>l){
        l.stream().filter(Utils::checkToBeEven).forEach(Utils::printInTheSameLineWithASpace);
    }
    //create a mthd to print square odd numbers from the list elements on the console in the same line with a space betwn two consecutive elemtns(Functional Programming)
public static void printSquareOdd(List<Integer>l){
        l.stream().filter(Utils::checkToBeOdd).map(Utils::getSquare);
}
    //create a mthd to print cube of distinct odd numbers from the list elements on the console in the same line with a space betwn two consecutive elemtns(Functional Programming)
public static void printCubeOfDistrinctOdds(List<Integer>l){
        l.stream().distinct().filter(Utils::checkToBeOdd).map(Utils::getCube).forEach(Utils::printInTheSameLineWithASpace);
}
    //create a mthd to print "sqauree sum" of distinct even numbers from the list elements on the console in the same line with a space betwn two consecutive elemtns(Functional Programming)
    public static void printCubeOfDistrinctEven(List<Integer>l){
      Integer sum=  l.stream().distinct().filter(Utils::checkToBeOdd).map(Utils::getSquare).reduce(0,Math::addExact);
        System.out.println(sum);
    }
    //ex6:
    //create a mthd to print "product of cubes" of distinct even numbers from the list elements on the console in the same line with a space betwn two consecutive elemtns(Functional Programming)

    public static void sumOfSquareDistinctEvens(List<Integer>l){
        Integer product= l.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getCube).reduce(1,Math::multiplyExact);//(t,u)->t+u
        System.out.println("The sum of the cubed of even distinct elements is "+ product);
    }
    //crt metd find max elemtn
    public static void getMaxEle(List<Integer>l){
        Integer maxEl=l.stream().reduce(Integer.MIN_VALUE,Math::max);
        System.out.println("the max elemtn is "+ maxEl);
    }
    //crt metd find min elemtn
    public static void findMinValue(List<Integer>l){
       Integer minVal= l.stream().reduce(Integer.MAX_VALUE,Math::min);
        System.out.println(minVal);
    }
    //crete method to find minimum value which is greater than 7 and "even"
    public static void getMinGreaterThanSevenEven2(List<Integer>l) {
      Integer minVal=  l.stream().distinct().filter(t->t>7).filter(Utils::checkToBeEven).reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(minVal);
    }

    //create a methodto find teh half of the elemnts which are distinct and greeater than 5 in reverse order in" teh list"
    public static void getHalfOfDistinctElementsReversed(List<Integer>l){
     List<Double> half=  l.
             stream().
             distinct().
             filter(t->t>5).
             map(Utils::getHalf).
             sorted(Comparator.reverseOrder()).
             collect(Collectors.toList());
        System.out.println(half);
    }

}
