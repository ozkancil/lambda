package day11constructorsmethodcallstatickeyword;

public class DoWhileValueOf {
    public static void main(String[] args) {
        double num=75.3284;
        String string=String.valueOf(num);
        String split=string.split("\\.")[1];
        String add="";
        int idx=0;

        do{
            char c=split.charAt(idx);
            add=add+c+"*";
            idx++;
        }while(idx<split.length());
        System.out.println(add);

    }
}
