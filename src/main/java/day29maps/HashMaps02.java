package day29maps;

import java.util.HashMap;

public class HashMaps02 {
    public static void main(String[] args) {
        HashMap<String, Double>coursePrices=new HashMap<>();
        coursePrices.put("Full Stack Java Development",6000.00);
        /*
        java creates a hashcode, integer, for the put, for the key.
        So the put method creates a hashcode. so we will have hash code, key and value.
        Then java puts a pointer after value as well.
there are 16 buckets so it does hashcode/bucket/. in one bucket HashMap can put thousands of nodes,
so no need to create more than 16.

It has 4 parts to it: 1) hashcode 2) key 3) value 4) pointer.

1) when you create a hashmap java creates 16 buckets in memory and index them from 0 to 15
2) when u use put() method java creates an integer hashcode and calculates hascodes%16
3)The result of hashcodes%16 will be the index to select bucket
4)After selecting bucket java will put the entry into the selected bucket as a node of a linkedlist.
5)Every node will have 4 parts in it. i. hashcode ii.key   iii.value    iv. pointer
6) java makes every hashcode unique but sometimes java can create same hashcodes accidentally,
 this is called hashcode collision
7) HashCode collisions are common phenomena of hashing functions.
8)
         */
        //java will create a hash code for this. lets make hashcode 65. then key, and value. and then pointer. java puts
        //pointer to  make a link list. We can tell java to give us the certain hashcode. so this is a unique data.
        //Java makes mistakes accidently and this is called hash collition.
        coursePrices.put("Full Stack Automation Engineer",5800.00);

        coursePrices.put("SalesForce Development",4500.00);//the node has 4 parts.










    }
}
