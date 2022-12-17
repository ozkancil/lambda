package day29maps;

import practice.interfaces.K;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {


    /*
    hashmap is like a dictionary map. it has a key and has a value.
    Key is not repeated data, key is unique. But the value part can be repeated.
    In maps everything has two parts. Not one. Element has single part, but these have two parts.
    Entry is like an element of a map.
    Entry Set is the name of all elements in hashmap.
    The reason its called Entry Sets is because it is unique. Each key is unique, just like hashsets, so
    we call it Entry Sets.
    Key can be null, and its the first one in line cuz index is zero.
    Xeria=      --> value can be null. Value can be null repeatedly.

    1)MAPS have key value structure.
    2)Keys are unique but values are not
    3) Every elemtn in a Map is called as "entry"
    4) All elemetns are called as "EntrySet"
    6) HashMap puts the entries into  random order so it's super fast.
    7)Only HashMaps accept null, not the other two maps.
    8) Key having null makes the hashcode 0 so null key will always show first.
     */

        //How to create a HashMap
        HashMap<String, Integer> stdAges = new HashMap<>();

        //How to put entries into a Hashmap
        stdAges.put("Ali can",13);
        stdAges.put("Tom Hanks",46);
        stdAges.put("Brad Pitt",55);
        stdAges.put("Angelina Julie",48);
        stdAges.put(null,8);

                                //first entry       second entry    third entry    fourth entry
        System.out.println(stdAges);//{Tom Hanks=46, Brad Pitt=55, Ali can=13, Angelina Julie=48}


/*
1) you can work with just keys. You can focus on one thing, Like the name from above so we need to fetch just the names. Names are keys.theres a keySet() method
2)We can only get the values.
 */
        //How to get just keys from a Map
     Set<String> keys= stdAges.keySet();//this gives a set container
        System.out.println(keys);//we get only the keys in a set.

//how to get Values from a Map
        Collection<Integer> ages=stdAges.values();//values are not put into a set because values
        // can be repeated,
        // not unique, but sets are unique so we had
        //keySet() method. values are put into a list.
        System.out.println(ages);

        ///Can I put null into key
        stdAges.put(null,23);
        System.out.println(stdAges);


        //Put null into value
        stdAges.put("Ajda pekkan",null);
        System.out.println(stdAges);

        //Can we put null for both
        stdAges.put(null,null);
        System.out.println(stdAges);



        //What happens if u use same key repeatedly
        //Java accepts the final value for the key(overwriting)
        stdAges.put("Angelina Jule",23);
        System.out.println(stdAges);

    //How to get a value of a key? This is how we use key to get value.
      Integer tomAge=  stdAges.get("Tom Hanks");
        System.out.println(tomAge);

//If key doesnt exist when we use get method what happens? gives null.
        Integer unknown=stdAges.get("ozkaan");
        System.out.println(unknown);

        //returns the value of second parameter if abc does not exist among the keys.
       int unknownAge= stdAges.getOrDefault("abc",0);
        System.out.println(unknownAge);

        //I want to put an entry if it doesnt exist I will not put it.
        stdAges.putIfAbsent("Brad Pit",44);
        System.out.println(stdAges);

        stdAges.putIfAbsent("Cuneyt Arkin",44);
        System.out.println(stdAges);

        //How to replace
        stdAges.replace("Tom Hanks",56);
        System.out.println(stdAges);

        //you can replace the value but only if that value exists to begin with
        stdAges.replace("Tom Hanks", 56, 66);
        System.out.println(stdAges);


//How to remove from entry
stdAges.remove("Someone Unknown");
        System.out.println(stdAges);

        stdAges.remove("Ajda pekkan",null);
        System.out.println(stdAges);


        //How to get entries one by one from a Map
Set<Map.Entry<String,Integer>> entries =stdAges.entrySet();
for(Map.Entry<String,Integer> w:entries){
    System.out.println(w+" *");
}















    }
}