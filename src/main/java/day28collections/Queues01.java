package day28collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {

    /*
    QUEUE IS an INterface so it does not have a constructor. there for we will use the constructor from LinkedList , or priorityQueue. If we use LinkedList elements will be in insertion order.
    PriorityQueue, it will put the elements in order depending on our rules, and we can manipulate and declare rules.
    queues are for storing multiple non-primitve data in the same data types.
    Queues are used for FIFO(First in First out). Put elements that go in first and comes out use QUEUE like in a food warehouse application
    usee Queues. It has FIFO characteristics.
     */
    public static void main(String [] args){
        Queue<String> warehouse=new LinkedList<>();//LinkedList uses insertion order, meaning the way you put it is the way you will get it output.
        warehouse.add("Milk");
        warehouse.add("Meat");
        warehouse.add("Bread");
        warehouse.add("Honey");
        warehouse.add("Tomatoes");
        System.out.println(warehouse);

       String el1= warehouse.poll();//retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println(el1);//removes the element after retrieving it
        System.out.println(warehouse);

        String el2=warehouse.peek();
        /* to access specific methods for fifo we need queue.
       Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
Returns:
the head of this queue, or null if this queue is empty
       */
        System.out.println(el2);//gives you only meat but meat is not removed.
        System.out.println(warehouse);//gives meat but meat is not removed.







        String el3=  warehouse.element();
        /*
        element() method           // String el5=emptyWareHouse.element();//if the queue is empty the element method throws nosuchelementexception.

        Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.
Returns:
the head of this queue
Throws:
NoSuchElementException – if this queue is empty.

If any product doesnt exist in the warehouse you are alarmed, throws exception. if you think application should be blocked use elements.


         */
        System.out.println(el3);
        System.out.println(warehouse);





        Queue<String> emptyWareHouse=new LinkedList<>();
        String el4=emptyWareHouse.peek();
        System.out.println(el4);
/*
Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
Returns:
the head of this queue, or null if this queue is empty
 */
       // System.out.println(el5);




















      boolean el6=  warehouse.offer("chocolate");
        /*
        inserts the specified element into this queue if it is possible to do so immediately
        without
        violating capacity restrictions. When using a capacity-restricted queue,
        this method is generally preferable to add, which can fail to insert an
        element only by throwing an exception.
Params:
e – the element to add
Returns:
true if the element was added to this queue, else false
Throws:
ClassCastException – if the class of the specified element prevents it from being added to this queue
NullPointerException – if the specified element is null and this queue does not permit null elements
IllegalArgumentException – if some property of this element prevents it from being added to this queue.

.add method doesnt look at capacity restrictions. but offer does.
so with queue we can do strictions so when we have restrictions we can use queue.
         */
        System.out.println(el6);
        System.out.println(warehouse);





     String el7=   warehouse.remove();
        /*
        Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.
Returns:
the head of this queue
Throws:
NoSuchElementException – if this queue is empty
         */
        System.out.println(el7);


        String el9=emptyWareHouse.peek();

        String el8=emptyWareHouse.remove();// throws NoSuchElementException
        System.out.println(el9);
        System.out.println(el8);




    }
}
