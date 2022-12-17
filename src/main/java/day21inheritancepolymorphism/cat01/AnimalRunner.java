package day21inheritancepolymorphism.cat01;

public class AnimalRunner {
    public static void main(String[] args) {


        Cat c = new Cat(2,"josh","chicken");
c.add(300);
        System.out.println(c.maxSpeed);

c.add(200);
        System.out.println(c.maxSpeed);

    }
}
