package day16lists;

import java.util.ArrayList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
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

        str.remove(2);
        System.out.println(str);
        str.remove("Shoes");//remove() method removes the first shoe.
        System.out.println(str);
        //str.removeAll(str,"Shoes");we can remove all like this. we need to create another list and put shoes in that list
        //then removeAll() and use that list name to remove the shoes.

        //Ex2: type code to remove all occurrences of a specific element from a String List
        // ["Shoes","TV","Radio","Laptop","Shoes","Book","Shoes"]
        //User removeAll() but we need another list
        List<String> shoes=new ArrayList<>();
        shoes.add("Shoes");
        shoes.add("Laptop");


        str.removeAll(shoes);//removeAll() method can be used with another list.
        //remove() method can be used with the index and the word its self.
        System.out.println(str);
        //example 3: type code to remove an element at a specific index
        //["Shoes","TV","Radio","Laptop","Shoes","Book","Shoes"]--> remove 5th element

        List<String> d=new ArrayList<>();
        d.add("Shoes");
        d.add("Tv");
        d.add("Radio");
        d.add("Laptop");
        d.add("RED");
        d.add("Book");
        d.add("Shoes");
        d.add("Moon");
        d.add("soon");
        d.add("soccer");
        d.add("basketball");
        d.add("tennis");
        System.out.println(d);
        d.remove(4);
        System.out.println(d);

        //Example4: Create an Integer List, then remove the 4th element.
        List<Integer> e=new ArrayList<>();
        e.add(12);
        e.add(4);
        e.add(13);
        e.add(25);
        e.add(432);
        System.out.println(e);

        e.remove(1);
        System.out.println(e);
        e.remove(Integer.valueOf("25"));
        System.out.println(e);
        //ex5: create an integer List, then remove the first occurrence of 4
        List<Integer>f=new ArrayList<>();
        f.add(12);
        f.add(4);
        f.add(13);
        f.add(25);
        f.add(432);
        System.out.println(f);

        f.remove(1);//This doesn't remove the actual number for, its going for the element at index 4. to remove element int 4 we need to to Integer f.remove(Integer.valueOf(4))
        System.out.println(f);
        //indexes in java use primitive integers.
        //List elements are non-primitve integers. so when we do Integer.valueOf("4"), it takes it as a
        //non-primitive type Integer(wrapper class) which then java recognizes as the actual 4, not index 4.

        f.remove(Integer.valueOf(4));//this and Integer.valueOf("4") does the same thing, and erases the actual 4 digit. not
        //Index.
        System.out.println(f+" this is for the removel of Integer.valueOf(4)");

        //Note: if you use integer List element directly inside the remove() method like remove(4) java will
        //take it as an index. Because indexes are primitve integers. when you put 4 it will be accepted as
        //primitve and it will be index.
        //Lists use non-primitives as list elements, there you have to convert primitive int to Integer.
        //To do that we use valueOf() method from Integer wrapper class

        //Note: you will see "valueOf()" method in many classes.
        // "valueOf()" method changes the data type without changing the value.

        //example 6: Type code to check if a specific element exists in the list or not
        List<Double> g=new ArrayList<>();
        g.add(12.99);
g.add(5.02);
g.add(11.23);
boolean exists= g.contains(5.03);
        System.out.println(exists);

        //example 7: type code to change the element at index 1 to 9.99
        List<Double> h=new ArrayList<>();
        h.add(12.99);
        h.add(5.02);
        h.add(11.23);
        h.set(1,9.99);//set method is updating an element using index. it takes out the index
        //value that you input and puts in the new one. So it replaces the element
        h.add(1,3.4);
        System.out.println(h);

        //example 8: Increase every one's salary by 10% in an Integer list
        //  [5000, 6000, 4500, 3900, 7200]
        List<Double> percent=new ArrayList<>();
        percent.add(5000.0);
        percent.add(6000.0);
        percent.add(4500.0);
        percent.add(3900.0);
        percent.add(7200.0);

        for(int i=0; i<percent.size();i++){
//            double newAmount=percent.size()*1.1;
//            percent.set(i, newAmount);
          //double amount= percent.get(i); .. so to get an index we use .get() method in java not the [i]
       percent.set(i, percent.get(i)*1.1);
        }
        System.out.println(percent+" this is the one =================");



//   ArrayList<Integer> arrlist = new ArrayList<Integer>();
//      arrlist.add(14);
//      arrlist.add(7);
//      arrlist.add(39);
//      arrlist.add(40);

      /* For Loop for iterating ArrayList */
//        System.out.println("For Loop");
//        for (int counter = 0; counter < arrlist.size(); counter++) {
//            System.out.println(arrlist.get(counter));
//        }
//
//        /* Advanced For Loop*/
//        System.out.println("Advanced For Loop");
//        for (Integer num : arrlist) {
//            System.out.println(num);
//        }
//
//        /* While Loop for iterating ArrayList*/
//        System.out.println("While Loop");
//        int count = 0;
//        while (arrlist.size() > count) {
//            System.out.println(arrlist.get(count));
//            count++;
//        }
//
//        /*Looping Array List using Iterator*/
//        System.out.println("Iterator");
//        Iterator iter = arrlist.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }
//
//        */


        //how to check if two lists are same or not
        List<Character> m=new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n=new ArrayList<>();
        n.add('x');
        n.add('o');
        n.add('z');
//equals() method checks if the same elements are in the same position.
        //if same elements are in the same position with same index equal method returns true. otherwise it returns false

        if(m.equals(n)){
            System.out.println("The list are same");
        }else{
            System.out.println("the list are not same");
        }

        //How to check if a list contains multiple elements
        //12,23,32,12,24,56--> check if the list has 23,56, and 24
        List<Integer>p=new ArrayList<>();
        p.add(12);
        p.add(23);
        p.add(32);
        p.add(14);
        p.add(24);
        p.add(56);

        List<Integer> q=new ArrayList<>();
        q.add(23);
        q.add(56);
        q.add(24);

        //containsAll() method returns true if all elements exist, anyone of them does not exist it returns "false"
      boolean areExist=  p.containsAll(q);
        System.out.println(areExist);

    }
}
