package testmyself;

public class InvokingMethodsWithThis {

    void m(int x){
        System.out.println("method m");
        System.out.println(x);
    }
    void n(){
        System.out.println("method n");
        this.m(3);
    }

}
class Exe{
    public static void main(String[] args) {


    InvokingMethodsWithThis t=new InvokingMethodsWithThis();
    t.n();
}}