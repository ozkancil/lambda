package day15multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {
        /*
        if an array has arrays as elements it is called "multidimensional array".
        It's an array inside an array.
        [  [ ] , [ ], [ ], [ ], [ ]  ]
        We can make it 3 dimensional array as well.
         [  [ [] ] , [ [] ], [ [] ], [ [] ], [ [] ]  ]
         */
        //How to create multidimensional Array??
        int arr[][]=new int[4][2];//1st bracket for outer array. 2nd for inner arrays.
        //how to print a multidimensional array?
        System.out.println(Arrays.deepToString(arr));//you will see [ [0,0], [0,0], [0,0], [0,0]  ]--> outer array default value is zero.
        //How to assign values to multidimensional array elements
        arr[2][1]=7;
        System.out.println(Arrays.deepToString(arr));
        //2,3   5,9   10,7  -3,8
        arr[0][0]=2;
        arr[0][1]=3;
        arr[1][0]=5;
        arr[1][1]=9;
        arr[2][0]=10;
        arr[2][1]=7;
        arr[3][0]=-3;
        arr[3][1]=8;

        System.out.println(Arrays.deepToString(arr));
//Arrays.deepToString()     Arrays.toString()
        String brr[][]=new String[3][4];
        System.out.println(Arrays.deepToString(brr));

        //How to create multidimensional array in short way
        String crr[][]={{"Tom","Jim"},{"Angie"},{"Carl", "Chris","Ali"}};
        System.out.println(Arrays.deepToString(crr));

        //How to print a specific element from a multidimensional array
        System.out.println(crr[2][1]);
        System.out.println(crr[0][0]);

        //How to print a specific element from outer array
        System.out.println(Arrays.deepToString(crr[2]));

        //ex: type code to find the number of elements in a multidimensioanl array
        System.out.println("============================================");
        String err[][]={{"Tom","Jim"},{"Angie"},{"Carl", "Chris","Ali"}};
        System.out.println(err.length);
        int sum=0;
        for (String[] w:crr){
            System.out.println(w.length);
         sum=sum+w.length;

        }
        System.out.println(sum);

    }
}
