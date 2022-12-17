package practice.day24_practice_session;

public class Q01_SumOfNumsTimeFirstNum {
    /*
    we can add different parameters and change the number of parameters.
     */

    public static void main(String[] args) {
        System.out.println(mult(7,1,2,3,43,5));
        System.out.println(myMethod(3,1.2,3,4,5,4));
    }
    public static int mult(int a, int ...b){
        int sum=0;
        for(int w:b){
            sum=sum+w;
        }
int total=sum*a;
        return total;//sum will be increased by "w"

    }
    public static double myMethod(double a, double...numbers){
        double sum=0;
        for(double w:numbers){
            sum=sum+w;
        }
        double total=sum*a;
        return total;//sum will be increased by "w"
    }
    public static double myMethod(int a, double...numbers){
        double sum=0;
        for(double w:numbers){
            sum=sum+w;
        }
        double total=sum*a;
        return total;//sum will be increased by "w"
    }
    public static double myMethod( double []a){
        double sum=0;
        for(double w:a){
            sum=sum+w;
        }
        double total=sum;
        return total;//sum will be increased by "w"
    }
}
