package testmyself;

import java.util.Scanner;

public class Counter03 {
    public static void main(String[] args) {
        //enter a password and if its wrong 3 times then make it locked out
        Scanner input=new Scanner(System.in);
int counter=0;
        do{

            if(counter==3){
                System.out.println("locked out");
                break;
            }
            System.out.println("Enter username");
            String username=input.next();
            System.out.println("Enter password ");
            String password=input.next();
            counter++;
            if(username.equals("admin")&&password.equals("123")) {
                System.out.println("correct");

                break;
            }else {
                System.out.println("invalid");
            }
        }while(true);
    }
}
