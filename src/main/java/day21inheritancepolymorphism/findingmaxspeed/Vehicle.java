package day21inheritancepolymorphism.findingmaxspeed;

public class Vehicle {
    int maxSpeed=500;
int make;
String model;
    Vehicle(){

    }
    Vehicle(int make,String model){
this.make=make;
this.model=model;


    }
    public void plus(){
        System.out.println("You have just called the plus method inside of a Vehicle class");


    }
    public void eat(){
        System.out.println("munch munch");
    }

}
