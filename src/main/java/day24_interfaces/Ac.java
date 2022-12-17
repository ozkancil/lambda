package day24_interfaces;
/*
  1) an interface cannot have concrete method? YES it can but needs static or default value before it.
  All methods in a interface should be abstract.
  2) All methods in an interface are public and abstract.
   Because of that; even if you dont declare the methods public and abstract it will still be public and abstract.
   public abstract void digital(); and void digital(); are the same.

   3) if parent interfaces have methods with the same name, overriding just one of them will be enough.
   4)parent interfaces cannot have methods with the same name and different return types.
   If you do that, java will give you compile time error.
   5) variables in an interface are public. because child classes will use them. java made it public and static and final automatically
   6) when we are calling variables from interfaces we need to use the Interface name to call. Ex: Ac.price; Brake.price;   Engine.price.
   Cuz variables are static we can use class name to call variables instead of object.
   7) when ever you need to call any variable use interface name to call.
   8) Class parent of another class i use extends. So interface can be the parent of another interface.
   "Class" parent of another "Class"==>extends
   Interface parent of another interface==> extends
   interface parent of Class==>implements
   Class parent of Interface==> Impossible
   Interface can have just interface as parent.


   */
public interface Ac extends BigAc {
    String color="Blue";
    int color1=3;

    //public void digital(){//We cannot put body for the interface.
       // System.out.println("This is digital AC");
    //}



    public void digital();// u can put public or abstract or take both out. it will not complain.

    void price();
    void cost();

   // int make();
    public int price=2300;//if its finaal we have to initialize
   // price++; wont let us do nothing to it cuz in interface variables are static, public and final.

    String name="Perfect Ac";

    //To create concrete methods in an interface you have 2 options
    //i)use default keyword
    //ii)use static keyword.

    //i)use default keyword
public default int calculate() {
    return 1200;
}
    //ii)use static keyword.
public static boolean climate(){
    return true;
    }





}
