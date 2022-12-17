package practice.day23Polymorphism;

public class Q04_Bird extends Q04_Animal{
    public void tweet(){
        System.out.println("Birds chirp");

    }

    @Override
    public void weight() {
        System.out.println("Birds are very light Animals");
    }
}
