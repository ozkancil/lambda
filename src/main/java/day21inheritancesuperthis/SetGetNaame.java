package day21inheritancesuperthis;

public class SetGetNaame {
    String name;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        SetGetNaame d=new SetGetNaame();
        d.setName("Caliber");
System.out.println(d.getName());
    }
}
