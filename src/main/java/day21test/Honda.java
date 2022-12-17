package day21test;

public class Honda extends Car{
   public  int speed=134;
    Honda(){

        System.out.println("Honda class constructor");
    }
    public Honda(boolean isNew){
        super("hybrid");
        this.speed=speed;
if(isNew){
    System.out.println("Brand new");
}else{
    System.out.println("Not brand new");
}


    }
    public void method(){
//this.speed=speed;
        System.out.println(speed);
        System.out.println("this is the method for Honda. Its not a Constructor");
        String track="Island track";

    }

    public static void main(String[] args) {
    Civic a=new Civic(267,"yes");
    a.method();
        a.carMethod();
}}
