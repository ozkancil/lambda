package testmyself;

import java.util.Scanner;

public class Module {
    public static void main(String[] args) {
        /*Ask user to enter two integer values, the first will be greater than the second.
        The "remainder" when you divide the first by the second will be the "width",
        and the "sum" of the two numbers will be the length of a rectangle.
        Then calculate the "are" and the "perimeter" of the rectangle, and print them on the console
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number that is greater than the second number");
        Double divide = scanner.nextDouble();

        System.out.println("Enter second number that is less than the first number");
        double divide2 = scanner.nextDouble();

        double result = divide / divide2;

        System.out.println("The width is: " + result);

        double sum = divide + divide2;
        System.out.println("the sum of 2 number is: " + sum);

        int n=4;
        int c=3;
        System.out.println(3%4+"iiii");
    }
}
