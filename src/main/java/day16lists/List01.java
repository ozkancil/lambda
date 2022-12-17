package day16lists;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        //when you create an array you have to declare the length of the array.
        //with list there is no limitations. YOu can put as much as data inside it as much as you
        //need
        //AArrays are fixed in length
        //lists are not restricted in length.
        //Lists are for storing multiple data in the same data type
        //Lists can store non-primitive types.
        //Lists have many useful methods, Arrays do not
        //Lists cannot store primitive data types. If you want to you have to do wrapper class
        //Lists can put multiple/different data types under one List
        //Printing Lists is easier than arrays, just put the name of List
        //AArrays are faster
        //Arrays use less storage
        //Arrays are used when you know the length of a given value.

        //How to create a List(Arraylist) 1st way
        ArrayList<Integer> myList=new ArrayList<Integer>();

        //2nd way:
        ArrayList<Integer> myList2=new ArrayList<>();

        //3rd way:
        List<Integer> myList3=new ArrayList<>();

        //How to print a List on the console
        System.out.println(myList);//just put the name
        System.out.println(myList2);
        System.out.println(myList3);

        //How to add elements to List
        //myList3.add("Buzz"); ----> wont work because i created the List using an Integer not a String
        myList.add(30);
        myList3.add(12);//which ever you put first in the insertion order thats the order it will be in
        myList3.add(7);//here 30 will be the frist then 12, 7, and 23.
        myList3.add(23);
        System.out.println(myList3);

        //how to add an element into a specific index
        myList3.add(1,50);//so it will be between 12 and 7 add 50
        myList3.add(4,99);
        System.out.println(myList3);

        //How to join two lists
        List<String>a=new ArrayList<>();
        List<String>b=new ArrayList<>();
        a.add("A");
        a.add("b");
        b.add("x");
        b.add("Y");
        b.add("Z");


        a.addAll(b);//b doesnt change only a changes

        System.out.println(a);
        System.out.println(b);

        a.addAll(1,b);

        System.out.println(a);

        //How to get the num of elements in a list
        int sizeOfA=a.size();//we do not need to do for loop or for each loop like for an Array.
        System.out.println(sizeOfA);
        int sizeOfB=b.size();
        System.out.println(sizeOfB);
        //For Lists use size for the length of element in Lists
        //For arrays use length.

        //example 1: check to see if List is empty or not
        System.out.println(myList.isEmpty());
        System.out.println(myList3.isEmpty());
        System.out.println(a.isEmpty());


        List<Character> c=new ArrayList<>();
        c.add('x');
        c.add('y');
        //1st way
        int sizeOfC=c.size();//This is how we get length for List Arrays
        if(sizeOfC==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List is not empty");
        }
        System.out.println(c.isEmpty());// ----> this is BEST TO USE BECAUSE IT IS SPECIFIC TO JAVA. JAVA CREATED THIS SPECIFIC FUNCTIONALITY.

        boolean isEmpty=c.isEmpty();

        if(isEmpty){
            System.out.println("The list is empty");
        }else {
            System.out.println("The list is not empty");
        }


        //TYPE code do check if the list does not have any element different from space or the list does not have any element
        //After removing the spaces the List should be empty. But if there is anything else it will be false.

        List<String> d=new ArrayList<>();
        d.add(" ");
        d.add("as");
        d.addAll(d);
        System.out.println(d);
        //d.removeAll(d);
        //System.out.println(d);
        //to be able to use removeAll() method you need list.
        List<String> e=new ArrayList<>();
        e.add(" ");
        d.removeAll(e);//we use remove all because we want to erase the space.

       System.out.println(d);
       if(d.isEmpty()){
           System.out.println("The list is empty or has just space character");
       }else{
           System.out.println("The list has character/s different from space");
       }

       String a1="";
       String b1=" ";
        System.out.println("isEmpty is "+a1.isEmpty()+" "+b1.isEmpty());
        System.out.println("isBlank is "+a1.isBlank()+" "+b1.isBlank());
    }
}
