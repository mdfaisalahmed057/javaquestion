import java.util.*;
public class withoutduplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        List<List<Integer>>ans=withoutduplicates(arr);
        for(List<Integer>  list:ans){
            System.out.println(list);
        }
        
    }
        // without duplicate values

        public static List<List<Integer>> withoutduplicates(int[] arr) {
            List<List<Integer>> outer = new ArrayList<>();
          
            outer.add(new ArrayList<>());// it will increase as elements added
             for (int num : arr) {
                int n = outer.size();//sisze of the empty array 
                for (int i = 0; i < n; i++) {
                     List<Integer> internal = new ArrayList<>(outer.get(i));// to create a copy for adding the element later //[] [1],[2],[1,2]
                     internal.add(num); //
                    outer.add(internal);
     
                }
            }
            return outer;
        } 
    
}
