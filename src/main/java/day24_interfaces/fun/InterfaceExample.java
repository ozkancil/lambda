package day24_interfaces.fun;

public class InterfaceExample implements  WaterBottleInterface{
    public static void main(String[] args) {
        System.out.println(color);
        InterfaceExample i=new InterfaceExample();
i.fillUp();
        System.out.println(WaterBottleInterface.color);
    }
    @Override
   public void fillUp(){
        System.out.println("It is filled");
    }
    @Override
    public void pourOut(){
        System.out.println("Pour it all out");
    }
}




interface WaterBottleInterface{
    //Atributes are done with String
    String color="Blue";

    void fillUp();
void pourOut();
}