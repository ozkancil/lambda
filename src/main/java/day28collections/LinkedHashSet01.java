package day28collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet01 extends HashSet<String> {
    public static void main(String[] args) {

        LinkedHashSet<Integer> ssn=new LinkedHashSet<>();
        ssn.add(123456789);
        ssn.add(234567891);
        ssn.add(345678912);
        ssn.add(456789123);
        ssn.add(null);
        ssn.add(null);//only adds unique ones and orders them. so u cant add two things twice.
        ssn.add(456789123);

        System.out.println(ssn
        );// puts everything in order. LinkedHashSet is slower then hashset, cuz linkedhashset takes time putting it in order.


    }

}
