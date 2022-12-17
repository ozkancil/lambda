package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {
//EXAMPLE 1: TYPE CODE TO MAKE ALL ELEMENTS IN A LIST UNIQUE
        //2,3,2,2,5--> 2,3,5 make a new list and put each number that is not added to the new list
        //-so all elements will be unique in the new list
        List<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        a.add(4);

List<Integer> b=new ArrayList<>();

for(Integer w:a){
    if(!b.contains(w)){
    b.add(w);
    }
}
        System.out.println(b);

//ask user to enter a letter, if the letter exists  inside the list, convert the element to "Got it"
        //otherwise, add element into the list


        List<String>c=new ArrayList<>();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("a");
        c.add("e");
        c.add("f");

        List<String>d=new ArrayList<>();
        d.add("a");
        d.add("b");
        d.add("c");
        for (String w:c){
            if(d.contains(w)){
                System.out.println("Got it");
            }else{
                d.add(w);
            }
        }
        System.out.println(d);


        Scanner input=new Scanner(System.in);
        System.out.println("Enter a letter");
        String str=input.next();

        List<String>list=new ArrayList<>();
        list.add("A");
        list.add("K");
        list.add("R");
        list.add("S");

            if(list.contains(str)){
                list.set(list.indexOf(str),"Got it");
            }else {
                list.add(str);
            }

        System.out.println(list);

        List<String>q=new ArrayList<>();
        q.add("Al");
        q.add("Ks");
        q.add("Re");
        q.add("Sv");
        q.add("Re");

        System.out.println(q.indexOf("Re"));//index of gives u the first occurrence of an element
        // indexOf() method returns -1 for non existing elements
        System.out.println(q.indexOf("b"));

        //How can you understand the existence of a specific element in a List?
        //We use indexOf() method if the result is -1 it means the element does not exist
        //if the result is not -1 then it means the element exists
        //You can use contains as well
        //So we have two methods, we can use indexOf() and contains() method.

        //lastIndexOf("Re") we will get 4 cuz it's the last occurrence in the list
        // lastIndexOf() returns -1 for non existent elements.
        System.out.println(q.lastIndexOf("Re"));

    }
}
