package day12variabletypesstaticblockarrays;

/*
1) value of pi will be 0 if u dont assign any value for static and non static variables. java assigns default value to them.
but java does not assign default value for "local variables". it will complain if you do sout.

2) default values are 0 for numeric data types; it is "null" for string.  it is false for boolean if nothing is assigned to it.
null= means it has nothing.
zero means it has no content but plain is there

java class loader makes the class ready to use for you.
Class is non primitive; the reason for this is because it has values and methods. so it uses heap memory. it has a method so it connot be primitive.
if it has method it cannot be primitve. so it goes inside the heap memory.

WHEN JAVA IS RUNNING ORDER OF PROCEDURE
1)when java is running first it loads the
2)inside the main method java will laod variables or methods
sometimes we need somethings before main method. so if we need it before main method we need to write static block.
3)So static block can run before main method.
for example: I want to create a class about geometry. I will use pi in geometry. i will use it a lot. so pi will be used before the main method. it
will be static, so we will create a static value *^1. we will use pi many times in the geometry class so we make it static before method.

NOTE: when we create a variable inside the main method, we do not use "static" keyword, because java knows everything inside the main method is static.
 */


public class StaticBlock01 {
    /*
    1) java class loader makes teh classes ready to use
    2) when the classes make ready, class members are loaded according to some order.
    main method is laoded first, normally.
    3) sometimes we need something to be loaded first. before the main method. for this scenario we use "static block"
    the codes inside the static block is executed before everything in the class. even before main method. doesn't matter where the static block is placed
    it will run before main method. All static blocks will run before main method, doesn't matter where the static blocks are placed.
    4) Rule: "static" structures can work just with static class members. NON-STATIC FIELD CANNOT BE CALLED FROM STATIC CONTEXT only works with non-static.
    STATIC  WORKS WITH STATIC and nonstatic. Do not put non-static class members into static methods.
    5) static block can be used with static variables because of the rule in the 4th step
    6)static block is used to initialize(assigning first value) static variables. Meaning to give a value to it.
     */
    public static double pi;// we can use pi in static block cuz we made it a static.

    public int age=13;

    static{// static value (*^1) is ready before the main method.
        System.out.println("This is static block");
        pi=3.14;
    }

    //pay attention to static value before the main method.
    public static void main(String[] args) {
        System.out.println("This is main method");
        pi=3.14;//initializing pi variable
//age++; NON STATIC CANNOT BE CALLED FROM A STATIC CONTEXT
        //NON STATIC ONLY WORKS WITH NON STATIC
        //STATIC WORKS WITH STATIC and non static

        String name="Ali Can";// java knows to accept it all as static if it is not static. u cant put static before String name; because java knows it is already static and will complain
        //that it is static. in main method its automatically static

        //static{ this is static block

    }
    static{
        System.out.println("This will come before main method even though it is after main method. this is static block");
        pi=5;


    }
    static{
        System.out.println("this is static block 3");
    }
    public static int add(int a, int b){
        return a+b;
    }
}
