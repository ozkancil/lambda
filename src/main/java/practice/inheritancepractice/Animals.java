package practice.inheritancepractice;

public class Animals {
    public static void main(String[] args) {
        Bird b=new Bird();// im initiating a new instance of Bird because I wrote new.
       // System.out.println(b.bird());// I cant do this because i am calling a non static void bird() method to a static main method. I have to do static for the
        //bird() method as well.
b.bird();
Bird.birds();
        System.out.println(Bird.add);
        Bird.add++;
        Bird.add++;
        for (int i=0;i<6;i++){
            Bird.add++;
        }
        System.out.println(Bird.add);
        System.out.println("============================================");
        //Bird.add+3; cant do this
        System.out.println(Bird.add);
        System.out.println(Bird.add+3);//we can do this thoug.

        System.out.println("================================");
Cat c=new Cat();
        System.out.println("================================");

c.cat();
        System.out.println("================================");

Cat.cat();
        System.out.println("================================");


Mouse.mouse();
    }
}
