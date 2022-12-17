package testmyself;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        //create a counter that counts and stops when the user has entered 3 tries for the password and failed
        Scanner scan=new Scanner(System.in);


        int counter=0;

        do{
            System.out.println("enter your username");
            String username=scan.next();
            System.out.println("Enter your password");
            String password=scan.next();
            counter++;
            if (counter==3){
                System.out.println("You are locked out ");
                break;

            }
            if(username.equals("admin") && password.equals("123")){
                System.out.println("You are logged in");
                break;
            }else{
                System.out.println("wrong verifications");
            }
        }while(true);
        System.out.println();
    }
}
