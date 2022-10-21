import java.lang.Thread.State;

public class sortcolor {
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        sortColors(arr);
         
    }
    public static void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(i<nums.length){
                if(nums[i]>nums[i+1]){
                    swap(nums, i, i+1);

                }
            }

        }
    }   
    static void swap(int nums[],int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    
    }
    
    
        
}
