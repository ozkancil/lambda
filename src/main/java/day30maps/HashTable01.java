package day30maps;

import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {
        /*
        1) Hashtable is a Map
        2)Hashtable does not put entries to any order. HashMap and Hashtable does not put in order.
         But Hashtable is still slow. Why so?
        3)Hashtable thread-safe and synchronized. Needs time to do these
         thread safe means: u have visitors to ur house and u need to prepare salads which will take 20 min
         nad need to prepare soup which will take 40 minutes
         to cook meat will take 50 minutes. to prepare food it will take 110 minutes. Meat and soup will
          take together 50 min, and once soup is on the oven, we can do salad, so totol will take 50 minutes.
         so at the same time we can make 3 dishes in less time, we are working with more with less time.
         Java does some tasks together if it can work at the same time.
         This is multi thread.
         some things are not ok for multi threeads. So hashtable can use multi thread operations meaning
          it is thread safe.
         SYnchonized --> means that synchronization is preparing all things one by one but at the same time,
          but Synchronization means sensible order. So if you staart
         with salad first you wont have time to make soup and meat, but you can make meat and soup together,
          so sensible order would be starting with soup and meat first and as they
         cook you can start the salad.
         HashMap is not thread safe and synchronized.
           */
        Hashtable<String, Integer> countryPopulations=new Hashtable<>();//Hashtable is a Map,
        // just the name is Hash table.
        countryPopulations.put("USA",400000000);
        countryPopulations.put("Germany",85000000);
        countryPopulations.put("USA",81000000);
        System.out.println(countryPopulations);

        //Example 1: Store students names together with their email addresses, ages, grades, nationality.

        Hashtable<String, Students> studentsInfo=new Hashtable();//We used our on class as data typ in codes.
        // Getting Student constructor parameters,
        // and only putting Student uses the data types
        //that was in Student class for the variables.
        studentsInfo.put("Tom Hanks",new Students("th@gmail.com",21,2,"American"));
        studentsInfo.put("Brad Pitt",new Students("bp@gmail.com",22,3,"Columbian"));
        studentsInfo.put("Angelina Julie",new Students("ag@gmail.com",19,1,"Peru"));
        System.out.println(studentsInfo);
//Our own classes can be data type as well
Students tomInfo =studentsInfo.get("Tom Hanks");
        System.out.println(tomInfo);

        //I want to see just age
        System.out.println(tomInfo.age);
        System.out.println(tomInfo.nationality);




    }
}
