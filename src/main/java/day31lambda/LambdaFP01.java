package day31lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaFP01 {
    public static void main(String[] args) {
        /*
        the lambda expression is used to provide the implementation of an interface wwhich has
        functional interface.
        it saves a lot of code. in case of lambda expression, we dont need to define the method again for providing
        the implementation.
        A lambda expression is a short block of code which takes in parameters and returns a value.
        Lambda expressions are similar to methods, but they do not need  a
        name and they can be implemented right in
        the body of a method.

        Functional programming is called lambda. To type codes in functional programming
        is shorter and it is error free.
        in functional programming, we use the methods that were created by java.
        The usage of structured programming is a larger way to type codes in java.
        For ex: substring is created by java it is error free cuz it was created by java which means that it was tested thousands
        of times beforee it was deployed. Functional programming can be used for arrays,
        collections and maps but we cannot use maps directly in functional programming. At the beginning we should convert a map to a
        collection and then we can use maps for functional programming as well==> How to convert a map into a collection?

        1) Lambda is funcitonal programming, IT field started to use lambda in java 8
        2) In functional programming we focus on "what to do"
        But in structured language we focus on "how to do".
        3) Functional programming can be used just with arrays and collections
        4)by using "entrySet()" method java converts Map to set, then you can use functional programming in Maps as well.

         */

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
        printElementFunctional(list);
        System.out.print("==================");
        evenNum(list);
        getAllEvenNumbers(list);
        oddSquaredFunctionalProgramming(list);
        printCubeOfDistinctOddElements(list);
        distinctEvenNum(list);
        distinctOfCubesEvenNumbersProduct(list);
    }
    //create a method to print the elements on the console in the same line with a space
    //between two consecutive eelements. (Structured P)
    public static void printElements(List<Integer>list){
        for(Integer w:list){
            System.out.print(w+" ");
        }
    }

//Now we will use functional programming.
    public static void printElementFunctional(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t+" "));

    }

//create a method to print the even elements. Structural programming
    public static void evenNum(List<Integer>num){
        for(Integer w:num){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    //Now use functional programming
    public static void getAllEvenNumbers(List<Integer> num1){
       // num1.stream().forEach(t-> System.out.println(t+" "));//Java created stream() method to reach all
        num1.stream().filter(t-> t%2==0).forEach(t-> System.out.println(t+" "));
    }


    //create a method to print the square of odd list elemetns on the console in the same line with a space between them.
    public static void printSquareofOddElements(List<Integer>number){
        for(Integer w:number){
            if(w%2!=0){
                System.out.println(w*2);
            }
        }}




    //square odd numbers using a lambda (functional programming)
public static void oddSquaredFunctionalProgramming(List<Integer>numbers){
        numbers.stream().filter(t-> t%2!=0).forEach(t->System.out.println(t*2+" * "));
        numbers.stream().filter(t-> t%2!=0).map(t->t*t).forEach(t-> System.out.println(t));
}

//create a method to print the cube of distinct odd list elements on the console in the saame line using functional programming
    //print only distinct elements meaning different elements. So elements cant be the same.
    public static void printCubeOfDistinctOddElements(List<Integer>numbers){
        //numbers.stream().map(t->t*3).forEach(t-> System.out.println(t));
        numbers.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.println(t));
    }
//create a method to calculate hte sum of the squares of distinct even elemetns
    public static void distinctEvenNum(List<Integer>numbers){
        //numbers.stream().distinct().filter(t->t%2==0).map(t->t*t).forEach(t-> System.out.println(t));
   Integer evenDistinctNum= numbers.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(evenDistinctNum);
    }


//create a method to calculate teh product of the cubes of distinct even elemtns
    public static void distinctOfCubesEvenNumbersProduct(List<Integer>numbers){

       Integer product= numbers.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(product);
    }

    //Create a method to find teh maximum value from the list elements
    public static void getMaxElement01(List<Integer>max){
       Integer maxValue= max.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
        System.out.println(maxValue);
    }
    public static void getMaxElement02(List<Integer>max){
        Integer maxValue02= max.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);//sorted method always puts the elemnts in ascending order.
        System.out.println(maxValue02);







}}
