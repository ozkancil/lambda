package practice.day07practice02;

import java.util.Scanner;

public class Q02 {
    /*
    user enter wight and height
    calculate body index of user
    to calcualte "bodymassidx=weight.squareofheight" formula
    1)body mass inx less than 18.5==> your are weak
    2)body massinx betwn 18.5-25=> your weight is ideal
    3) body massindex betwn 25-30==> you are fat
    4) bodymassindex greater than 30==>? obese
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your height");
        double height=input.nextDouble();
        double squareOfHeight=height*height;
        System.out.println("Enter your weight");
        double weight=input.nextDouble();
        double bodyMassIdx=weight/squareOfHeight;

//        if(bodyMassIdx<18.5 && bodyMassIdx>0){
//            System.out.println("you are weak");
//        }
       int max= Integer.MAX_VALUE;
        System.out.println(max);

        String nme="ozkan";
        String name="cil";
        System.out.println(nme.concat("live"));
        int a=2, b=3;
        String m=a+b<100? "True":"False";
        System.out.println(m);
       //return a+b<100 ? true:false;
        double d = 2.3;

//        if(d<0){
//            System.out.println("negative");
//        }
//        if(d>=0){
//            System.out.println("positive");
//        }
    }
}
