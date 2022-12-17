package day25exceptions;

public class E02 {
    public static void main(String[] args) {

        String []arr ={"a","b","c","z"};
        String r1=getElement(arr,6);//waht if idx get 10 and we do not have index 10. That would be a problem an unexpexted issue.
        System.out.println(r1);// when there is an error above the rest of code does not run. how do we solve this/? we put try catch
    }

    public static String getElement(String arr[], int idx ) {
        String s="";
        try {
             s= arr[idx];

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("A problem occured in array indexes");
            System.out.println(e.getMessage());//gives technical message about exception
            e.printStackTrace();//gives detailed technical message about the exception

        }
return s;
    }
}
