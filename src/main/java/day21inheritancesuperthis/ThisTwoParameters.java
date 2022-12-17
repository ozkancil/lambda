package day21inheritancesuperthis;

public class ThisTwoParameters {
    String name;
    char size;

    public void setDrink(String name, char size){
        this.name=name;
        this.size=size;
    }

    public static void main(String[] args) {
        ThisTwoParameters t=new ThisTwoParameters();
        t.setDrink("Baba tea",'L');
        System.out.println(t.name+". The size is "+t.size);

    }
}
