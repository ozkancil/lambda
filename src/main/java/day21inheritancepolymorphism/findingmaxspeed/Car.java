package day21inheritancepolymorphism.findingmaxspeed;

public class Car extends Vehicle{

    int maxSpeed=100;
String carPreference;
int maxSpeed1=200;
    public void add(int maxSpeed1){
        System.out.println(super.maxSpeed);
        super.plus();
        this.maxSpeed1=maxSpeed1;
        System.out.println(maxSpeed);
//plus();
        eat();

    }

    Car() {

    }Car(int maxSpeed1){
        this.maxSpeed1=maxSpeed1;

    }
    Car(int make, String model, String carPreference){
        super(make,model);
        this.carPreference=carPreference;

    }

}
