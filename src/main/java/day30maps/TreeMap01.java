package day30maps;

import java.util.*;

/*
1) TreeMap puts the entries in Natural order according to the keys.
2) PUtting elements in natural order requires too much time so TreeMap is the slowest
3)TreeMap is not thread safe, so we cannot use it for synchronizations
4) Null cannot be used for Hashtable

SO WE LEARNED THREE MAPS:
1) HashMap
2)Hashtable
3)TreeMap

 */
public class TreeMap01 {
    public static void main(String[] args) {


        TreeMap<String, Integer> countryPopulations=new TreeMap<>();
        countryPopulations.put("USA",400000000);
        countryPopulations.put("Germany",85000000);
        countryPopulations.put("Turkey",81000000);
        System.out.println(countryPopulations);

        //if the key inside the ceilingEntry() method paranthesis is th same with any key inside the TreeMap. you will get the entry itself.

        Map.Entry<String, Integer>abc=countryPopulations.ceilingEntry("T");
        System.out.println(abc);

        NavigableSet<String> keysInDescendingOrder=countryPopulations.descendingKeySet();
        System.out.println(countryPopulations);

        NavigableSet<String > mapInDescendingOrder= countryPopulations.descendingKeySet();
        System.out.println(mapInDescendingOrder);

        Map.Entry<String, Integer> def= countryPopulations.floorEntry("S");
        System.out.println(def);

        Map.Entry<String, Integer>ghi=countryPopulations.lowerEntry("S");
        System.out.println(ghi);

        SortedMap<String,Integer> subMap1=countryPopulations.subMap("Afghanistan ","Turkey");

        NavigableMap<String, Integer> subMap2=countryPopulations.subMap("Afghanistan",true,"Turkey",true);
        System.out.println(subMap2);

        SortedMap<String, Integer> tailMap1=countryPopulations.tailMap("Turkey");//like substring meaning start from turkey and get to the end\
        System.out.println(tailMap1);


        NavigableMap<String, Integer> tailMap2=countryPopulations.tailMap("Turkey",false);//Gets from turkey to the end. Turkey becomes exclusive
        System.out.println(tailMap2);

        //if you need a key value structure like a dictionary you will use map. country population we need country population so we need map.
//        studnet information with stdnt info and other info we need maps. so more like key value structures.
//        We have three maps, HashMap, Hashtable, and TreeMap. We neeed to know there charactteristics.
        //get() is used for all three hashes. HashMaps put things in randomly so we cannot talk about floor(), ceilingEntry, Head, tail methods.
        ////lower higher cuz random order.






    }
}