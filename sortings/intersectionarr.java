 
 import java.util.*;
public class intersectionarr {
    public static void main(String[] args) {
        int nums1[]={4,9,5};
        int nums2[]={9,4,9,8,4};
        System.out.println(intersection(nums1, nums2));
        
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>res=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        
         for(int i:nums1){
            set.add(i);

         }
          for(int i:nums2){
         if(set.contains(i)){// if it contain add else remove
            res.add(i);
            set.remove(i);
          }

         }
         System.out.println(res);
         int [] arr=new int[res.size()];
         for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);//check for the exsisting element
          }
return  arr;

    }    
}
