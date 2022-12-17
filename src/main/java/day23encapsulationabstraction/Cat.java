package day23encapsulationabstraction;

public  class Cat extends Mammal {

    public void meow(){
        System.out.println("Cats meow....");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat...");

    }
    @Override
    public void drink(){
        System.out.println("Cats drink...");
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void talk() {
        super.talk();
    }

    @Override
    public void jump() {

    }
}




class AnimalRunner{
    public static void main(String[] args) {
        Cat c=new Cat();
        c.drink();
        c.meow();
        c.eat();

       // Animal a=new Animal();we cant make object from abstract classes.
    }
}
