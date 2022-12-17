package day17listspassbyvalue;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.List;

public class List03 {
    public static void main(String[] args) {
        //example 1: Increase the value of every element by 3 except 7
//        List<Integer> a = new ArrayList<>();
//        a.add(11);
//        a.add(31);
//        a.add(22);
//        a.add(7);
//        a.add(15);
//
//
//        for (Integer w : a) {
//            //System.out.println(w);
//            if (w == 7) {
//                continue;
//            } else {
//                System.out.println(a.set(a.indexOf(w),w+3));//this is just a way of doing it
//                //to see the results we must do sout(a)
//            }
//        }
//        System.out.println(a);

        //convert all elements to "*" except the last 4 elements
        List<String> b = new ArrayList<>();
        b.add("11");//1  //0
        b.add("31");//2  //1
        b.add("22");//3  //2
        b.add("7");//4   //3
        b.add("15");//5  //4
        b.add("31");//6  //5
        b.add("21");//7  //6
        b.add("67");//8  //7

     for(int i=0;i<b.size();i++){
         if(i==b.size()-4 || b.size()<5 ){
             break;
         }
         b.set(i,"*");
     }
        System.out.println(b);
    }}

