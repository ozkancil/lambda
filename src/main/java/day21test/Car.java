package day21test;

public class Car {
    Car(){
        System.out.println("Car class constructor");
    }
    Car(String engineType){
        System.out.println(engineType);

    }
    public void carMethod(){
        System.out.println("Car method");
    }
    public void method(){
        System.out.println("method() inside the Car");
    }
}
