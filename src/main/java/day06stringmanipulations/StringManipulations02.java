package day06stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        //example 1: type the code to see the order number of the first occurrence of character 'a'
        // "I want to learn java"

        String str="I want to learn java";
      int idx=str.indexOf('a');//indexOf() method gives you the index of first occurrence of a specific character
        System.out.println(idx+1);//order number is different than the index so we do index plus 1.

        //example2: type code to see the order number of the first occurrence of "java"
        // I like to study java, learn java earn money, java is easy
        String s="I like to study java, learn java earn money, java is easy";
        //note 1: indexOf() method can be used with 'char' and string data types.
        //note 2: if you use string inside the indexOf(), it will return the index of the first character, s.inexOf("Java"); returns the index of "j"
          //note 3: indexOf() method returns "-1" for non-existing characters
        int idx1=s.indexOf("java");
        System.out.println(idx1+1);
        //s.charAt('a');
        //example 3: type code to check if a string has 'a' in it or not. Print appropriate messages for the scenarios
        String word="I like to a study";

        if(word.indexOf('a')==-1){
            System.out.println("There is no 'a' ");
        }else{
            System.out.println("There is 'a' ");
        }
        String result=word.indexOf('a')==-1? "no a": "there is a ";
        System.out.println(result);
        //example 4: type code to find the order number of last occurrence of Java
        String r="I like to study java, learn java earn money, java is easy";
        int result1=r.lastIndexOf("java");
        System.out.println(result1+1);

        //example 5; type a code if a character is unique in a string or not
        // hello==> h is unique, e is unique, o is unique
        String m="hello";
        if(m.indexOf('m')==-1){
            System.out.println("The character does not exist");
        }
        if(m.indexOf('x')==m.lastIndexOf('x')){
            System.out.println("the character is unique");
        }else{
            System.out.println("The character is not unique");
        }

        String e=m.indexOf('l')==m.lastIndexOf('l')? "The character is uniq":"The character is not unique";
        String res=m.indexOf('a')==-1? "Not unique" : (m.indexOf('a')==m.lastIndexOf('a')? "Unique": "not unique");
        System.out.println(e);
        System.out.println(res);

    }
}
