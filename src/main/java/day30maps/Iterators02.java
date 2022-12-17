package day30maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

    public static void main(String[] args) {

/*
Increase the numbers in a list by 20 percent then print the elements in the reverse order of the given order.
20,60,30,100
 */
        List<Integer> myList =new ArrayList<>();
        myList.add(20);
        myList.add(60);
        myList.add(30);
        myList.add(100);

       ListIterator<Integer>myItr= myList.listIterator();

       while(myItr.hasNext()){
           myItr.next();//pointer will be at the end with this

       }

       //This code moves the pointer to the end.
        //Even you do right to left it does not change order of list element.
        //if u want to change oorder of list do, Collections.reverse(MyList);
        while(myItr.hasPrevious()){
          Integer numEl=  myItr.previous();
          myItr.set((numEl*120/100));
        }
        Collections.reverse(myList);
        System.out.println(myList);

    }
}
