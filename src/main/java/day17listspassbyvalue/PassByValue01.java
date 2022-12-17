package day17listspassbyvalue;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValue01 {
    //pass by value is a concept
    /*
    1)when you use a variable inside a method java creates the copy of the variable and uses it inside
    the method. Java does that to protect the original value of the variables.
    If in every method usage, the value changes, it creates very big problems.
    This is pass by value

    2) some programming languages do not use pass by value they use pass by reference. if you use
    pass by reference original value will change in every method usage.

    3) if u insist on change the original value you can do it aas well.
    assign the updated value to the original value then original value will be updated
     */


    public static void main(String[] args) {

        int price=20;
        System.out.println(price);
        System.out.println(change(price));
        System.out.println(price);
        price=change(price);
        System.out.println(price);

        String arr[]={"l","b","d"};
        System.out.println(Arrays.toString(arr));



        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);



    }

        public static int change(int a){
        return a*2;



}
}
