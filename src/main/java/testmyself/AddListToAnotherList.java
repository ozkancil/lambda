package testmyself;

import java.util.ArrayList;
import java.util.List;

public class AddListToAnotherList {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(2);
        a.add(1);

        List<Integer>b=new ArrayList<>();
//        for(Integer w:a){
//            if(b.contains(w)){
//                break;
//            }
//            b.add(w);
//        }
//        System.out.println(b);

        for(Integer w:a){
            if(!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);


    }

}
