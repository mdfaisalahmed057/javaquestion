 import java.util.HashMap;
import java.util.*;

// 1636. Sort Array by Increasing Frequency

public class sortarrfreincre {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3};
        System.out.println(frequencySort(arr));
    }
    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int n : nums) {                            // O(n)
            ans.add(n);
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        System.out.println(map);
 
        Collections.sort(ans, (a, b) -> {               // O(n * logn)
            return map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b);
         });
        System.out.println(ans);

         return ans.stream().mapToInt(i -> i).toArray(); // O(n)
    }
}

//second approach
// public int[] frequencySort(int[] nums) {
// 	Map<Integer, Integer> map = new HashMap<>();
// 	// count frequency of each number
// 	Arrays.stream(nums).forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1));
// 	// custom sort
// 	return Arrays.stream(nums).boxed()
// 			.sorted((a,b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a)
// 			.mapToInt(n -> n)
// 			.toArray();
// }
// custom sort explanation:
// .stream(nums)
// iterates through the nums array

// .boxed()
// converts each int to Integer object, this is because .sorted() can only operate on objects

// .sorted((a,b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a)
// if frequency of two numbers are not the same, sort by ascending frequency. If frequencies are the same, sort by decending numeric value

// .mapToInt(n -> n)
// converts Integer to int

// .toArray()
// returns array


//revisit