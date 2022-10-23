import java.util.*;
// public class disappeared {
//     public static void main(String[] args) {
//         int arr[]={3,0,1};
//         System.out.println(dis(arr));
        
//     }
//     static int dis(int arr[]){
//         int i=0;
//         while(i<arr.length){
//             int correct=arr[i];
//             if(arr[i]<arr.length && arr[i]!=arr[correct]){
//                 swap(arr, i, correct);
//             }else{
//                 i++;
//             }
//         }
//             for(int index=0;index<arr.length;index++){
//                 if(arr[index]!=index){
//                     return index;
//                 }
//             }
        
//         return arr.length;
//      }
//    static void  swap(int arr[],int first,int second){
//     int temp=arr[first];
//     arr[first]=arr[second];
//     arr[second]=temp;
//    }
    
// }

public class disappeared{
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
        
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {             
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;// checking for the crt index
            if(nums[i]!=nums[correct])
            swap(nums, i, correct);
            else
                i++;
            
        }
         

        List<Integer> list = new ArrayList<>();
        for(int idx=0;idx<nums.length;idx++)
            if(nums[idx] != idx+1)
                list.add(idx+1);
        return list;
                 
            
 
     }
    static void  swap(int arr[],int first,int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
           }
}