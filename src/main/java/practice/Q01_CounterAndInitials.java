package practice;

import java.util.Scanner;

public class Q01_CounterAndInitials {
    public static void main(String[] args) {
        /*
        type ocde to reverse a string
        tom hanks==> sknaH mot
         */
//        String str="Tom Hanks";
//        String reverse="";//emtpy container because we want to put everyhting in there.
////int i=str.length()-1;i>=0;i--
//        //str.charAt(i);
//        for(int i=str.length()-1; i>=0;i--){
//            reverse= reverse+str.charAt(i);
//            //System.out.println(reverse);
//        }
//        System.out.println(reverse);
//
//
//        //get hte initial from the full name
//        //tom hank==>TH
//        String fullName=" Tom Hank ";
//        //trim() method removes the spaces from beginning and the end
//        //substring() method is used to get a specific part of a string.
//        //starting index is inclusive, ending index is exclusive3
//        //
//        String initialFirstName=fullName.trim().substring(0,1).toUpperCase();
//        String lastName=fullName.trim().split(" ")[1].substring(0,1).toUpperCase();
//        System.out.println("Initial for first name "+initialFirstName+". Initial for last name is "+lastName);



        /*
        Reverse Tom Hanks
         */

        String name="Tom Hanks";
        String reverse1="";
        for(int i=name.length()-1;i>=0;i--){
            reverse1=reverse1+name.charAt(i);

        }
        System.out.println(reverse1);

        /*
        get initails of names
         */
        String fullName="     Ozkan Cil    ";
        String firstInitial=fullName.trim().substring(0,1).toUpperCase();
        String lastinitial=fullName.trim().split(" ")[1].substring(0,1).toUpperCase();
        System.out.println("First initial is--> "+firstInitial+". Second initial is-->"+lastinitial);


        /*
        username "admin" , pass"pwd123"
        ask user to enter username and pass.
        if it is correct user should see " You are in your account"
        else should see "enter your username and password" message 3 times.
        after third time it should say "your account is blocked"
         */
//the reason we use a do while for the password java is because the do while will at least ask the questions at least once and print it out at least once.
        //so if there is anything that needs to be printed out at least once then use this.
        Scanner input=new Scanner(System.in);
        int counter=0;

        do{
            if(counter==3){//so as long as if() condition isn't true then it will run the next if.
                System.out.println("Your account is blocked");
                break;
            }
            System.out.println("Enter your user name");
            String userName=input.next();

            System.out.println("Enter your password");
            String password=input.next();

            counter++;

            if(userName.equals("admin") && password.equals("pwd123")){
                System.out.println("You are in your account");
                break;
            }
        }while (true);
    }
}
