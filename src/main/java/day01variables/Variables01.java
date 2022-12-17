package day01variables;

public class Variables01 {
    public static void main(String[] args) {
        //data type , variable name = value  ;
       //  1          2              3  4    5
        int age=27;
      //    container and we put the value inside of it
      //create a variable whose value is 1.99
      double price =1.99;
      //there are different data types. int, double, float, boolean
        //1)integer: it is used for whole numbers, meaning not decimals
        //the minimum value of integers is negative -2 billion something
        //the maximum value of integers is 2 billion something
        /*
integer variables use 32 bits in memory.

         */
int populationOfGermany=80000000;
System.out.println(populationOfGermany);

long populationOfTheWorld=7000000000L;//as long as  i write an L at the end it accepts it as a long value as an integer
        //to save memory
        long populationOfChina=1400000;//here java saves it as int so it doesnt take up space.
        byte ageOfStudent=23;
        short populationOfTheVillage=23000;

        System.out.println();

        /*
        Data types about decimal values
        1) float: it is used for decimal values(like 12.99, 5.23)
        float values use 32 bits in memory when you create a "float" variable, you have to use F or f at teh end
        of the value
        2)double: it used for decimal values. double uses 64 bits in memory
         */
        float sea=785.99F;//can have 7 digits at most
        double cell=0.00000000000001234;//it can contain 16 digits.
        /*
        Data types related with numbers
        byte<short<int<long<float<double
         */
/*
2 more data types: ->
1)boolean
     boolean uses just 1 bit in memory
2) char

 */
//for short we must do fewer numbers
        short populationOfTheWillage=23000;

        System.out.println(populationOfTheWillage);
/*
Data types about decimal values;
1)float: it is used for decimal values(12.99, 5.23).
    float values use memory 32 bits in memory. why do we put f at the end because all are double as memory so when we put f it turns it into
    an integer. doubles are more sensitive so it can contain more. but in float it can have seven digits at most.
2)double it is used for decimal values.
    double uses 64 bits in memory. double uses more memory than float. to save memory using float is better. but in real life
    we do not use float most of the time because i need to put f at the end so we do not do it. in real coding we do not use float
    when it comes to decimals.

 */
        /*
        we learned six data types.
        1) byte <short <integer <long <float <double --> these are related with numbers

         */

        /*
        there are two more related to data types
        1)boolean: It is for "true" and "false" answers.
            boolean just uses 1 bit in memory because it only has two values.
        2) char: it is for just a "single" character. this is for only single character. if u need one for a single character than use this.
            char uses 16 bit in value.
         */
float priceOfLaptop=785.99f;//you have to put f for floats or it complains even though its for decimals.
        double weightOfACell=0.0000012324324; //for double we do not need to put any f or d at the end. it does not reguire it
boolean isRetired=true;
boolean isOld=false;

char initialOfFirstName='a'; //must use ssingle character. can be a number letter antrhing but only single. '3'
        /*
        byte<short<int<long<float<double, boolean and char are called "PRIMITIVE DATA TYPES"
            if a variable contains just values, it is called "Primitive"
         */

        //NON-PRIMITIVE DATA TYPES:
        //String is a non-primitive data type.
        /*
        what is the difference primitive and non primitive data types?
                first -> the difference is primitive data types have just value. non primitive data types have values and methods. this is the most improtant diffrerence
                . second ->difference primitive data types were created by java, we cant create any java types.
                But we can create non-primitive data types when ever we need.
                Third one -> primitive data types use just lower cases in their data type names.
                non-primitive data types starts with upper cases in their data type names.
                4) usage of memory in primitive data types changes from data type to data type.
                but all non-primitive data types use same amount of memory.
         */
        String name="Tome Hnaks";
        //if you need to store mroe values in java use string
/*
                            Memory usage in java
           There are two memories in java, one is Stack memory. Stack memory is small we put primitie types and 2)reference (addresses) of non-primitive Data.
            HEAP memory we put huge memory. String data type would be HEAP memory. it is huge. Non primitive data types.


 */
//example1: create an integer vriable and 2 double variables then print their sum on the console
        int shirt=21;
        double shoes=12.99;
        double socks=3.99;
        double shoes1=12.99, socks1=3.99;
        System.out.println(shoes+socks+shirt);




        /*
        example 3:
        create 2 float variables, 3 short varialbes, 2 double variables and create there sum on the console.
         */
        float is=2;
        float so=3.4f;

        short short1=129;
        short short2=30000;
        short short3=3999;

        double d1=1.23435353;
        double d2=2323423423423423423422423423423423423423423342.43253232423423432342342342342342342342352242423423432532423432423423423423423423432423554534523423143434;

        float f1=1.3f, f2=3.4f;
        short s1=1,s=3,s2=4;
        double d=3.45443, d3=2.242434324234;
        System.out.println(f1+f2+s1+s+s2+d+d3);
/*
create a char variable and and an integer variable and try to do addition operation with them
 */

        char a='a';// it adds the ascii value that corresponds to 'a' which is 89 and the result is 99
        int b=2;
        System.out.println(a+b);

//Example 5: create a string variable and 2 integer variables and try to do addtion operation with them
        String sim="Tom";
        int i=12, k=23;
        System.out.println(sim+i+k);//tom1223
        System.out.println(sim+" is "+(i+k)+" years old");
        System.out.println(i+k);/// if u use primitive data with a string and use plus sign java does concotanination. so the data will be joned that is it.










    }
}
