 
 import java.util.*;

    
public class minsumofindex{
    public static void main(String[] args) {
      String   patterns[] = {"happy","sad","good"};
      String word  [] = {"sad","happy","good"};
        System.out.println(findRestaurant(patterns, word));
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>(); // {name : index}
        int minIndexSum = Integer.MAX_VALUE;
    
        // Loop through list1, fill the hashMap with list1 items
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
     
        // Loop through list2
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) { // Note: time complexity for map.containsKey() is assumed to be O(1) here
                int sum = map.get(list2[i])+i ;
     
                if (sum < minIndexSum) {
                    minIndexSum = sum;
                    res.clear();
                    res.add(list2[i]);
                } else if (minIndexSum == sum) {
                    res.add(list2[i]);
                }
            }
        }
    
        String[] ans = res.toArray(new String[res.size()]);
        return ans;
    }
    }
