package day12variabletypesstaticblockarrays;

public class Runner {
    public static void main(String[] args) {


VariableTypes01 obj=new VariableTypes01();

        //to access  nonstatic u need an object
        System.out.println(obj.name);
        System.out.println(obj.age);//after the period it does not show age, but when we type manually it pops up. this is not recommended
        //static variable can be accessed using class.
        System.out.println(VariableTypes01.age);
        System.out.println(obj.add(3,5));//8

        System.out.println(obj.multiply(3,5));



}}
