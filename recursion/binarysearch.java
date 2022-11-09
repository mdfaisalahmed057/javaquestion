 
public class binarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=2;
        System.out.println(search(0, arr.length-1, target, arr));
    }
    public static int search(int s,int e,int target,int arr[]) {
        // pass those value which are beneficial for the feature then add in the parameter
        if(s>e){
            return -1;
        }
         int mid=s+(e-s)/2;
         if(arr[mid]==target){
            return mid;
         }
         if(arr[mid]>target){
            return search( s, mid-1, target, arr) ;
         }else{
            return search( mid+1, e, target, arr) ;

         }
         
    }
}
