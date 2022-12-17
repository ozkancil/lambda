package day21inheritancesuperthis;

public class Test1 {


    Test1 (){
        System.out.println("this is the parent constructor");
    }
       static String token="my token in the parent class";

    public void method (){
        System.out.println("this is the method in the parent class");
    }
}




class Child extends Test1 {

    Child(){
       // super();
    }

      String token="my token in the child class";

      void m(){
          super.method();
          System.out.println(this.token);
          System.out.println(super.token);



      }
    public void method (){
          super.method();
        System.out.println("this is the method in the child class");
    }
}

class execution {

    public static void main(String[] args){
        Child child=new Child();

        child.m();
        child.method();


    }
}