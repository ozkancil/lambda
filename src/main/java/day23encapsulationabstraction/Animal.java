package day23encapsulationabstraction;

public abstract class Animal {
    /*
    1) Sometimes no child uses the implementation from the parent class, therefore
    the body of the method in parent class is being unusable.
    If something is unusable we do not want to type it.
    If you do not type the body of a method, you will have "method without body"
    it is called "Abstract method" like angels.
            i. abstract method focuses on just what to do.

    2) Concrete methods-regular methods-methods with body. Tells us what to do and how
    to do.
    3)if you make a method abstract, it will be mandatory to override for all child
    classes. its like a to-do list.

4)Abstract methods can be created in just abstract class.
to make a class abstract put abstract between access modifier and class keyword.

5) when you remove method body you have to use abstract keyword between the access modifier and the return type of the method.

6) it is impossible to create objects from an abstract class. Abstract classes are no body so no object. Abstract class is not concrete.
Abstract classes still have constructors but they are not used for objects.

7) Abstract classes can have concrete methods as well.
8)Concrete methods may or may not be overridden by Child classes.
9)do not put abstract methods in a non-abstract class.
     */
    public abstract void eat();
    public abstract void drink();

    public abstract void walk();

    public abstract void jump();

    public abstract void getUp();


    public void talk(){
        System.out.println("not all animals talk");
    }





}











  abstract class  Mammal extends Animal{
/*
Normally child class must override all abstract methods from teh parent class, and normally it would complain but currently
its not complaining.
Because overriding abstract class from parent is mandatory only for concrete classes. mammal is abstract so for abstract classes its not mandatory.

if you want you can override abstract methods from parent animal to mammal, it is optional not mandatory.
 */

      @Override
      public void walk() {//overriding this abstract method from mammal is enough for Cat class not to complain because Cat class is not abstract so it must
          //override or else it will complain at least one child class of Animal class overrides, and Mammal class override the walk method.

      }
      public void talk(){
          System.out.println("animals talk");
      }

      @Override
      public void getUp() {

      }
  }