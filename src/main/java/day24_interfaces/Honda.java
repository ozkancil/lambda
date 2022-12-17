package day24_interfaces;

public class Honda implements Ac, Brake, Engine{

    public static void main(String[] args) {
        System.out.println(Engine.price);// a single variable with a single variable name we can use only the name.
        //with many variables with same names we need to call the interface.price.
        System.out.println(color);
        System.out.println(color1);
        System.out.println(Engine.l);
    }
    @Override
    public void digital() {
        System.out.println("this is digital AC");
    }
    @Override
    public void secureBrake(){
        System.out.println("This is secure Brake");
    }
    @Override
    public void ecoEngine(){
        System.out.println("This is eco Engine method");
    }

    @Override
    public void price() {
        System.out.println("AC price");//now u can chose which price to calculate.

    }
//    @Override
//    public void name(){
//        System.out.println("ozkan name");
//    }

    @Override
    public void add() {

    }
    @Override
    public void cost(){

    }
}
