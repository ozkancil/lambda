package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgramming04DT {
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

        getSumOfAllElem(l);
        getSumOfIntFrom7To100();
    }
    //create a mthd to find  the sum of all elements in the list
    public static void getSumOfAllElem(List<Integer>l){
        //reduce is a final method(). cant use anyting after. these tpyes of methods are called terminal methods.
      Integer sum=  l.stream().reduce(0,Math::addExact);
        System.out.println(sum);

    }
    //crete a methd to find the sum of integers from 7 to 100
    public static void getSumOfIntFrom7To100(){
       Integer result= IntStream.rangeClosed(7,100).reduce(0,Math::addExact);
        System.out.println(result);
    }
    }


