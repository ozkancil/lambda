package practice.day19_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSumLeastAndGreatest {
    public static void main(String[] args) {


     /*
        find the sum of the least and the greatest price given in a String list.
        Example: List<String> myList=new List<String>{"$12.99","$23.60","$54.45"}; ==> 62.70
         */
    List<String> myList= Arrays.asList("$12.99","$23.60","$54.45");
    List<Double> sum=new ArrayList<>();



    for(String w:myList){
      String replace=w.replace("$","");
        System.out.println(replace);
      double total=Double.valueOf(replace);
      sum.add(total);

    }
        System.out.println(sum);








    }
}
