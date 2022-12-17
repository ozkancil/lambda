package testmyself.inheritance;

public class Car extends Vehicle {
   int lightNum;
   int tires;
    public  void blueLights(int lightNum, int tires){
        System.out.println(super.lights="Green");
        System.out.println(super.wheels="Three wheels");

        this.lightNum=lightNum;
        this.tires=tires;
        System.out.println("This car has blue light, with "+lightNum+ " lights and "+ tires+ " tires.");
    }
    public  void getData(){
        vehicle("wheels", "lights");
        blueLights(2,4);

    }

}

class Vehicle{
    String wheels;
    String lights;
    public  void vehicle(String wheels, String lights){
        this.wheels=wheels;
        this.lights=lights;
        System.out.println("Vehicles have many "+ wheels+ " and different colored "+ lights);
        System.out.println("Vehicles can have different colors of lights and different amount of tires.");
    }


}
class Runner {
    public static void main(String[] args) {


        Car c = new Car();
        c.getData();

    }
}