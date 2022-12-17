package day20accessmodifiersinheritance;

public class CarRunner {
    public static void main(String[] args) {
       Civic c=new Civic();//this is not the default constructor. its the one we created inside the Civic class.
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

         */

        System.out.println("the result of my calculation is "+m());
    }

    public static int m(){
        //Civic c=new Civic();
        int d=Civic.ecoEngine(3,5);
        System.out.println("my variable in Civic class is "+Civic.var1);
        Civic.var1=12;
        System.out.println("my variable in Civic class is "+Civic.var1);

        System.out.println("my calculation is "+met(4,5));
        met(1,2);

        System.out.println(3*met(1,2));
        return d;
    }

    public static int met(int q,int t){
       int w=q*t;
       return w;
    }
}
