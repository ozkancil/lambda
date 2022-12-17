package practice.day11;

public class StringManipulation {
    public static void main(String[] args) {
        /*
        reverse this
        Tom Hanks
         */
//        String name="Tom Hanks";
//        String reverse="";
//        int idx=name.length()-1;
//
//    while(idx>-1){
//        reverse=reverse+name.charAt(idx);
//        idx--;
//
//    }
//    if (name.equals(reverse)){
//        System.out.println("pal");
//    }else {
//        System.out.println("not palin");
//    }
//        System.out.println("===============================");
//    for(int i=name.length()-1;i>-1;i--){
//        reverse=reverse+name.charAt(i);
//        if(name.equals(reverse)){
//            System.out.println("palin");
//            break;
//        }else{
//            System.out.println("not palin");
//            break;
//        }
//    }
//        System.out.println("===================================");
//        System.out.println("===================================");
//        System.out.println("===================================");
//
//        for(int i=name.length()-1;i>-1;i--){
//        reverse=reverse+name.charAt(i);
//
//    }
//        System.out.println(reverse);
        System.out.println("======================================");
        String name1="ana";
        int idx2=name1.length()-1;
        String rev="";

        while(idx2>-1){
            rev=rev+name1.charAt(idx2);
            idx2--;
        }
        if(name1.equals(rev)){
            System.out.println("palin===");
        }else{
            System.out.println("not palin===");
        }
        //System.out.println();


        String name="ana";
        String reverse="";
        for(int i=name.length()-1;i>-1;i--){// the reason we do i>-1 because we start from the last index which is the biggest so as we come down the first index is 0
            //so we do not want to make it less then 0 or it will say out of bound index.
            reverse=reverse+name.charAt(i);
        }
        if(name.equals(reverse)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }
}
