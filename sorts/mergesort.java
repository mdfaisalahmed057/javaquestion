import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int arr[]={3,4,1,8,6,5}; // to update the neww array
        
        arr= mergesorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergesorting(int [] arr) {
        if(arr.length==1){
            return arr;

        }
        int mid=arr.length/2;
        int [] left=mergesorting(Arrays.copyOfRange(arr, 0, mid));
        int [] right=mergesorting(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
        
        
    }
    private static int[] merge(int[] first, int[] second) {
     int []mix=new int[first.length+second.length];
     int i=0;
     int j=0;
     int k=0;
     while(i<first.length && j<second.length){
        if(first[i]<second[j]){
            mix[k]=first[i];
            i++;
        }else{
            mix[k]=second[j];
            j++;            
        }
        k++;
     }
     // it may be possible that one of the array is not completed
     while (i < first.length) {
         mix[k] = first[i];
         i++;
         k++;
     }
     while (j < second.length) {
          mix[k] = second[j];
         j++;
         k++;
     }
     return mix;
   }
  
}
