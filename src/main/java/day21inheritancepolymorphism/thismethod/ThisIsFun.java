package day21inheritancepolymorphism.thismethod;

public class ThisIsFun {
    int a;//or i can rename it like int c
    int b;//int d

    public void setData(int a, int b){
        /*
        this.c=a;
        this.d=b;
         */
        this.a=a;//even though we set these data to 4 and 3 we get zero when we print it
       this.b=b;
    }
    public static void main(String [] args){

        ThisIsFun t=new ThisIsFun();
        /*
        sout(t.c);
        sout(t.d);
         */
        t.setData(4,3);
        System.out.println(t.a);
        System.out.println(t.b);

    }
}
