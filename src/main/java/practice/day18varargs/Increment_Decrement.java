package practice.day18varargs;

public class Increment_Decrement {
    public static void main(String[] args) {
        int a=12;
        a++;//13

        int b=a   ++;//java reads left to right. so b is 12 and a is 13
        System.out.println(a);
        System.out.println(b);

        int x=15;
        int y=x--;//x=14   y=15

        //pre-increment
        int m=21;

        int n=++m;// here java goes from left to right, so it cant add ++ to n directly, so it does
        //addition first then adds to both.




    }
}
