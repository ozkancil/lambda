package practice.day23Polymorphism;

public class Q03_CalculateVolumeOfCube {
    public static void main(String[] args) {


        String name = "ozkan";//a121 c121 a==c true
        for (int i = name.length()-1; i > -1;i--){
            System.out.println(name.charAt(i));
        }
/*
charAt()--> i character a b c
array we cant do == .equal
if(      == arr[arr.length-1-i
 */
    }

}
class CalculateCube{
    public static double volumeOfCube(double a){//a*a*a gives you the required outcome. only one edge length is enough to calculate.
        return a*a*a;

     }
     public static double volumeOfSquarePrism(double a, double b){
        return a*a*b;
     }

     public static double volumeOfRectangularPrism(double a, double b, double c){

        return a*b*c;


     }
     public static double totalPrice(double a, double...price){
        return a;
     }
}