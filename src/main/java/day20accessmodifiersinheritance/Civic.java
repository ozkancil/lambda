package day20accessmodifiersinheritance;

public class Civic extends Honda{
  public static int ecoEngine(int b,int a ){
       System.out.println("civic uses ecoEngine");
//return "This is civic ecoEngine";
      //System.out.println(a+b);
      return a+b;

    }
    public Civic(){

      System.out.println("Civic class constructor 1");
    }

    public static int var1=10;

}
