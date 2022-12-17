package testmyself;

import java.util.Scanner;

public class ScanLengthInputAmount {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number, amount, sum=0;
        System.out.println("Input number for the amount of loop");
        number=scan.nextInt();

        for (int i=0;i<number;i++){
            System.out.println("Enter number "+number+" times.");
            amount=scan.nextInt();
            sum=sum+amount;
        }
        System.out.println(sum);

    }
}
