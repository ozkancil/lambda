package day02typecastingscanner;

public class WrapperClass01 {
    public static void main(String[] args) {
/*Wrapper class:
    non primitives have methods together with values.
    Primitives do not have methods. so action cannot be done.
    java uses primitive value and methods together and this new class is called "WRAPPER CLASS"

    Wrapper classes are non-primitive data types.
    ----------                ------------
    primitive data          Wrapper class
    byte                     Byte
    short                    Short
    int                      Integer
    long                      Long
    float                    Float
    double                    Double
    boolean                   Boolean
    char                      Character
                              String
 */

        //BELOW ARE WRAPPER EXAMPLES.
        int i=12;
        //i.//those that appear is not a method cuz it does not have a paranthesis.
    Integer k=12;
    //k.//this is a wrapper class cuz it uses Integer instead of int.
   char c='A';
   //c.//not a method there are no paranthesis. THis is a primitive data type
        Character d=3;
      //  d.//this has methods. cuz it has paranthesis.

        //AUTOBOXING: converting primitive data to wrapper class
        byte b=23;
        Byte wb=b;

        //unboxing: wrapper class to primitive data
        Short ws=34;
        short s=ws;

        //how to get the minimum and maximum values of numeric data types in Java
        int m=13;
        Integer n=m;
        System.out.println(Integer.MAX_VALUE
        );
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
//The idea of putting a dot in java means you want to see inside the byte. so if we do Byte. we want to see inside the byte




    }
}
