package testmyself.inheritance;

public class Test01 extends A{
    String d;
   Test01(int a, int b, String c, String d){
       super(a,b,c);
       this.d=d;
       A abc=new A(2,3," equals 5 for super class A."+" child class has "+ d);


    }
    public void getData(){

    }

    @Override
    public void makeNoise() {
       // super.makeNoise();
        System.out.println("Make noise has been overridden ");
    }
}


class A{
    int a,b;
    String c;
    A(){

    }

    A(int a, int b, String c){
        this.a=a;
        this.b=b;
        this.c=c;

        System.out.println("Class A has these in it: "+a+ b+c);
    }
   public void makeNoise(){
       System.out.println("make noise");
   }

}



class R{
    public static void main(String[] args) {
        Test01 t = new Test01(1, 2, " super and ", " child class are all working");
        t.makeNoise();
    }
}
