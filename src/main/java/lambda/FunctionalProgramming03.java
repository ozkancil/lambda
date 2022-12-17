package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FunctionalProgramming03 {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("mark");
        l.add("john");
        l.add("ashley");
        l.add("Bradly");
        l.add("Micheal");
    }
    //crte methd to print all list elemtns in uppercase
    public static void printUpperCase1(List<String>l){
        l.stream().map(String::toUpperCase).forEach(Utils::printInTheSameLineWithASpace);

    }
    //crte methd to print all list elemtns in uppercase
    public static void printUpperCase2(List<String>l){
        l.replaceAll(String::toUpperCase);
        System.out.println(l);
    }
    //crte a mthd to print the elmnts after orderng oaccording to their legnrths
    public static void printSortedByLength(List<String>l){                       //this is method reference
        l.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);


    }
    //crte method to sort the distinct elments by using their last characters
    public static void printSortedBylastChar(List<String>l){
        l.stream().distinct().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).forEach(System.out::println);

    }
    //crte method to sort the distinct elments by using their lengths then according to their first characters
    public static void printSortedByFirstCharLength(List<String>l){
        l.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).forEach(System.out::println);
    }
    //remove elmnts if the length of the elmt is greater than 5
    public static void removeIfLengthGreaterThanFive(List<String>l){
        l.removeIf(t->t.length()>5);
        //System.out.println("The length of all elments greater than 5 "+l);
    }
//remove elment if elmt starts with 'A' 'a' or ending with 'N' 'n'
    public static void removeElmntStartWithAaOrEndgWithNn(List<String>l){
        l.removeIf(t->t.charAt(0)=='A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='N' || t.charAt(t.length()-1)=='n');
      //  System.out.println(l);
    }
    //crte metd which takes square of the lenght of every elemnt, prints them distinctly in reverse order
    public static void printSquareDistinctReverse(List<String>l){
        l.stream().map(String::length).map(Utils::getSquare).distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
    //8) crt method to check if the lgnths of all elmtns are less than 12
    public static boolean checkIfLengthLessThanTwelve(List<String>l){
        //in allMatch() all must satisfy the the condition
    boolean True=    l.stream().allMatch(t->t.length()<12);
        System.out.println(True);

        return True;

    }
//crte method to chck if the intial of any elemnt is not 'X'

    public static void checkINitialIsNotX(List<String>l){
        //noneMatch() no elmnts must satisfy the elemnts
        /*
        Returns whether no elements of
        this stream match the provided predicate.
         May not evaluate the predicate on all elements
         if not necessary for determining the result. If the
          stream is empty then true is returned and the predicate is not evaluated.

         */
      boolean x=  l.stream().noneMatch(t->t.startsWith("X"));
        System.out.println(x);

    }
    //create mtdh to chck if at least one of the elmnts ending with "R"
    public static void checkLastCharIsR(List<String>l){
        /*
        Returns whether any elements of this stream match the provided predicate.
        May not evaluate the predicate on all elements if not necessary for determining the result.
        If the stream is empty then false is returned and the predicate is not evaluated.
         */
       boolean rest= l.stream().anyMatch(t->t.endsWith("R"));
        System.out.println(rest);
    }



    }
