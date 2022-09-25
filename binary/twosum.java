package binary;

public class twosum {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4 };
        int target = 6;
        System.out.println(twoSum(arr, target));
    }

public static int twoSum(int[] arr, int target) {
    int start=0;
    int end=arr.length-1;
    while(start<end){
        if(arr[start]+arr[end]==target){
            return target;
        }else if(arr[start]+arr[end]>target){
            end--;
        }else{
            start++;
        }

    }

    
    return   start ;
}
}