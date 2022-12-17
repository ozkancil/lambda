package day20accessmodifiersinheritance;

public class AnimalRunner {
    public static void main(String[] args) {
        /*
        in java every class has a parent class its name is object class.
        Object class is the parent of every class. no need to extend. automatically it's the parent class.
        java puts default constructors behind class all comes from Object class.
         Object class is like adam. we all have a DNA of him.
         */

        //here all methods from animals is available also because we made it extends to animal class.
        Cat c=new Cat();
        //here we used object to call methods.
        c.eat();
        c.drink();
        c.meow();

        //here we made an object
        Dog d=new Dog();
        //here we are calling methods also for dogs.
        d.eat();
        d.bark();
        d.drink();

        //we used object to call methods
        Bird b=new Bird();
        //here we are calling methods
        b.eat();
        b.drink();
        b.tweet();

        Animal a=new Animal();//from the animal constructor we cannot call child. only from child we can call parents.
        a.drink();
        a.eat();
        //as you can see we cant bring bark, tweet or meow.
    }
    /*
    Object is the class name, not obj that we use to call.
    1: We use "inheritance";
      i)to prevent "repetition"
      ii)to make "maintenance" easy
      iii) to make our classes "atomic"
    2:To make a class child of another class we use "extends" keyword
    3:Child classes can use class members from the parent classes
      i) However, parent classes cannot use anything from the child classes.
      ii) Reason for this is if animal class meows, barks, and if a snake chirps, or a cow barks its really weird.
    4:Every class in java has at least one parent class which is "Object Class", except object class.
    5: inheritance types in java
      i)Multilevel inheritance
      ii)Hierarchical Inheritance
      iii)Multiple inheritance(java doesnt support it)
          a. Ali has Mother and Father. Java doesnt support inheritance more than one inheritance Ali
          b. This is because if both parents tell Ali to eat this and that they will get confused. So it only allows one Inheritance (parent)
          c. You can put parent, grandparent, grand grandparent but not two parents.
          d.Java supports single inheritance

     */
}
