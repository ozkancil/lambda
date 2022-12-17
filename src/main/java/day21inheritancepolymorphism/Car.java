package day21inheritancepolymorphism;

public class Car {
    /*
    so it goes from top to bottom in inheritance. so from parent to child. grandparent, parent, childs.
    Methods already have there own constructors so its there as a default.

    if you have three methods and all those methods all have a bark variable but you want to call a specific bark from one class, then use the object class, even in the
    same class if you want to call your own bark variable then you can do object of that class to call it.

    Note: with the same method and constructor for that method if you call a dog.feed but your method does not contain feed, because its a child it will go to parents
    and call for the feed. if parent doesnt have feed it can extend to the grandparents for the feed.
    these are the rules for the inheritance.
    (however for parents they do not call child, child calls parents.)


    Our classes are --> Dog, Mammal, Animal
    If i put a constructor insdie Dog class for Mammal object and I call bark from mammal like Mammal m=new Mammal(); and if Mammal does not have bark it will give
    "Compile Time Error in System.our.println(dog.bark).
    Data type cannot be selected from the child. What does that mean?
    Sub class and child class means the same thing.


    Becareful with ex:  B b=new C();
                         b.m();--> its calling method at class C because the contstructor is C(); not B(), so method from class C.
                         sout(b.x) this calls the variable from Class B, cuz its not a constructor at the end of x. its not x(); , its just x.
     */
   void engine(){
       System.out.println("All cars have engines");


   }
   public Car(){

       System.out.println("Car class constructor");
   }

   public Car(String engineType){
super();
       System.out.println(engineType);
   }
}
