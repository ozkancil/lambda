package practice.day19_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindingSumLeastAndGreatest {
    public static void main(String[] args) {
        /*
        find the sum of the least and the greatest price given in a String list.
        Example: List<String> myList=new List<String>{"$12.99","$23.60","$54.45"}; ==> 62.70
         */

        List<String> myList= Arrays.asList("$12.99","$23.60","$54.45");
        System.out.println(myList);

        List<Double> doubleList=new ArrayList<>();

        for(String w:myList){
           double price=Double.valueOf(w.replace("$",""));
           doubleList.add(price);
        }
        System.out.println(doubleList);

        Collections.sort(doubleList);
        System.out.println(doubleList);
        System.out.println(doubleList.get(0)+doubleList.get(doubleList.size()-1));


    }
}
