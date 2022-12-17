package day12variabletypesstaticblockarrays;

public class VariableTypes01 {
   //name is nonStatic. or object or instance value
   public String name="Tom Hanks";//this is a instance variable.
   public String name1;
//x=2; local variables are only used inside the methods.
   //age is static, or class variable
   public static int age=13;
   //sout you cant do this without a method. some type of method . doesnt have to be main method

   //local variable

   public int add(int a, int b){//this is a method because it has ()
      //so if it is a method and there is a return type other than void use return;
      int x=12;//local variable. it is created inside a method, so it's called a local variable.

      System.out.println(name);
      return a+b;
      //Nothing can come after return;
      //System.out.println(name); nothing comes after return. this is a unreachable statement. it cannot be reached after return.
      //this is an error. gives error everytime.

   }

   public int multiply(int c, int d){
      int x=12;// we created a local variable inside the multiply method. This local variable can only be used inside the method.
      //what are the characteristics of a local variable? u do not need to give any value to a variable
      //if u try to print it, it will complain because it has nothing assigned to it.
      int n;
      //if u try to use a local variable without assigning a value it complains



      return c*d;
//static variable
      //non-static variable
      //local variables. 1) it needs to be initialized meaning it needs a value. 2) WE can use it just inside the method.


   }
}
