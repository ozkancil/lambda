package day21inheritancepolymorphism;



public class CarRunner {
    /*
if i so super for civic, Honda, Accord classes and for Car class I can reach each one from the parent because now they are super classes. so
     its like we are overriding it
     So it will run Object, Car Honda, Cvic and Accord. so it goes from the top to the bottom, using the super() invisible key word.
     So the super word is in the background and already running. we do not see it
     super() is used to call constructors from the parents.
     1) super() is used to call consturctor from teh parent class, meaning we can write the parameter of it.
     2) super() is in the first line of every constructor body.
     3) super() is invisible as default, if you want you can type it explicity.

super() can be used with parameters like super(true), super("hybrid") super(2021)/
when a class has multiple constructors to select the constructor we need, we use super() with parameters.

When trying to access a variable by using an object in inheritance, start to look for the variable in the class used in the "data type of the object"
When trying to access a method by using an object in inheritance, start to look for the object in the class whose constructors was used.
In the first line of every constructor there is invisible super() to call constructor from the parent class, if you want you type it explicitly.
Data type of object can be selected from the class itself or from the parents of the class.
   Object dog= new Dog();  Animal dog=new Dog();   Mammal dog=new Dog();   Dog dog=new Dog();
   Private class memebers cannot be inherited.
   "default" class members can be inherited if the child class is in the same package with the parent class.
   protected and public class members do not have any restrictions in inheritance.


     */
    public static void main(String[] args) {
       day20accessmodifiersinheritance.Civic c=new day20accessmodifiersinheritance.Civic();//this is not the default constructor. its the one we created inside the Civic class.
//constructors are used from top to bottom so grandparent, parent then child.
        //System.out.println(Civic.ecoEngine(3,5));
        //So in simple terms, if you use return type other than void you have to put it in a sout.
        //If you use void, then you do not need sout, you can call it directly using object created
      // System.out.println(Civic.ecoEngine()+" look at this one");
        //System.out.println(Civic.ecoEngine());
       //Civic.ecoEngine();
        //System.out.println(Civic.ecoEngine());
        //System.out.println(Civic.ecoEngine(8,5));
        //Civic.ecoEngine(8,3);


        //System.out.println("==============");


//    Honda m=new Honda();
//        System.out.println(m.toString());
//        System.out.println();

        /*
        If method has void return type then when calling that method from another class we need to create an object or can use Class name depending on
        weather its a static or non static. Furthermore, to print out the method that we are calling I will need to use a sout.
        If there is a return then i need to use sout. if there is a sout in the method i do not need to use sout in the runner class, cuz sout already printable.
        Method needs to give a function so no need sout in method.


super() method can only be used in that class, the child class, to call for a parent class. if its private we still cant access it using super().

         */

        System.out.println("the result of my calculation is "+m());
    }

    public static int m(){
        //Civic c=new Civic();
        int d= day20accessmodifiersinheritance.Civic.ecoEngine(3,5);
        System.out.println("my variable in Civic class is "+ day20accessmodifiersinheritance.Civic.var1);
        day20accessmodifiersinheritance.Civic.var1=12;
        System.out.println("my variable in Civic class is "+ Civic.var1);

        System.out.println("my calculation is "+met(4,5));
        met(1,2);

        System.out.println(3*met(1,2));//if we call civic constructor it will not call honda or accord cuz its the child.
        //if u do super() you can call parents with it.
        return d;
    }

    public static int met(int q,int t){
       int w=q*t;
       return w;
    }

    Civic d=new Civic(2021);
    //super() can be used with parameters as well. Like super(true), super(Hybrid), super(2021)
    //when a class has multiple constructors to select the constructor we need, we use super() with parameters.

}
