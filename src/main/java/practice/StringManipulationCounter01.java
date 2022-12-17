package practice;

import java.util.Scanner;


public class StringManipulationCounter01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
int counter=0;
        do{
            if(counter==3){
                System.out.println("You are locked out");
                break;
            }
            System.out.println("Enter username");
            String firstName=input.next();//username
            System.out.println("Enter password");
            String password=input.next();

            for(int i=0;i<password.length();i++)
            if(firstName.equals("admin")&&password.equals("123")){

                System.out.println("You are logged in!");
                break;

            }else{
                System.out.println("Incorrect credentials");

            }
counter++;//1+1+1=3
        }while(true);
    }
}
