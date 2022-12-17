package testmyself;

public class SuperThisInheritance {
    int jumps;
    String howHigh;

    SuperThisInheritance(int jumps, String howHigh){
        this.jumps=jumps;
        this.howHigh=howHigh;

    }
    void getMethod(){
        System.out.println(jumps+" "+howHigh);
    }
}
class Ex {
    public static void main(String[] args) {


    SuperThisInheritance b=new SuperThisInheritance(5," 6 inches");
    SuperThisInheritance b1=new SuperThisInheritance(10," 2 inches");
  b.getMethod();
  b1.getMethod();
}}