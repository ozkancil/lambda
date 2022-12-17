package day14arrays;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {
        //example: create a string Array and print the elements in alphabetical order on the console in different lines.
        String cities[]=new String[5];
        cities[0]="Tokyo";
        cities[1]="Berlin";
        cities[2]="Istanbul";
        cities[3]="jacksonville";
        cities[4]="Calgary";
        System.out.println(Arrays.toString(cities));
    //how to put elements in alphabetical order
        Arrays.sort(cities);//to sort alphabetical order we use sort methods. we make sort first the varaible then we use
        //-sout to run the array. this is only for arrays.
        System.out.println(Arrays.toString(cities));

        for(String w: cities){
            System.out.println(w);//we print w because w takes the cities.
        }


        //create a String Array and print the elements whose length is less than 5
        //this is the short way to create and add elements to add into the Array
        String names[]= {"Ali","Thomas","Mark","Jackson","Tom","Martin"};
        System.out.println(Arrays.toString(names));
        for(String w: names){
            if(w.length()<5){//i was right, i was right, i was right. for strings do length(), for integers do length no ()
                System.out.println(w);
            }

        }

        //create a string array and print the elements before Tom
        System.out.println("========================");
        String names1[]= {"Ali","Thomas","Mark","Jackson","Tom","Martin"};
        for(String w:names1){
            //if you want "tom" then do it inside here, so it prints tom as well but stops when it sees tom.
            if(w.equals("Tom")){
                break;
                //continue;
            }
                System.out.println(w);

        }
        System.out.println("==================");
        //example4: create a string Array and print the elements different from tom
        String students[]= {"Ali","Thomas","Mark","Jackson","Tom","Martin"};

        for(String w: students){
            if(w.equals("Tom")){
                continue;
            }
            System.out.println(w);
        }
    }
}
