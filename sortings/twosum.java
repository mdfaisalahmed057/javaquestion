// import java.lang.reflect.Array;

// import java.util.*;
// public class twosum {
//     public static void main(String[] args) {
//         int arr[]={2,7,11,15};
//         int target=9;
//         System.out.println(sum(arr, target));
        
//     }
//      public static int[] sum(int nums[],int target){
//         int sum=0;
//         ArrayList<Integer>res=new ArrayList<>();
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i++){
//              sum=nums[i]+nums[i+1];    
//              if(sum==target){
//                  res.add(nums[i],nums[i+1]);
//              } 
//              if(sum>target){
//              i++;
//              }   else{
//                 i--;
//              }     
//         }
//         return new int[]{-1,-1};
        
        
//      }
    
// }


 
// import java.util.*;

// public class twosum {
//     public static void main(String[] args) {
//         int nums[] = { 2,7,11,15};
//         int target=9;
//         threeSum(nums,target);
//       }

//     public  static  List<List<Integer>> threeSum(int[] nums,int target) {
//         Set<List<Integer>> res = new HashSet<>();
//         if (nums.length == 0)
//             return new ArrayList<>(res);
//         Arrays.sort(nums);
//         for (int i = 0; i < nums.length - 1; i++) {
//             int j =nums.length-1;
//              while (j < j) {
//                 int sum = nums[i] + nums[j];

//                 System.out.println(sum);
//                 if (sum ==target){
//                     res.add(Arrays.asList(nums[i], nums[j] ));
//         // . Arrays class is used to return a fixed-size list backed by the specified array
//                  } else {
// j++;
//                 }
                
//              }

//         }
//         System.out.println(res);
//         return new ArrayList<>(res);

//     }
// }
// //revisit

import java.util.*;

public class twosum {
    public static void main(String[] args) {
        int nums[] = { 2,7,11,15};
        Arrays.toString(nums);
        int target=9;
      System.out.println(sum(nums, target));   
       }
        public static int [] sum(int nums[],int target){
             int n=nums.length;
            Map<Integer,Integer> map=new HashMap<>();
            int[] result=new int[2];
            for(int i=0;i<n;i++){
                if(map.containsKey(target-nums[i])){
                    
                    result[1]=i;
                    result[0]=map.get(target-nums[i]);
                     return result;
                }
                map.put(nums[i],i);
             }
            return result;
        }
    }

    ///REVISIT
    // public int[] twoSum(int[] nums, int target) {
    //     int[] sum = new int[2];
    //     for (int i = 0; i < nums.length; ++i) {
    //         for (int j = i + 1; j < nums.length; ++j) {
    //             if (target == nums[i] + nums[j]) {
    //                 sum[0] = i;
    //                 sum[1] = j;
    //                 return sum;
    //             }
    //         }
    //     }
    //     return sum;
    // }
    // }
    
    // j