package day21inheritancepolymorphism.Cars;


public class Car extends Vehicle {
public static int maxSpeed=600;
    public void cars(){
        super.vehicle();
       this.maxSpeed=400;
        System.out.println("This is the car method.");
    }
Car(){

}
Car(int maxSpeed){
        super.vehicle();
       this.maxSpeed=maxSpeed;


}

}
