package day14arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        //create an array with the user
        Scanner input=new Scanner(System.in);
        System.out.println("Enter amount of students there are");
        int studentNames=input.nextInt();

        String students[]=new String[studentNames];
        System.out.println(Arrays.toString(students));

        for(int i=0;i<studentNames;i++){
            System.out.println("Enter the student names");
            String stdNames=input.next();

          students[i]=stdNames;
        }
    /*
    Scanner ...
    int scan=input.nextLine();

    String stdName[]=new String[scan];

    for(int i=0;i<scan;i++){
    sout("Enter student names");
    String names=input.nextLine();
    stdname[i]=names;
    }

     */

    }
}
