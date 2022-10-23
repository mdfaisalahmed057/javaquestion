// So the idea is:
// Let's use this input for illustration: [8,1,2,2,3]

// Create a copy of the input array. copy = [8,1,2,2,3]
// Sort the copy array. copy = [1,2,2,3,8]
// Fill the map: number => count (where count is an index in sorted array, so first number with index 0 has 0 numbers less than it, index 1 has 1 number less, etc).
//  We update only first time we enocunter the number so that way we skip duplicates.
// map[1]=>0
// map[2]=>1
// map[3]=>3
// map[8]=>4
// We re-use our copy array to get our result, we iterate over original array, and get counts from the map.
// [4,0,1,1,3]
// class Solution {
    // The Java HashMap putIfAbsent() method inserts the specified key/value mapping to the hashmap if the specified key is already not present in the hashmap.
    import java.util.*;

     public class numsmathcurnum{
        public static void main(String[] args) {
            int arr[]={8,1,2,2,3};
            System.out.println( smallerNumbersThanCurrent(arr));
        }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        
    HashMap<Integer,Integer>ans=new HashMap<>();
    int [] copy=nums.clone();//8,1,2,2,3
    Arrays.sort(copy);//1,2,2,3,8
    for(int i=0;i<nums.length;i++){
        ans.putIfAbsent(copy[i], i);//insert specified key/value mapping to the hashmap if the specified key is already not present in the hashmap
    }
    for(int i=0;i<nums.length;i++){
      copy[i]=  ans.get(nums[i]);
    }
    System.out.println(Arrays.toString(copy));
return copy;
        
    }

}