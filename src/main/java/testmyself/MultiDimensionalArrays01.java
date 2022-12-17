package testmyself;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {
        //How to create multidimensional Array??
        String arr[][]={{"cup","hat"},{"napkin","Smile"},{"chair","appetite","Peptide"}};
        System.out.println(Arrays.deepToString(arr));

        //ex: type code to find the number of elements(find elements not length()
        // The length would be 57.
        System.out.println(Arrays.deepToString(arr).length());
        int sum=0;
        for (String[] w:arr){
            sum=sum+w.length;
        }
        System.out.println(sum);
    }
}
