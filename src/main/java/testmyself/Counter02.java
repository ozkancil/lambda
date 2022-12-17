package testmyself;

import java.util.Scanner;

public class Counter02 {
    public static void main(String[] args) {
        /*
        create a user to enter username and password 3 times. after 3 times lock out.
         */
        Scanner scan=new Scanner(System.in);

        int counter=0;
        do{

            if(counter==3){
                System.out.println("You are locked out");
                break;
            }

            System.out.println("Enter username");
            String username=scan.next();
            System.out.println("Enter password");
            String password=scan.next();
            counter++;
            if(username.equals("admin")&&password.equals("123")){
                System.out.println("You are logged in");
                break;
            }else{
                System.out.println("Wrong credentials. ");
                if (counter!=3)
                    System.out.println("Enter again");
                if(counter==2)
                    System.out.println(" You have one try left.");
            }
        }while(true);

    }
}
