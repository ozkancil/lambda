package day15multidimensionalarraylists;

public class MultiDimensionalArrays04 {
    public static void main(String[] args) {
        //example 1: find the maximum element in a two dimensional array
        //{{5,0 },{-2,4},{65,-12,23}}
        int arr[][]={
                {5,0 },
                {-2,4},
                {65,99,23}// a>b
        };
        int maxNum=arr[0][0];

        for(int[] w:arr){//the reason we go inside and use two loops here is cuz we want the elemtns this time.
            //so we do two loops to get each element. then we do maxNum>u print maxNum. So we add it to (maxNum=maxNum+u;)--> we are not adding
            //we are only inputing it into the container so we do maxNum=w;
            for(int u:w){
                if(maxNum<u){
                    maxNum=u;
                }
                //maxNum=Math.max(maxNum,u);
                }
            }
        System.out.println(maxNum);

        }

    }

