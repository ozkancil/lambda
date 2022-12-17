package day21inheritancepolymorphism;



public class Honda extends Car {
    void honda(){

        System.out.println("This car was made in honda factory");
    }
    public Honda(boolean isNew){
        super("Hybrid");
        if (isNew){
            System.out.println("Brand new");
        }else{
            System.out.println("used");
        }
    }
    public Honda(){

        System.out.println("HOnda class constructor");
    }
}
