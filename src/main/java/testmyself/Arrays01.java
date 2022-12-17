package testmyself;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    /*
    to start off an array array take in many containments. it is a container
     */
    public static void main(String[] args) {
        //to create an array we must use the []
        String name[]=new String[5];
        name[0]="Pizza";
        name[1]="White chocolate reeses";
        name[2]="Singing";
        name[3]="Vildan";
        name[4]="Purple";
       // name[5]="philly";
        //name[6]="ozkan";
        System.out.println(Arrays.toString(name));

        String names[]={"Pizza","White chocolate reeses","singing","Vildan","purple"};
        System.out.println(Arrays.toString(names));

//
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the amount of container you would like for the Array");
//        int designate=input.nextInt();
//
//        String student[]=new String[designate];
//        for (int i=0;i<designate;i++){
//            System.out.println("Enter student names");
//            String studentNames=input.nextLine();
//            student[i]=studentNames;
//
//        }
//        System.out.println(student);
        System.out.println("====This is for each loop====");
        //for each loops
        for(String w:name){//for the for each loop we do not use length
            System.out.println(w);
        }

        //create a String Array and print the elements whose length is less than 5
        //this is the short way to create and add elements to add into the Array
        String names1[]= {"Yavuz","Hasan","ozkan","cil","ari","Last"};
        for(String w:names1){
            if(w.length()<5){//strings we do use length(). integers we do length
                System.out.println(w);
            }
        }
        System.out.println("====Tom======");
        //create a string array and print the elements before Tom
        String names2[]= {"Yavuz","Hasan","ozkan","Tom","cil","ari","Last"};
        System.out.println(Arrays.toString(names2));
        for(int i=0;i<names2.length;i++){
            if(names2[i].equals("Tom")){
                break;
            }
            System.out.println(Arrays.toString(names2));


        }
        String names3[]= {"Yavuz","Hasan","ozkan","Tom","cil","ari","Last"};
        for(String w:names3){
            if(w.equals("Tom")){

                break;
            }
            System.out.println(w);
        }
        System.out.println("===========Everything but TOM===========");
        //example4: create a string Array and print the elements different from tom
        String names4[]= {"Yavuz","Hasan","ozkan","Tom","cil","ari","Last"};

        for(String w:names4){
            if(!w.equals("Tom")){
                System.out.println(w);
//continue;
                break;
            }

        }
        System.out.println("===========Everything but TOM 5===========");
        //example4: create a string Array and print the elements different from tom
        String names5[]= {"Yavuz","Hasan","ozkan","Tom","cil","ari","Last"};

        for (String w:names5){
            if (w.equals("Tom")){
continue;
                //break;
            } System.out.println(w);
        }
    }
}
