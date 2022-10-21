import java.lang.annotation.Target;

public class threesumclosest {
    public static void main(String[] args) {
        int nums[]={-1,2,1};
         int target=1;
        System.out.println(threeSumClosest(nums,target));
        
    }
    public static  int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int closet=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                System.out.println(sum);
                if(sum==target){
                    return sum;
                }
                if(sum>target){
                    k--;
                }else{
                    j++;
                }
                if(Math.abs(target-sum)<Math.abs(closet-sum)){
                    closet=sum;
                }
            }
        }
        System.out.println(sum);

        return sum;
       
    }
}
    

