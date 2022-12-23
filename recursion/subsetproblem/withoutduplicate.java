import java.util.*;
public class withoutduplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4};
        List<List<Integer>>ls=withoutduplicates(arr);
        for(int i=0;i<arr.length-1;i++){
            System.out.println(ls);
          }
        
    }
        // without duplicate values

        public static List<List<Integer>> withoutduplicates(int[] arr) {
            List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());
            for (int num : arr) {
                int n = outer.size();
                for (int i = 0; i < n; i++) {
                     List<Integer> internal = new ArrayList<>(outer.get(i));
                     internal.add(num);
                    outer.add(internal);
    
                }
            }
            return outer;
        } 
    
}
