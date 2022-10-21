import java.util.HashSet;


import java.util.*;
public class findmissingpositive {
    
    public static void main(String[] args) {
        int arr[]={3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
        
    }
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer>res=new HashSet<>();
         for(int i : nums){
            res.add(i);
         }
          for(int num=1;num<=nums.length;num++){
            if(!res.contains(num)){
                return num;

            }
         }
         
 return nums.length+1;
        
    }

}
