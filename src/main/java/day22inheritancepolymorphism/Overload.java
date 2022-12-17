package day22inheritancepolymorphism;

public class Overload {
    /*
    OOP has 4 inheritance:
    1) Polymorphism
    2) Encapsulation
    3)Abstraction
    4)Inheritance
     */
// = Overloading + Override --> together they make the polymorphism.
    /*
    1. if u create a method with the same name and different parameters, it means you arae doing "method overloading"
    2. Method overloading happens in a single class.
    3. To do method overlaoding
      i) do not change the method name
      ii) change the parameters by changing the a)number of parameters b) data type of the parameters c)places of the parameters.
      Note: to use option c data types must be different.
    4. private methods can be overloaded.
    5. finale methods: final methods can be overloaded as well. final method do not block us from. However, we cannot override the final method cuz we
    cannot update the body. in Overloadding we are not touching body we are touching parameters.
    6. static methods can be overloaded
     */
     /*
Why do we need method overloading? Naming methods is very important. naming methods and naming variables will be checked. You will type codes, you freinds will check
your codes. ONe way of chekcing is naming convention.
So we are doing add() and changing parametere and java thinks its a different method. doing add1() add2() add3() is not good.
     */


    public static void main(String[] args) {

        add(3,5);
        add(8);
        add(3,5);
        add(5,3);
        add(4,6);
        add(5,7);
        add(5,7);
        add(5,2.0);
        add(5,7.2);
        add(5,7.4);
        add(5,7.8);
        add(5,7.9);
        add(5,1);
        add(5,2);
        add(5,3);
        add(5,7);
        add(5,7);
        add(5,7);
    }
    public static void add(int a, double b){
        System.out.println(a+b);

    }
    public static void add(int a, int b) {
        System.out.println(a + b);
    }
    public static void add(double a, int b) {
        System.out.println(a + b);
    }
    public static void add(int a){
        System.out.println(a);
}
    public static void add(double a) {
        System.out.println(a);
    }
    public static void add(String a) {
        System.out.println(a);


    }
    private static void add(int a, String b) {
        System.out.println(a + b);

    }
    public static final void add(String a, int b) {
        System.out.println(a + b);
    }
    public static final void add(double a, float b){
        System.out.println(a+b);

}}

