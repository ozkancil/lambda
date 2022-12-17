package day21inheritancesuperthis;

public class SetGetTwoParameters {
    String name;
    char size;

    public void setName(String name, char size){
        this.name=name;
        this.size=size;
    }
    public String getName(){
        return name;
    }
    public char getName1(){
        return size;
    }

    public static void main(String[] args) {


    SetGetTwoParameters t=new SetGetTwoParameters();
    t.setName("Mango Tea", 'L');
        System.out.println(t.getName());
        System.out.println( t.getName1());















    }}
