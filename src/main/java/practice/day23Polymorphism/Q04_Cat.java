package practice.day23Polymorphism;

import org.w3c.dom.ls.LSOutput;

public class Q04_Cat extends Q04_Animal{

    public void meow(){
        System.out.println("Cats meow...");
    }

    @Override
    public void eat() {

        System.out.println("Cats eat meat");
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void weight() {
        super.weight();
    }

    @Override
    public void consume() {
        super.consume();
    }
}
