package day33lambdafp;

import day32lambda.UtilsClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Lambda01_String {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Tom");
        list.add("Alley");
        list.add("Tom");
        list.add("Mark");
        list.add("Amanda");
        list.add("John");
        list.add("Jackson");
        list.add("Marry");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Ben");


        printInUpperCases01(list);
        printInUpperCase02(list);
        System.out.println("\n");
        printElementInReverseOrderByLength(list);
        System.out.println();
printDstnctElmtLastChar(list);
        System.out.println();
        sortAccordingToLengthLastChar(list);
        reverse(list);
        removeifStrtWIthAEndWithO01(list);
        removeifStrtWIthAEndWithO02(list);
        removeIfLengthIsBetweenFiveAndTenOrEndingWithO(list);
        System.out.println(checkLengthToBeLessThanTwelve(list));
        System.out.println(checkInitialNotToStartWithX(list));
        System.out.println(checkAnyEleEndingWithR(list));
    }
    //create a mthd to print all list elmnts in uppercase
    public static void printInUpperCases01(List<String>list){
        list.stream().map(String::toUpperCase).forEach(UtilsClass::printLine);
    }
    public static void printInUpperCase02(List<String>list){
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
    //create a method to print elemnts after ordrng accrdng to their lengths
    public static void printElmntSortedByLngth(List<String>lngth){
        lngth.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsClass::printLine);
    }
    public static void printElmntSortedByLngth01(List<String>lngth) {
lngth.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsClass::printLine);

    }
    //create a method to print the elements after ordering according to their lengths (in reverse order)
    public static void printElementInReverseOrderByLength(List<String>rverseLength){
        rverseLength.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(UtilsClass::printLine);
    }

//create a method to sort disctnt elemtns by using their last characters.
    public static void printDstnctElmtLastChar(List<String>lst){
        lst.stream().distinct().sorted(Comparator.comparing(UtilsClass::getLastChar)).forEach(UtilsClass::printLine);

    }
//crte a methd to sort elments aaccrodng to their legnth then aaccording to their first character
    public static void sortAccordingToLengthLastChar(List<String>str){
        str.stream().sorted(Comparator.comparing(String::length).thenComparing(UtilsClass::getFirstChar)).forEach(UtilsClass::printLine);
        System.out.println();
        str.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).forEach(UtilsClass::printLine);
    }
//remove the elements if the length of the element is greater than 5.
    public static void reverse(List<String>rvrse){
       // rvrse.stream().filter(t->t>5).sorted(Comparator.reverseOrder()).forEach(UtilsClass::printLine);
  rvrse.removeIf(t->t.length()>5);
        System.out.println(rvrse);
    }
//remove the elemnts if the elmnts is starting with A , a, or ending with O or o.

    public static void removeifStrtWIthAEndWithO01(List<String>lst){
        lst.removeIf(t->t.charAt(0)=='A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='O' || t.charAt(t.length()-1)=='o');
        System.out.println(lst);
    }
    public static void removeifStrtWIthAEndWithO02(List<String>lst){
lst.removeIf(t->t.startsWith("A")  ||t.endsWith("a") ||t.startsWith("O") || t.endsWith("o"));
        System.out.println(lst);
    }
//remove the elemtn if the elmnt length is between 5 and 10 or ending with'o'
    public static void removeIfLengthIsBetweenFiveAndTenOrEndingWithO(List<String >str){
        //str.removeIf(t->(t.length()>4 && t.length()<11) || t.endsWith("o"));
        Predicate<String> checkCondition= t->(t.length()>4 && t.length()<11) || t.endsWith("o");
        str.removeIf(t->checkCondition.test(t));
        System.out.println(str);
    }

//create a method to check if the lengths of all elements aare less than 12
    public static boolean checkLengthToBeLessThanTwelve(List<String>str){

       return str.stream().allMatch(t->t.length()<12);
    }
    //create mthd to check if hte intial of any elment is not "X"
    public static boolean checkInitialNotToStartWithX(List<String>str){
       return str.stream().noneMatch(t->t.startsWith("X"));

    }
//create a method to check if atleast one of the elments ending with 'r'
    public static boolean checkAnyEleEndingWithR(List<String>str){

        return str.stream().anyMatch(t->t.endsWith("l"));


    }
}
