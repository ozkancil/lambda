package day28collections;

import java.util.Deque;
import java.util.LinkedList;

public class Queue02_01 {
    public static void main(String[] args) {
/*
queue can have repeated data. only sets are unique.
When ever we need a storage, select apporriate one.
When we choose deque we know why? I need to focus on first and last elements,
 cilovski20first in first out, last in first out.
 */
        Deque<String> deq = new LinkedList<>();
        deq.add("ozka");
        deq.add("av");
        deq.add("a");
        deq.add("s");
        deq.add("d");
deq.add("bed");
        deq.push("TV unit");//adds to the beginning. has capacity requirements. Cannot put more than required amount.
        System.out.println(deq);
        deq.add("Dining table");
        System.out.println(deq);

        deq.pop();
        /*
        Pops an element from the stack represented by this deque. In other words, removes and returns the first element of this deque.
This method is equivalent to removeFirst().
Returns:
the element at the front of this deque (which is the top of the stack represented by this deque)
Throws:
NoSuchElementException – if this deque is empty
         */
        System.out.println(deq.pop());
        System.out.println(deq);

        deq.removeLastOccurrence("bed");
        System.out.println(deq);

        deq.removeLast();
        System.out.println(deq);




















    }
}