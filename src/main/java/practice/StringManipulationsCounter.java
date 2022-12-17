package practice;

import java.util.Scanner;

public class StringManipulationsCounter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int counter=0;
        do{

            if(counter==3){
                System.out.println("You are locked out");
                break;
            }
            System.out.println("Enter username");
            String userName=input.next();
            System.out.println("Enter password");
            String password=input.next();

            if(userName.equals("admin") && password.equals("123")){
                System.out.println("You are logged into your account!");
                break;
            }else{
                System.out.println("Wrong credentials");

            }

            counter++;
        }while(true);
    }
}
