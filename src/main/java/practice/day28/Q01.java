package practice.day28;

public class Q01 {

    /*
    count the frequency of letters.
    "Java is so good"
     */
    public static void main(String[] args) {

        String str="Java is so good";
        String output="";//string production, it is a container by using "". now java is waiting to put something in. its like tell me what to put in
        for (int i=0; i<str.length();i++){//this loop is to take each letter one by one into consideration
            int counter=0;
            for (int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    counter++;
                }
            }
            //The reason we put not (!) here is because we only want one character from the output to make it count.
            //even though there are two "a's" we want to count it as j1,a2,v2,i1 etc. And to do this we need to
            //not equal to so that we get only one letter and not both.
            if(!output.contains(String.valueOf(str.charAt(i)))){// the reason we do String.valueOf() here is because
                //we dont want the spaces. String.valueOf() only gets the Strings.
                output=output+str.charAt(i)+counter+" ";
            }

        }


        System.out.println(output);



    }



}
