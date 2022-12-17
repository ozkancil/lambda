package practice.interfaces;

public class Runner {
    public static void main(String[] args) {
        int y=9;
        M i=new M();
        System.out.println(i.mA());
        System.out.println(i.mB());
        System.out.println(i.y);
        //System.out.println(L.y);
        System.out.println(y);

        //see if ali can has space or not.alican " ali can "    "alican "
        Space ali=new Space();
        int can= ali.aliCan.trim().length();
        int Can=ali.aliCan.replaceAll("\\s","").length();

        //boolean isFalse=can-Can==1;
        int minus=can-Can;
        System.out.println(minus);
    }
}
