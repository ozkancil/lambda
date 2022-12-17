package day21test;

public class Civic extends Honda {
    public static int speed = 100;
    Civic(int speed, String yes) {
        super.method();
        super.carMethod();
        System.out.println(super.speed);   //the reason i can call speed here is cuz its under Construtor and I made it this.speed=speed;
        System.out.println("Civic class constructor");
    }
    Civic(int year) {
        super(true);
        System.out.println(year);
    }
    public static void main(String[] args) {
        Civic civic = new Civic(689,"What is happening");
        System.out.println(Civic.speed);//I use Civic.speed because speed is part of the class. it is not under a constructor or method.
        //civic.method();//by callling method i called speed from the other class.
        //if we see civic.speed; with no parantesis then we know its a local variable. But if the local variable was not htere
        //it can still call the variable from parent cuz its extends.
        //System.out.println(Civic.speed);
        System.out.println(civic.speed);
        //Civic.speed; not allowed
        civic.method();

        System.out.println("=====================");
        Car car=new Car();
        car.method();
    }
}