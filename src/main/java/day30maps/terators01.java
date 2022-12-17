package day30maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class terators01 {
    /*
    we have for loop, while loop, do while loop, and for each loop(enhanced loop)/
    for each loop is better to use cuz its eeasier to use and its performance is better than the others.
    Meaning it has less time complexity and works faster.
    By using for each loop it is impossible to remove or modify a collection.
    Therefor, java created a new structure to be able to remove some elements from a collection or modify a collection.
    It is called iterators.
    There 2 iterators, i)iterator ii)List iterator   --> iterator works in one direction. When we use iterator in a collection we can start from the begining and go
    to the end. List iterator is bi directional, we can start from the beginning and go to the end and start from the end and go come to the front.

    When you want to remove or update collections in a list use Iterators. Iterator is just for removing, but list iterator can be used to update as well.
    for each loop and iterators have same performance. Iterators are the best to remove elements or to modify elements in a collection.
    for each loop could not update the collection without using set() method. Set method uses iterator behind it.
     */


    public static void main(String[] args) {

        List<String> list1=new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");

        System.out.println(list1);
        //reemove can from the list
        //for each loop could not update the collection without using set() method.
        //with index we can remove update a list. but without index its hard.
//        for (String w:list1){
//            if(w.equals("Can")){
//                list1.remove(w);
//
//            }
//        }
//        System.out.println(list1);
////updaate every element by putting ! to the end
//        String container="";
//        for (String w:list1){
//            container=container+w+"!";
//        }
//        System.out.println(container);
//
//
//        for (String w:list1){
//         list1.set(list1.indexOf(w),w+"!");
//        }
//        System.out.println(list1);



//use iterator
        //there are two creations in java, one being like a lord creating from scratch, the other being
        //from something else.
        //We have created an iterator object below. So we are calling the iterator from ...
       ListIterator<String> itr1= list1.listIterator();//iterator method creates new.
//while(itr1.hasNext()) {//keeps checking the next element
//    /*
//    hasNext() method asks the list if there is an element next and if there is it collects it and goes to the next in line.
//    this is how we remove all elements by using iterator.
//     */
//
//
//String el=itr1.next();
//itr1.remove();
//}System.out.println();







        while(itr1.hasNext()){

            String el1=itr1.next();
            itr1.set(el1+"*"); }
        System.out.println(list1);


/*
if we were to put remove after this it would not delete the list because hasNext puts the pointer after the last eleemtn so remove has nothing to delete
 */
//        while(itr1.hasNext()){
//            String el1=itr1.next();
//            itr1.remove();
//        }


//to remove from the list we need to use hasPrevious() method, because list Iterators are by directional.

        while(itr1.hasPrevious()){//has previous asks if there is any elements before it.
            String el3=itr1.previous();//This gets element before Aliye and moves the pointer to the left. and pinterer moves before aliye, then Can then Ali.
            itr1.remove();

        }








    }





}
