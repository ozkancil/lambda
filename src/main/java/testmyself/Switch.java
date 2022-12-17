package testmyself;

public class Switch {
    public static void main(String[] args) {
        print('a');
        print('C');
        print('e');

    }

    public static void print(char ch){

        switch (ch){
            case 'A':
            case 'a':
                System.out.println("First Character");
                break;
            case 'B':
            case 'b':
                System.out.println("Second Character");
                break;
            case 'C':
            case 'c':
                System.out.println("Third Character");
                break;
            case 'D':
            case 'd':
                System.out.println("Fourth Character");
                break;
            default:
                System.out.println("Other Characters");
        }
}}
