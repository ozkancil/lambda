package day22inheritancepolymorphism;

public class Cat extends Mammal{
    public String name="Cat";

public Cat(){
    System.out.println(super.name);
    System.out.println(this.name);


}

//Overriding method
    @Override
    public void eat() {
        //super.eat();
        System.out.println("Cats eat...");
    }

//    @Override
//    public Mammal create() {
//        return new Mammal();
//    }

    @Override
    public Integer add() {
        return 23;
    }

    @Override
    public int multiply() {
        return super.multiply();
    }


}
