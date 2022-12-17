package practice;

public class Q03_IfStatement03 {
    public static void main(String[] args) {
        System.out.println(5<4);
        System.out.println(5>4);
        System.out.println(5>4 || 4>5);
        System.out.println(5>4 && 4>5);
        System.out.println(5<4 || 3+4==7);
        System.out.println(5<4 && 3+4==7);//&& is pessimistic it needs both to be true to be happy. || is optimistic it needs one to be true to be happy
        //System.out.println();
        //i want to buy a pc
        //i have cash and credit card
        boolean cash=false;
        boolean creditCard=false;
        if(cash || creditCard){      //so one | means that it checks both sides. if its || it only checks one, the first one and doesnt check the other.
            System.out.println("I can buy a computer");
        }else{
            System.out.println(" I cannot but a pc");
        }
    boolean havingPc=true;
        boolean watchingVideos=false;
        if(havingPc && watchingVideos){
            System.out.println("I can learn java");
        }else{
            System.out.println(" I cannot learn java");
        }

    }
}
