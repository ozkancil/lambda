package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {
        //find the closest 2 integers in the given list. [12,15,10,21]
        List<Integer> a=new ArrayList<>();
        a.add(12);//10
        a.add(15);//12
        a.add(10);//15
        a.add(21);//20

        Collections.sort(a);
        System.out.println(a);
        int minDifference=Integer.MAX_VALUE;
        //How to get minimum difference?
        //to get the minimum difference we use Math.min
        for(int i=1;i<a.size();i++){
            minDifference=Math.min(minDifference,a.get(i)- a.get(i-1));

       }

        System.out.println(minDifference);
for (int i=1;i<a.size();i++){
    if(a.get(i)-a.get(i-1)==minDifference){
        System.out.println(a.get(i)+" and "+a.get(i-1));
    }
        }



    }
}
