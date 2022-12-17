package testmyself;

public class MultiDimensionalArray04 {
    public static void main(String[] args) {
        //example 1: find the maximum element in a two dimensional array
        //{{5,0 },{-2,4},{65,-12,23}}
        int arr[][]={{5,0 },{-2,4},{65,-12,23}};
        int max=arr[0][0];
        for (int [] w:arr){
            for (int u:w){
                if(max<u){
                    max=u;
                }
            }
        }
        System.out.println(max);
    }
}
