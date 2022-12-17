package day11constructorsmethodcallstatickeyword;

public class Car1 {

    String model="Corolla";
    String make="Toyota";
    int price=20000;
    int year=1994;

    public Car1(){
this.price=price;


    }
    public Car1(String model,String make,int price,int year){
        this.model=model;
        this.make=make;
        this.year=year;
        this.price=price;
    }

    public  Car1(String make){
        this.make=make;

    }
    public int add(int a,int b,int price){
        this.price=price;

        return a+b;

    }


}
