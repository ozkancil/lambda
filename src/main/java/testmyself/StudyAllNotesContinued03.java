package testmyself;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudyAllNotesContinued03 {
    public static void main(String[] args) {
        /*
        create user array and add each name into the array
         */
//        Scanner scan=new Scanner((System.in));
//        System.out.println("Enter amount of students");//first we need to create the containers
//        int amountOfStudents=scan.nextInt();
//
//        //now I need to put the amount of students inside an array to make the containers
//        String studentNamesContainer[]=new String[amountOfStudents];
//
//        for (int i=0;i<amountOfStudents;i++){
//            System.out.println("Enter student names");
//            //Now we have to enter the student names
//            String studentNames=scan.next();//Dont put a [], cuz u are just adding names to the container.
//            //now i want to get each container and add the names to it. Add all names into the container
//            studentNamesContainer[i]=studentNames;
//            System.out.println(Arrays.toString(studentNamesContainer));
//            System.out.println("out of the loop=================");
//        }
//        System.out.println(Arrays.toString(studentNamesContainer));

        ////how to add an element into a specific index
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1,10);

        System.out.println(list
        );
        //How to join two lists
        List<Integer>join=new ArrayList<>();
        join.add(12);
        join.add(13);
        join.add(14);
        join.addAll(list);
        List<String>a=new ArrayList<>();
        List<String>b=new ArrayList<>();
        a.add("A");
        a.add("b");
        b.add("x");
        b.add("Y");
        b.add("Z");
        a.addAll(b);

        //How to get the num of elements in a list
       int size= a.size();
        System.out.println(size);

        System.out.println(a.isEmpty());
        boolean isEmpty=a.isEmpty();

        if(size==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List is not empty");
        }


        //TYPE code do check if the list does not have any element different from space or the list does not have any element
        //After removing the spaces the List should be empty. But if there is anything else it will be false.
        List<String>c=new ArrayList<>();
        c.add(" ");
        c.add("A");
        c.add("b");
        c.add("x");

        System.out.println(c);
        List<String> v=new ArrayList<>();
        v.add(" ");
c.removeAll(v);
        System.out.println(c);

        //ex: type code to remove first occurrence of a specific element from a string list
        //["Shoes","TV","Radio","Laptop","Shoes","Book","Shoes"]
        //to remove first occurrence java created a method which is "remove()"
        List<String> str=new ArrayList<>();
        str.add("Shoes");
        str.add("Tv");
        str.add("Radio");
        str.add("Laptop");
        str.add("Shoes");
        str.add("Book");
        str.add("Shoes");
        str.add("Moon");
        str.add("soon");
        str.add("soccer");
        str.add("basketball");
        str.add("tennis");
        System.out.println(str);
        str.remove("Shoes");
        System.out.println(str);
     String name=   str.remove(str.size()-1);
        System.out.println(name);
       // System.out.println(str.remove(11));--> index out of bound

        //Ex2: type code to remove all occurrences of a specific element from a String List
        //when we use removeAll() method we need another list
        List<String> lst=new ArrayList<>();
        lst.add("Shoes");
        str.removeAll(lst);
        System.out.println(str);

        //example 3: type code to remove an element at a specific index
        str.remove(5);//erases moon cuz i erased others before that and java runs from top to bottom
        System.out.println(str);

        //Example4: Create an Integer List, then remove the 4th element.
        List<Integer> e=new ArrayList<>();
        e.add(12);
        e.add(4);
        e.add(13);
        e.add(25);
        e.add(432);
        e.remove(3);
        System.out.println(e);

        //ex5: create an integer List, then remove the first occurrence of 4
        e.remove("4");
        System.out.println(e);
  //int remove=  Integer.valueOf(4);
        List<Integer>four=new ArrayList<>();
        four.add(4);
      String rmv= String.valueOf(four);
      e.remove(rmv);
        System.out.println(e);
        //e.remove(new Integer(4));
        System.out.println(e);
//        e.remove(Integer.valueOf(4));
//        System.out.println(e);
       e.remove(Integer.valueOf(4));

        //example 6: Type code to check if a specific element exists in the list or not
        List<Double> g=new ArrayList<>();
        g.add(12.99);
        g.add(5.02);
        g.add(11.23);
      boolean exist=  g.contains(5.02);
        System.out.println(exist);


        //example 7: type code to change the element at index 1 to 9.99
        List<Double> h=new ArrayList<>();
        h.add(12.99);
        h.add(5.02);
        h.add(11.23);
        h.set(1,9.99);

        h.set(1,9.99);
        System.out.println(h);

        //example 8: Increase every one's salary by 10% in an Integer list
        //  [5000, 6000, 4500, 3900, 7200]
        List<Double> percent=new ArrayList<>();
        percent.add(5000.0);
        percent.add(6000.0);
        percent.add(4500.0);
        percent.add(3900.0);
        percent.add(7200.0);

        for (int i=0;i<percent.size();i++){
            percent.set(i, percent.get(i)*1.1);
            //System.out.println(percent);


        }
        System.out.println(percent);


        //How to check if a list contains multiple elements
        //12,23,32,12,24,56--> check if the list has 23,56, and 24
        List<Integer>p=new ArrayList<>();
        p.add(12);
        p.add(23);
        p.add(32);
        p.add(14);
        p.add(24);
        p.add(56);
       // p.containsAll(Arrays.asList(23,56,24);
        //System.out.println(p.containsAll(Arrays.asList(23,56,24));

        List<Integer> contains=new ArrayList<>();
        contains.add(23);
        contains.add(24);
        contains.add(56);

        p.containsAll(contains);
        if (p.containsAll(contains)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
boolean exists=p.containsAll(contains);
        System.out.println(exists);
    }
}
