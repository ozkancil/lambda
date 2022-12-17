package testmyself.thisinvokingamethod;

public class A {
    public void engine(){
        System.out.println("Engine Types are");

    }
    A(){

    }
    A(String engineType){
        System.out.println(engineType);
    }
    A(int engineSize){
        this("mercedes");
        this.engine();
        System.out.println(engineSize);
    }
    A(String engineMake, int enginePrice){
        this(600);
        System.out.println(engineMake+" "+enginePrice);
    }

}
class B{
    public static void main(String[] args) {
        A a=new A("BMW", 500);



    }
}