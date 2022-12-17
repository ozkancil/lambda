package day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {
      //  Cat c=new Cat();
       // System.out.println(c.name);

       // Mammal d=new Cat();
       // System.out.println(d.name);

        Animal a=new Cat();
        System.out.println(a.name);
        //has a relationship is from top to bottom(parent to child)
        //is a relationship is from bottom to top(child to parent)
        /*
        1) from parent to child is called has relationship
        2) from child to parent is called is a relationship
         */

        System.out.println("===============");
        Cat f=new Cat();// when calling constructors we just use constructors.
        f.eat();
        //if we do sout(super.name) we will see that java calls parent name. if we close mammal name it will go to Animal name.
        //If we close Animal name also, it will complain because super. looks for references from parents.
        //if no parent has the data(variable+methods) java gives compile time error
        //Super() must be the first statement in the constructor body. but just super. can be in anyline.
        //super() is for calling constructors from parent class, super. is for calling variables and methods from the parent class.
        //this is used to call data(variables+methods) from the class itself. when u use this. u are telling java do not go to parent. stay in this class.
        //this() we can call methods in side of other methods in same class. and we can call parameteres from methods in other methods.

        /*    METHOD OVERRIDING
        1. when the child classes use the methods from the parent classes. we may need to update the implementation of the methods.
        for ex: in animal class eat() tells "animals eat", but to tell "animals eat" in cat class is not good/
        to be able to create specific implementations for Cat class like "cats eat" we should update the method body.
        This is called "method Overriding"
        2. To do method overriding we need "inheritance" . if there is no inheritance there is no method overriding.
        3.When we use method overriding we do not touch the method signature. Method signature means= method name + parameters.
        4.@Override annotation checks the overriding rules when you do override.
        5. When we do @Override we cannot use narrower access modifiers in child class
        6. The method in parent class is called Overriden method. The method in child class is called Overriding method
        7. When we do method Override if the return type is void in overriden method return type of the overridding type must be void. We cannot use diff return types
        8. When you do method overriding, return type of the overriding method can be same or different in child.
        From child return type to parent return type you must have an "IS-A" Relationship.
        9. Between Wrapper classes java did not create "parent child " relationship. so there is no extend relationship. therefor between the wrapper classes there is no
        "Is-A" relationship. if there is no IS A relationship you cannot change the return types in method overriding.
        10. When you do Method Overriding if hte return type of the Overriding method is primitive
        you cannot change it in method overriding because primitve data types are not classes
        if they are not classes you cannot have IS- A relationship.
        11. if a method is final it means its body cannot be updated. we cannot Override the final method key word.
        12. Private methods cannot be overriden because to override a method we have to have access to it. private methods are not accessible from other
        classes.
        13. static methods cannot be overidden. cuz static things are common for all child classes. if any child class updates the static method body other child
        classes will be affected as well. therefor java doesnt let you to override a static method.

            Can we override static method?
No, a static method cannot be overridden. It can be proved by runtime polymorphism, so we will learn it later.

Why can we not override static method?
It is because the static method is bound with class whereas instance method is bound with an object. Static belongs to the class area, and an instance belongs to the heap area.

Can we override java main method?
No, because the main is a static method.
         */


    }
}
