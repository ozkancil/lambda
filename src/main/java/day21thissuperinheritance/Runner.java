package day21thissuperinheritance;

public class Runner {
    public static void main(String[] args) {


        Name n = new Name();
        n.setName("Elif",'L');
        System.out.println(n.getName());
        System.out.println( n.getLastInitial());
    }
}