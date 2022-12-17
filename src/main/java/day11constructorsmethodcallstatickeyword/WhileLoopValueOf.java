package day11constructorsmethodcallstatickeyword;

public class WhileLoopValueOf {
    public static void main(String[] args) {
double num=75.4328;
String string=String.valueOf(num);
String split=string.split("\\.")[1];
String add="";
int count=0;
int idx=split.length();

while(count<split.length()){
    char c=split.charAt(count);
    add=add+"*"+c;
    count++;
}
        System.out.println(add);

    }
}
