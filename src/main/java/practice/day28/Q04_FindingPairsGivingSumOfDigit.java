package practice.day28;

public class Q04_FindingPairsGivingSumOfDigit {
    /*
    create a method for a given array and find all pairs of the integers whose sum is a given number.
     */
    public static void main(String[] args) {
        int []arr={4,6,5,-10,8,5,20};//
findPairs(arr,10);

    }
    public static void findPairs(int []arr,int number){
        for (int i=0;i<arr.length;i++){//to use one loop i would need indexOf and lastIndexOf() but arr wont let me use
            //indexof lastindexof so I need to do two loops
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[i]==number){//index compare indexOf() lastIndexOf()
                    System.out.println(arr[i]+" and "+arr[j]);

                }
            }


        }
        /*



  public static void main(String[] args) {
        int []arr={4,5,6,-10,8,2,20,9,3};
        int num=10;
add(arr,num);
    }
    public static void add(int []arr, int num){

        for (int i=0;i<arr.length;i++){
            if(arr[i]+arr[i+1]==num){
                System.out.println(arr[i]+arr[i+1]);
            }
        }
         */


    }



}
