package day21inheritancepolymorphism.Cars;

public class Runner {
    public static void main(String[] args) {


        Car c = new Car(300);
        System.out.println(c.maxSpeed);
        System.out.println(Car.maxSpeed);
       c.cars();//when this prints out it does not print vehicle() only cars method. after i use super() method it will call both methods.
        System.out.println(Car.maxSpeed);
        System.out.println(c.maxSpeed);

        // c.vehicle();//because it extends to Vehicle class i can call vehicle() method




    }

}
