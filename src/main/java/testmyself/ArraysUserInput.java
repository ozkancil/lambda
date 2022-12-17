package testmyself;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUserInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the amount of students you would like");
        int numberOfStudents=scan.nextInt();

        String[] containerForStudents=new String[numberOfStudents];

        for(int i=0;i<numberOfStudents;i++){
            System.out.println("Enter the name of the students");
            String nameOfStudents=scan.next();
            containerForStudents[i]=nameOfStudents;
        }
        System.out.println(Arrays.toString(containerForStudents));

    }
}
