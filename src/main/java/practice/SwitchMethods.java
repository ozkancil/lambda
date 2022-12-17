package practice;

public class SwitchMethods {


    public static void main(String[] args) {
        SwitchMethods.a('A');
        SwitchMethods.a('b');
        a('E');

    }

    public static void a(char letter) {
        switch(letter) {
        case 'A':
        case 'a':
            System.out.println(letter + " " + letter);
            break;
        case 'B':
        case 'b':
            System.out.println(letter + " " + letter);
            break;
        case 'C':
        case 'c':
            System.out.println(letter + " " + letter);
            break;
        case 'D':
        case 'd':
            System.out.println(letter + " " + letter);
            break;
        case 'E':
        case 'e':
            System.out.println(letter + " " + letter);
            break;
        case 'F':
        case 'f':
            System.out.println(letter + " " + letter);
            break;
        default:
            System.out.println(" only letters please");
            break;
    }
    //return letter;
}

}