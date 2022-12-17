package practice.day23Polymorphism;

public class Q03_RunnerForCalculationOfVolume {
    public static void main(String[] args) {
        CalculateCube obj=new CalculateCube();//in every object we need a constructor
        System.out.println(obj.volumeOfCube(12));
        System.out.println(obj.volumeOfSquarePrism(12,1.85));
        System.out.println(obj.volumeOfRectangularPrism(15,7.52,4.45));

    }

}
