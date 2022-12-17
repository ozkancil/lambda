package day11constructorsmethodcallstatickeyword;

public class Runner1 {

    public static void main(String[] args) {
        Car1 bmw=new Car1("bmb","ttt",200,400000);
        System.out.println(bmw.make+bmw.model+bmw.price+bmw.year);
        //bmw.add(3,2);
        System.out.println(bmw.add(2,3,3));

    }
}
