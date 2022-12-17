package practice.day19_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02_ConvertingEleInAList {
    /*
    If the list has 15 as element, change all 15s to 51.
    Example: 12,11,15,34,43==> Output is 12,11,51,34,43
     */
    public static void main(String[] args) {

        List<Integer> num=new ArrayList<>();
        num.add(12);
        num.add(11);
        num.add(15);
        num.add(34);
        num.add(43);

        //3rd wat to create list object
        List<Integer> list= Arrays.asList(12,11,13,34,43);
        System.out.println(list);

        if (list.contains(15)){
            //list.set(list.indexOf(15),51);
            for(int w:list){
                if(w==15){
                    list.set(list.indexOf(15),51);
                }
            }
            }else{
            System.out.println("list does not contain expected element");
        }
        System.out.println(list);





        for(int w:num){
            if (w==15){
                num.set(num.indexOf(w),51);
               // num.set(w,51);


            }
        }
        System.out.println(num);

    }

}
