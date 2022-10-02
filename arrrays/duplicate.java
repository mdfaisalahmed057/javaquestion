package arrrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicate {
    public static void main(String[] args) {
        int nums[]={1,2};
       System.out.println(containsDuplicate(nums)); 

        
    }
   static  boolean containsDuplicate(int[] nums) {

        final Set<Integer> distinct = new HashSet<Integer>();
        for(int num=0;num<=nums.length-1;num++) {
             if(distinct.contains(num)) {
                return true;
            }
            distinct.add(num);
        }
         return false;
    }
}

 