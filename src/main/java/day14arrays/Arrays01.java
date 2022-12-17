package day14arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
when we create byte, short, int , long , float, double, char, String, boolean containers we can store just a single value in them.
Sometimes we need to store multiple values in a single container.
to be able to store multiple values java created a new structure, its name is array.

NOTE: Arrays is to store multiple data in single data type.
you cannot store different data types in an array.
arrays use index for elements. so index 0,1,2, and so forth. So the characters use index.
 */
public class Arrays01 {
    public static void main(String[] args) {
        String str="Tom";//String can have just a single value. Boolean has single value, same for short, byte, int, long, float, etc
        //sometimes we want to store more data. To do this we use ARRAY


        //how to create an array
        String names[]=new String[5];//makes five containers. every space has null, for default value String used null for empty space.


        //How to print an array
        System.out.println(Arrays.toString(names));//toString() is a method, and it prints the array.

        //jim,tom,mary, susan, mark. String name[]={"one","two","etc"};
    names[1]="Tom";
    names[4]="Mark";
    names[0]="jim";
    names[2]="mary";
    names[3]="Susan";
        System.out.println(Arrays.toString(names));
        //System.out.println(Arrays.toString(names));

        //how to print a specific element in an Array
        //I want susan
        System.out.println(names[3]);//Susan

        //create an integer array and print the sum of the first and last elements on the console
        int ages[]=new int[7];
        System.out.println(Arrays.toString(ages));//so to make an array we start with the data type first. so we do int ages[]=new int[5]; we put brackets after age
        //- then do = signs and add new. after we finish with the data type and put the number inside the brackets again to specify how many values we want  insdide the array.
         ages[0]=12;
        ages[1]=23;
        ages[2]=25;
        ages[3]=14;
        ages[4]=17;
        ages[5]=12;
        ages[6]=14;
        System.out.println(Arrays.toString(ages));//find the sum of 12 and 14

        int sum=ages[0]+ages[ages.length-1];// to get the last array do minus the last number
        System.out.println(sum);

        //create double array and find the sum of all elements in the array
        //1.2, 2.3 , 5.0, 4.51==>13.01

        double elements[]=new double[4];
        elements[0]=1.2;
        elements[1]=2.3;
        elements[2]=5.0;
        elements[3]=4.51;
        System.out.println(Arrays.toString(elements));
        double sum1=0;
        for (int i=0; i<elements.length;i++){//in String we use length(), in Arrays we use length.

            sum1=sum1+elements[i];
            System.out.println(sum1);

        }

        //"FOR EACH" LOOP we will use this to solve the question
       double sum2=0;

        for(double w: elements){
            sum2=sum2+w;

        }
        System.out.println(sum2);

    }
}
