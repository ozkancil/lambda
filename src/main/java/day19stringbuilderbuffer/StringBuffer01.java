package day19stringbuilderbuffer;

public class StringBuffer01 {
    public static void main(String[] args) {
        /*
        StringBuffer is another class to create Strings in Java.
        StringBuffer is very similar with StringBuilder. Both are mutable.
        If u want to change original value in every method usage you can select StringBuilder
        or StringBuffer.

        What is the difference between StringBuffer and StringBuilder.
        Buffer was created in the begining, Builder was created after in java.
        StringBuffer is multi-thread but StringBuilder is not.
        Multi thread means something like multi-tasking. Can do many tasks simultaneously.
        StringBuilder cannot do this

        From a logical point of view, multithreading means multiple lines of a single program.
        In this case, the operating system is treating the programs as two separate and distinct processes.
        Java's creators have graciously designed two ways of creating threads: implementing an interface and extending a class .
         */
        /*
        NOTE: How buffer works on multiple tasks is that it splits the cpu, the energy into the required
        fields/asked fields.
        StringBuffer is slower than StringBuilder.

        Scenarios:
        1) I need immutable String==> String class
        2) I need mutable and not multi-thread==>StringBuilder
        3) I need mutable and multi-thread==> StringBuffer

        When you use multi-thread you need to create an order for the threads. This is called synchronization
         */
        /*
        String obeject them self are not changeable in String just the pointer for the variable name changes.
        For example: Strin name="Ozkan"; ,  name="John"; Here the object is still ozkan, but now we have the pointer pointing to
        john from the variable name, so this means its immutable. not changeable but the pointer changes thats all.
        So the string object in memory is not modified, what java does is that it makes a brand new string object in memory with the value
        john, and changes the name variable to point to that new string object it created in memory which is john now. So it no longer points at
        ozkan string object in memory. So when we talk about string objects are immutable we are talking about string objects in memory.
         String variables them selfs can be changed to point to what every string object we want. But string object cannot be
         changed.
         This lets us save a lot of memory and space.
         So for example if you create two String variables one being name and the other being name1 and make both equal "John"
         what java does is it does not create another string object and put "John" in there as well. because both are John
         what java does is it points from the name and name1 variable to John instead of creating another John. and this is called
         immutable and saves memory. The name John is in the String pool, and everytime a string variable is created java will check if the value
         is in the string pool if it is it points to that string object in the string pool instead of creating a new java object called John, because
         it has already been used.

         However, if we want to create a new container what we can do is String name2=new String("John");
         This creates a new container outside of the String pool

         */





    }
}
