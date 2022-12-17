import java.util.Scanner;

public class NextLineTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name=input.next();//if we put nextLine() it takes both last and first name
        //if we put only next() it only takes the first part of the name
        System.out.println(name);
    }
}
