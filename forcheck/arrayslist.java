import java.util.*;

public class arrayslist {

    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr2[]={2,4,6};
        System.out.println(findDifference(arr, arr2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> st1= new HashSet<>();
        Set<Integer> st2= new HashSet<>();
         List<List<Integer>> res=new ArrayList<>();
         res.add(new ArrayList<>());// to store the result of two array
         res.add(new ArrayList<>());
        
 for(int num : nums1){
 st1.add(num); 
 } 

 for(int i:nums2){
    st2.add(i);
}
	for(int num : st1){                                             
	if(!st2.contains(num)){
         res.get(0).add(num); //to add the  psition in the list we used get()
    }
}

 for(int j:st2){
     if(!st1.contains(j)){
         res.get(1).add(j);
     }
 } 
 return res;
}
}