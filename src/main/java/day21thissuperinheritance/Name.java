package day21thissuperinheritance;

public class Name {
    public String name;
public char lastInitial;
    public void setName(String name, char lastInitial){
        name=name;
        this.name=name;
        this.lastInitial=lastInitial;
        //this.name=name;
    }
    String getName(){
        return name;

    }
    char getLastInitial(){
        return lastInitial;
    }
   public static void lastName(String last){
        last=last;
       // return last;
    }

    public static void main(String[] args) {

//setName("cil");
lastName("cil");
    Name obj=new Name();
     //   System.out.println(obj.name);
    obj.setName("Ozkan",'C');
        System.out.println(obj.getName()+" "+obj.getLastInitial());
        System.out.println(obj.getName());
        System.out.println(obj.getLastInitial());







}}
