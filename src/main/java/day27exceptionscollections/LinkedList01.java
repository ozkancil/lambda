package day27exceptionscollections;

import java.util.LinkedList;
import java.util.List;

/*
1ST: ITERABLE
2ND: COLLECTION
THEN THE ONES BELOW:
LIST IS AN INTERFACE
QUEUE IS A INTERFACE
SET IS A INTERFACE
SORTED SET IS A INTERFACE
DEQUE IS A INTERFACE

List<> ages= new ArrayList<>(). for the List part we can put collections, Iterable, any interface name, but the ArrayList<>() is the
class its self so we must use that to specify which interface we are using.
collections are for storing multiple data in the same data type.
collections are flexible in length.
collections have many useful methods.

There are 3 main Interfaces under collections: 1.list==> array list, and linkedlist
                                  2. queue=> priorityQueue, LinkedList.  Deque--> is attached to LinkedList
                                  3.set==> Hashset, LinkedHashSet, and Treeset
    List keyword is an interface and doesn't have constructors
    so we have to do List<> ages=new AarrayList<>(); array list is the object, constructor.
    Data type can be from all over  List<> can be Set, etc, dont matter. we can get from class or
    parent. Interfaces do not have constructors. No body so no need for constructors.
 */
public class LinkedList01 {
/*
LIST
 1. ArrayList
 2.LinkedList

 Benefit of linked list, difference, why java created it. whats the purpose, why its useful.
 ArrayList search operations are fast.

 java does re-index when u remove a element. If u have 1billion elements, reindex is too much task for java.
 So arraylists are not successful in removing Elements.So is this clear?

LinkedList-> pointer of data 1 points to data 2, 2 to 3, 3 to 4. all are data parts. So the first element is linked with the one after it. SO its called linked
list. the last element will point to null in a linked list. Head points to first element, and head has no data. Node is the one with the data inside.
so with linkedlist we say node, not elements. WE can use it but node aare better for linkedList.
Each elements have a pointer part.Data made LinkedList easier to add and remover compared to aarrayList.to add or delete the pointer points to new element.
Removing an element, java breaks pointer and put the pointer on new element. thats it.
Every node has pointer. last node points to null.
Java will check head, then keep going through each element one by one to find the element. so searching for nodes in linkedlist is really difficult.
LinkedList does not have an official address.
So if we are searching for elements a lot then best to use ArrayList/
if we are removing and adding a lot then best to use LinkedList.
 */
//Array list successfull in search operations, but not in adding and removing elements.
    //LinkedList Successful in adding adn removing. not good at search operations.
    /*
    nodes do not have address, so its hard to locate elements for LinkedList.
     */

public static void main(String[] args) {
    LinkedList<String> visitors=new LinkedList<>();//this is a concrete class. Blue ones are concrete classes from the chart. Interfaces are not
    // concrete.
    //I can write List<String>, Collections, Iterable, object because data type can be from any parent. Object is a class.
    visitors.add("Tom");//add method comes from List interface.
    visitors.add("Tom");
    visitors.add("Mary");
    visitors.add("Carl");
    visitors.add("Ali");


    LinkedList<String> kids=new LinkedList<>();
    visitors.addLast("abc");
    visitors.addFirst("vbn");
    visitors.addFirst("dfgfdgdfgdfgfdg");
    visitors.addAll(kids);
    System.out.println(visitors);

    visitors.add(2,"Miami");//actually moves to nodes over, but to make it easy for developers it says move index over
    //In index it goes directly to index, but for nodes it goes step by step.
    System.out.println(visitors);

    visitors.addAll(kids);


    visitors.addAll(6,kids);
    System.out.println(visitors);

    visitors.remove(2);
    System.out.println(visitors);

    visitors.remove("abc");//removes first occurrence of the object
    System.out.println(visitors);

    visitors.removeFirst();
    System.out.println(visitors);
    visitors.remove();
    System.out.println(visitors);

    visitors.removeFirstOccurrence("Ali");
    System.out.println(visitors);




LinkedList<String> visitors1=new LinkedList<>();

    visitors1.add("Apple");//add method comes from List interface.
    visitors1.add("Tom");
    visitors1.add("Mary");
    visitors1.add("Carl");
    visitors1.add("Ali");
    //ex1; change all names strt with "A" to ******
    //we can use for each loop for collections. Lets type daata type for nodes
    for(String w:visitors1){
        if(w.startsWith("A")){
            visitors1.set(visitors1.indexOf(w),"******");

        }
    }
    System.out.println(visitors1);

    /*
    are linked lists mutable or unmutable ? they are mutable cuz we can change the nodes as we wish.
     */

//example2:
    //learn the characteristic of all Collections, and be able to choose a collection for a specific task.
//Arrays are fixed in lenght, use memory less, faster. Collections have many features, more advanceed, slower, use memory too much
    //for simple structures use array.

    //FROM the linked list if hte number of characters is more than 3 remove them from the Link List.


LinkedList<String> a=new LinkedList<>();

a.add("Alexandre");
    a.add("Alexandre");
    a.add("Alexandre");
    a.add("Tom");
    a.add("Alexandre");
    a.add("Ashley");
    a.add("Alexandre");
    a.add("Mary");
    a.add("Carl");
    a.add("Brayden");

    for (int i=0;i<a.size();i++){
        if(a.get(i).length()>4){//The reason we want to do
            a.remove(a.get(i));
    }

}
    System.out.println(a);

    //i want to not print anything with a length greater than 4. This can be a good interview question

    for (int i=0; i<a.size();i++){
        if (a.get(i).length()>4){
            a.remove(a.get(i));//for remove methods its good to use i-- because it removes the element and the index starts from zero on the next element.
            // if we dont reduce it might skip and not read
i--;
        }
    }
    System.out.println(a);





















}}
