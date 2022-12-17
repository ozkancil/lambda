package day08stringmanipulatoinloops;

public class Test {
    public static void main(String[] args) {
        String x="Hello";

        for(int i=0;i<x.length();i++){
            if(x.indexOf(x.charAt(i))==x.lastIndexOf(x.charAt(i))){
                System.out.println(x.charAt(i));
            }
        }
    }
}
