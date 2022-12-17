package day19stringbuilderbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {
        //what is "string builder class"
        //Stringbuilder class is for creating mutable Strings.


        //we use "String Class" to create a String, why or when will we need it, when building a "StringBuilder Class"
        //String Class is "immutable", "StringBuilder Class" is "mutable"


        //when we write this code java reserves an area in the heap memory and names it as name. Not stack memory.
        //When we put somthing in the heap memory java creates a address for it. So it goes into stack memory as n1.
        //this being in the heap memory, tom does not change. What java does is that it creates a pool at the beginning, so when we try to make
        // another name add to name, java will create another String inside the pool and it will be have Mark in it. So Tom and Mark are both in the pool so Tom is still
        //added to the name. Java does not change Tom. Java maakes the aaaddress and points the mark and to Mark.
        //So this is why we say String class is immutable, but String Builder Class is mutable.
        //String class is immutable so it does not change
        //if you want to assign a new value to a variable java will create a new container inside the string pool.
        //then java will put a new value in it. Then it changes the address pointer to the new container.
        //
        String name="Tom";
       name="Mark";

       //if any container does not have any address pointer, "garbage collector" removes the container
        //from the memory. before removing things from memory, java finalizes them. without finalizing
        //java does not remove anything from memory. as a developer we do not effect trashing. its up to trash

        String str="John";
        String st="John";
        st="sam";//java will throw this in the trash cuz this is a String builder Class

        //I want a separate container whose value is John
        String u=new String("John");//this creates a new container, saying do not use existing container.


        //other benefit of immutability is security
        //there are a couple of pointers pointing to john. You have a method and the method will deposit money for john
        //we will use m1 to deposit money into john. deposit(m1)
        //Then we have a change method which changes john to carl. So John will be Changed to carl. now money deposited to carl
        //but when we use IMMUTABILITY java for the change method will create another method will put carl and will change the pointer
        //to carl, and john will stay the same.
        //if it does not contain a container java will delete it

        //sometimes we dont want to use immutability. we want to change the value directly wihtout creating a new container
        //in memory, you can use String builder Class.

        StringBuilder sb=new StringBuilder("Clara");
        sb.append("ozkan");
        //sb="John"; does not accept this cuz its a string builder, so we cannot put a different value into the stringbuilder.
        //to make a new string builder we have to do
        sb=new StringBuilder("Jim");//now we changed Clara to jim. so we did not create a new container we changed whats in the
        //container, which is Clara and changed it to Jim

        //How to create a StringBuilder Object?
        //1st way:
        StringBuilder sb1=new StringBuilder("Clara");
       // System.out.println(sb1);

        //2nd way:
        StringBuilder sb2=new StringBuilder();//empty stringbuilder
        System.out.println(sb2);

        sb2.append("clara");
        System.out.println(sb2);

        sb2.append(" Ocean");
        System.out.println(sb2);

        sb2.append(" miami").append(" fl").append(" ozkan");
        System.out.println(sb2);

        //StringBuilder is a class. we learned how to create StringBuilder Object.
        //what will happen when we create a stringbuilder?
        StringBuilder sb3=new StringBuilder();
        int length=sb3.length();
        System.out.println(length);

        //int character=sb3.charAt(length);
       // length++;

        sb3.append("Jackson").append("Mexico").append("The USA");//here for the length we get 20 cuz it counts each character
        //as part of the length.

       int cap= sb3.capacity();//this becomes 34 becauase when we need more java adds more capacity. so gives 2 times plus 2 capacity
        System.out.println(cap);//we get 16 cuz capacity is 16 and it puts each character into a box
        //[j][o][h][n]

        int numOfChar=sb3.length();
        System.out.println(numOfChar);

        sb3.append("...........................................");
        int cap1=sb3.capacity();
        System.out.println(sb3.capacity());
        //NOTE: if you exceed the existing capacity java will increase teh capacity
        //like; 2*existing capacity+2









    }
}
