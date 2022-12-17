package practice.day23Polymorphism;

public class Q01_SumOfFirstintegerWithNumbers {
    /*
    create a method that adds given integers except the first one and multiplies the sum by the first
    integer.
    a*(b+c+d+f)
     */
    public static void main(String[] args) {
        myMethod(7,4,6,-7,100);
        myMethod(0,1,2,3);
        myMethod(-1,5,7,89);
        myMethod(2.2,123,23,21,1,1);
        myMethod(3.2,2.3,5.4,6.7,2.3);
    }
    public static void myMethod(int a, int...numbers){
        int sum=0;
        for(int w:numbers){
            sum+=w;// different way of typing sum=sum+w; sum will be increased by w value
        }
        System.out.println(a*sum);

    }
    public static void myMethod(double a, int...numbers){
        double sum=0;
        for(int w:numbers){
            sum+=w;// different way of typing sum=sum+w; sum will be increased by w value
        }
        System.out.println(a*sum);
    }
    public static void myMethod(double a, double...numbers){
        double sum=0;
        for(double w:numbers){
            sum+=w;// different way of typing sum=sum+w; sum will be increased by w value
        }
        System.out.println(a*sum);

    }
}
