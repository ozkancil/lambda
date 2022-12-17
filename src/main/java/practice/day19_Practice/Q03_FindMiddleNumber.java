package practice.day19_Practice;

public class Q03_FindMiddleNumber {
    public static void main(String[] args) {
//Given array get the middle number
        int arr[]={2,15,45,234,65,23};
        int middleIdx=arr.length/2;
        if(middleIdx%2!=0){
            System.out.println(middleIdx);
        }else{
            int middleNum=(arr[middleIdx]+arr[middleIdx-1])/2;
            System.out.println(middleNum);
        }
    }
}
