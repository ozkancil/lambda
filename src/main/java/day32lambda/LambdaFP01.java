package day32lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFP01 {

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
        getMinGreaterThanSeven(list);
        halfReverse(list);
    }

    //create a method to find the minimum value which is greater than 7 and even elements from the list
    public static void getMinGreaterThanSeven(List<Integer>lst){
        Integer min=lst.stream().distinct().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();
        System.out.println(min);
    }
    //Create aa method to find the half of the elements which are distinct and greater than 5.
    public static void halfReverse(List<Integer>reverse){
       List<Double>result= reverse.
                stream().
                distinct().
                filter(t->t>5).
                map(t->t/2.0).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());


        System.out.println(result);























    }
}
