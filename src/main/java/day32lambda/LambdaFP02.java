package day32lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.LinkedTransferQueue;
import java.util.stream.Collectors;

/*
1) variable or variables gives us the logic part==>this structure is called Lambda expression
2) In functional programming we can use Lambda expression, it is allowed but not recommended.
instead of lambda expression we prefer method reference.
3) Method reference is Class Name:: Method Name.
For Ex: "String :: length" (Do not type method parenthesis, just type method name).
     "Arrays::toString"
     "UtilityClass::getCube"
     You can use your own class to create the required methods for your application.
     For ex: You created Animal class and you have eat() method in Animal class==> "Animal
 */
public class LambdaFP02 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(8);
        list.add(9);
        list.add(131);
        list.add(10);
        list .add(9);
        list .add(10);
        list .add(2);
        list .add(2);
        list .add(8);



printElements(list);
evenNum(list);
        System.out.println("===============");
        System.out.print("");
printSquareOdd(list);
sumOfSquareDstnctEvenElemtns(list);
cubeOfElmt(list);
maxValue(list);
    }
    //Create a method to print the elements on the console in the same line with a space
    //between two consecutive elements.
    public static void printElements(List<Integer>numbers){//"UtilityClass::getCube"

      //  numbers.stream().distinct().filter(t->t%2!=0).map(UtilityClass::getCube).forEach(t-> System.out.println(t));
        numbers.stream().forEach(UtilsClass::printLine);

    }

    //use method reference here.
    public static void evenNum(List<Integer> num){
        System.out.print(" ===== ");
        num.stream().filter(UtilsClass::checkToBeEven).forEach(UtilsClass::printLine);
    }

    //find square of odd numbers of elements with space. print square of odd list.
    public static void printSquareOdd(List<Integer>lst){
        lst.stream().filter(UtilsClass::checkToBeOdd).map(UtilsClass::getSquare).forEach(UtilsClass::printLine);
    }
    //create method cube distinct odd same line. space between them
    public static void cubeOfOdd(List<Integer>list){
        list.
                stream().
                distinct().
                filter(UtilsClass::checkToBeOdd).
                map(UtilsClass::getCube);
    }
    //create method sum of squares distinct even elements
    public static void sumOfSquareDstnctEvenElemtns(List<Integer>evenDsnt){
      Integer sumTotal=  evenDsnt.
                stream().
                distinct().
                filter(UtilsClass::checkToBeEven).
                map(UtilsClass::getSquare).
                reduce(0,Math::addExact);
        System.out.println(sumTotal);
    }
    public static void sumOfSquareDstnctEvenElemtns02(List<Integer>even){
        even.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::getSquare).reduce(0,Integer::sum);

    }
    //create a methdod prodct distnct cubee even elemtns
    public static void cubeOfElmt(List<Integer>cube){
       Integer mult= cube.
               stream().
               distinct().
               filter(UtilsClass::checkToBeEven).map(UtilsClass::getCube).reduce(1,Math::multiplyExact);
        System.out.println(mult);
    }
    //create metod to find distinct max value from list elments
    public static void getMaxElmtns02(List<Integer>maxEl){
       Integer maxV= maxEl.stream().distinct().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(maxV);
    }
    //create method to find minimum vlue from lsit elments in 2 ways by using method reference
    //greater than 7 and even elemnts from the list
    public static void maxValue(List<Integer>maxv){
       Integer min= maxv.stream().distinct().filter(t->t>7).filter(UtilsClass::checkToBeEven).reduce(Integer.MAX_VALUE,Math::min);
        System.out.println(min);

    }
    //create a method to find the half of teh elemtns which are disticnt and greater than 5 in reverse order in a list
    public static void getHalfOfDistnctEleInReverseOrder(List<Integer>home){
      List<Double> result=  home.
              stream().
              distinct().
              filter(t->t>5).
              map(UtilsClass::half).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }



}
