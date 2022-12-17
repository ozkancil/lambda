package testmyself;

import java.util.*;

public class AllNotesContinued04 {
    public static void main(String[] args) {
        //EXAMPLE 1: TYPE CODE TO MAKE ALL ELEMENTS IN A LIST UNIQUE
        //2,3,2,2,5--> 2,3,5 make a new list and put each number that is not added to the new list
        //-so all elements will be unique in the new list
        List<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(2);
        a.add(1);
        List<Integer>b=new ArrayList<>();
       for (Integer w:a){

           if (!b.contains(w)){
               b.add(w);
           }
       }
        System.out.println(b);


        //ask user to enter a letter, if the letter exists  inside the list, convert the element to "Got it"
        //otherwise, add element into the list
        List<String> c=new ArrayList<>();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("2");
        c.add("1");
        List<String>d=new ArrayList<>();
        d.add("1");
        d.add("e");
        d.add("3");
        d.add("a");
        d.add("b");
        d.add("1");
        for (String w:c){
            if(d.contains(w)){
                d.set(d.indexOf(w),"Got it!");
            }
            d.add(w);
        }
        System.out.println(d);

        //using user enter letters to see if they are in the list, if not add them, if they are say got it
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter letters");
//        String letters=input.next();
//
//        List<String>e=new ArrayList<>();
//        e.add("1");
//        e.add("e");
//        e.add("3");
//        e.add("a");
//        e.add("b");
//        e.add("1");
//        System.out.println(e);

//        for(String w:e){
//            if(e.contains(letters)){
//                e.set(e.indexOf(w),"Got it");
//            }
//            e.add(letters);
//        }
//        System.out.println(e);
//            if(e.contains(letters)){
//            e.set(e.indexOf(letters),"Got it");
//
//            e.add(letters);
//        }
//        System.out.println(e);

        //find the closest 2 integers in the given list. [12,15,10,21]
        List<Integer> f=new ArrayList<>();
        f.add(12);
        f.add(15);
        f.add(10);
        f.add(21);
        Collections.sort(f);
        int minDiff=Integer.MAX_VALUE;
        for(int i=1;i<f.size();i++){
            minDiff=Math.min(minDiff,f.get(i)-f.get(i-1));
        }
        System.out.println(minDiff);

        //now print the out which numbers are the minimum
        for (int i=1;i<f.size();i++){
            if(f.get(i)-f.get(i-1)==minDiff){
                System.out.println(f.get(i)+" - "+f.get(i-1)+ " = "+minDiff);
            }
        }


        /*
        def distance(x, y):
    if x >= y:
        result = x - y
    else:
        result = y - x
    return result
         */
    }
}
