package binary;

public class binarysearch {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        int k=4;
        System.out.println(search(arr, k));
        
    }
    static int search(int arr[],int k){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid==k){
                return mid;
            } 
            if(arr[mid]>k){
                end=end-1;
            }else if(arr[mid]<k){
                start=mid+1;
            }else{
                return mid;
            }
            
        }
        return -1;
    }
}
