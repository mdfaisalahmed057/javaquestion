package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Collections;
// public class Arraylist {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         System.out.println(list);
//         // to get the perticular index
//         int element = list.get(0);
//         System.out.println(element);
//         // to add the element in the perticular index
//         list.add(1, 2);
//         System.out.println(list);

//        int size= list.size();
//         System.out.println(size);

//         // for loops
//         for(int i=0;i<list.size();i++){
//             System.out.println(i);

//         }
//         Collections.sort(list);

//  System.out.println("this array is sorte"+list);
//     }

// }

public class Arraylist{
    public static void main(String[] args) {
    }
        public  static  List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> res = new HashSet<>();
            if (nums.length == 0)
                return new ArrayList<>(res);
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0)
                        res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                        //this will return the element as list format
                    else if (sum > 0)
                        k--;
                    else if (sum < 0)
                        j++;
                }
    
            }
            System.out.println(res);
            return new ArrayList<>(res);
    
        }

        
    }

