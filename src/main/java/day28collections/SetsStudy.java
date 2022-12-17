package day28collections;

import java.util.HashSet;

public class SetsStudy {
    public static void main(String[] args) {
        HashSet<String> emails=new HashSet<>();
        emails.add("apple");

        HashSet<String> emails1=new HashSet<>();
        emails1.add("apple");
        emails1.add("orange");
        emails1.add("grape");

        emails1.remove("apple");//--> .remove can remove a string without putting it in system.out.print. only removes. no
        //boolean
        System.out.println(emails1.remove("orange"));//gave true.
        System.out.println(emails1);
    }
}
