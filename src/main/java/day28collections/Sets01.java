package day28collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets01 {
    /*
    Note:Sets do not accept repeated non-primitve data types.
    These are all Data structures.
  1) Sets are for storing multiple non-primitive data in same data type.
  Sets are collections so it only accepts non-primitive data types.
  2)Sets are for storing unique data. That is the difference between Sets and List.
  Which one is better to use? ArrayLists, LinkedLists or Sets? Sets are the best because email addresses are always unique.
  When you want to save many email addressess in a structure you should select Set. If you do arrayList, it will work, but it is not good storage.
  LinkedList and arraylist are open to repeated data. Email addresses aare not reeapeated data. tehy are unique so choose Sets.
  Sets are unique. Email address, social security number, Phone Numbers in a country.
  3) there are 3 different Sets: 1. HashSet: Uses Hashing Technique->Hashing Technique is for creating unique addresses.
   When a student started school, so it would have university code, year, department code (like math, computer department),
   order number of student registered to that
   depart, by using this technique we make studnet ID unique. This would be a HashingTechniq. Java creates Hash code for every element in a Set. Hash code will
   be unique for every element. When you look for the element java will find hte hash code in the begining from the hash code java will access to the elmeent.
   we will tell java find abc java find hash code from beginign then it will access the element. java uses this system in Hashing.
   If java doesnt create hashcode for every element it can conduse which elemnte will be fetched. we will tell java to get ab but it can get didfrerent one.
   Hash COdes will give the elements we want no mistakes. this is hash code technique.
   for example if we put abc into a set and we put bac those are different element, and cba , java will create a hash table.
   of table we will have hash code on left and
   on right elemetns. Codes are created automatically but it will definitely be unique.

   NOTES: Hash sets use hash Tables.
   It does not put elements in any order.
   Is this good or bad characteristic?
   Putting elements in order takes too much time. so no order is easier nad makes it easier to put them there. Faster.
   Most of the times we use hashsets to make our applications faster.
   HashSet accepts "null" as element.
   we can put null in it. Can we put mutliple null in hashset? No cuz Set is uniqueniess and this goes for null as well. So only one null for hashset


   2. LinkedHashSet--> puts the elements in "Insertion order"
   If i want to store unique data in insertion order use LinkedHashSet, it puts it in order. Hash for uniqueness Linked for order
   3. TreeSet. Puts the elements in natural order meaning, Ascending order in numbers, alphabetical order in strings. This is really slow.
   so we do not use this. I make HashSet and convert the hashset to TreeSet, which makes code faster.
   If you want to put unique elementes in natural order which collection do you use?
   answer: TreeSet
   Question: As you know, TreeSet is so slow in adding elements, how can you improve your code?
   I will create a hashset, add elemtns into hashset and tehn convert the hashset to treeset. the conversion operation will be faster.


     */
    public static void main(String[] args) {
        HashSet<String> emails=new HashSet<>();
        System.out.println(emails);//we will see []. For collections we see [].
        //LinkedList had 6 add methods. LinkedList focused on adding operation.
        //HashSet is not focused on adding

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        emails.add("Mango");// does not givee compile time error even with HashSet being unique. But when we run it we will not see the repeated data.
        emails.add(null);//HashSets Accepts null. it will show us null as well. Most of times it will put null in begining.
        emails.add(null); //It only accepts a single null. no repeated data.
        System.out.println(emails);// we should see [   ] each HashSet. As you can see there is no order. All order different. Hashset has no order.

        emails.remove("Fig");// only single remove method, not like linkedList which has like 4. HashSet is not concerned about adding and removing.

        emails.size();//in collections we use size

       // emails.clear();//it will clear all elements from the HashSet.

        emails.clone();//will clone the hashSet.

        //When you use clone() method, you can make data type "Object"
        Object emails2= emails.clone();
        System.out.println(emails2);
        HashSet<String> emails3= (HashSet<String>) emails.clone();// it does explicit narrowing, hashset is narrower then object, object is parent, hashset child.
        System.out.println(emails3);

        Object emails4=emails.clone();
        System.out.println(emails4);

//TreeSet-->slower
        Long starting =System.currentTimeMillis();
        Long Starting1= LocalTime.now().toNanoOfDay();
        System.out.println(starting);
        Set<Integer> nums=new TreeSet<>();
        nums.add(23);
        nums.add(5);
        nums.add(17);
        nums.add(67);
        nums.add(41);
        nums.add(-5);
     //   nums.add(null);//treeset does not accept null. Cuz tree set accepts elements in natural order so it doesnt know where to put the element null
        System.out.println(nums);//TreeSet puts the elements in ascending order which is the natural way. Ascending and alphabetical

        Long middle =System.currentTimeMillis();
        System.out.println(middle);
        Long middle1=LocalTime.now().toNanoOfDay();


//2ndway--> faster
        HashSet<Integer> nums2= new HashSet<>();//Getting it from hashset and puttting it into TreeSet is faster
        nums2.add(23);
        nums2.add(5);
        nums2.add(17);
        nums2.add(67);
        nums2.add(41);
        nums2.add(-5);
        nums2.add(23);
        System.out.println(nums2);//need to put it into ascending order how?

        Set<Integer> perfectNums=new TreeSet<>(nums2);//////
        System.out.println(perfectNums);

        Long ending =System.currentTimeMillis();
        System.out.println(ending);
        Long ending1=LocalTime.now().toNanoOfDay();

        System.out.println(middle-starting);
        System.out.println(ending-middle);
    }
}
