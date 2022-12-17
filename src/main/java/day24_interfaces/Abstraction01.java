package day24_interfaces;

public abstract class Abstraction01 {
    /*
    final keyword is really important in java.
    1) "final" keywords can be used for variables
    public int age=12;
    If you make a variable final you cannot change its value.
    "final variables" must be initialized.

2) "final" keyword can be used for methods.
"final methods" body cannot be updated, so they cannot be overridden.

3)"final" keyword can be used for classes.
"final classes cannot have child classes.
NOTE: abstract classes have soemthign to do for child classes, if there is no child class, having to do list is not sensible.
final classes cannot have child classes, therefore java does not allow to make an abstract class final.

Note: final method body will be under protection by java, because it should not be updated.
but abstract methods dont have body. java will loook for the body in final methods to protect when it could not  find it will complain.

We cannot make abstract classes private.
     */

    //
 public int age;
 public final double pi=3.14;
 //pi++; it will complain because we put final; message; cannot assign a value to final
    //variables.

public abstract int add();
}
