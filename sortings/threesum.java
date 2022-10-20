 
import java.util.*;

public class threesum {
    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        threeSum(nums);
        ArrayList<Integer>set=new ArrayList<>();
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
        // . Arrays class is used to return a fixed-size list backed by the specified array
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
//revisit