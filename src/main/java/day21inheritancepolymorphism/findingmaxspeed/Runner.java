package day21inheritancepolymorphism.findingmaxspeed;

public class Runner {

    public static void main(String[] args) {
        Car c=new Car(400,"HOnda","BMW");
        System.out.println(c.model+" "+c.make);
        System.out.println();
        System.out.println(c.maxSpeed1);
        c.add(300);
        System.out.println(c.maxSpeed1);

        c.eat();
    }

}
