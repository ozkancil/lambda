package testmyself;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinDiffInList {
    public static void main(String[] args) {
        //find the closest 2 integers in the given list. [12,15,10,21]
        List<Integer> f=new ArrayList<>();
        f.add(12);
        f.add(15);
        f.add(10);
        f.add(21);
        Collections.sort(f);
        //System.out.println(f.indexOf(12));
        int minDiff=Integer.MAX_VALUE;
        for (int i=1;i<f.size();i++){
            minDiff=Math.min(minDiff, f.get(i)-f.get(i-1));

        }
        System.out.println(minDiff);
        //now print the out which numbers are the minimum
for (int i=1;i<f.size();i++){
    if (f.get(i)-f.get(i-1)==minDiff){
        System.out.println(f.get(i)+" - "+f.get(i-1)+" = "+minDiff);

    }
    //System.out.println(f.get(i)+" - "+f.get(i-1)+" = "+minDiff);
}
    }
}
