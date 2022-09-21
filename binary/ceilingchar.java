package binary ;

import java.util.Arrays;

public class ceilingchar {
    public static void main(String[] args) {
        int arr[]={1,2,3,45,65};
        int target=60;
        int ans=ceiling(arr,target);
        System.out.println( ans);
    }
    static int ceiling(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(start==arr.length){
                return 0;
            }
            if(arr[mid]>target){
                end=mid-1;
            }else { 
                start=mid+1;
            } 
        }
return arr[start%arr.length] ;
    }
}
