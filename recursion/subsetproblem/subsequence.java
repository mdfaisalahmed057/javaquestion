import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.*;
public class subsequence {
    public static void main(String[] args) {
        String p="";
        String up="abc";
        // name(p, up); 
        // System.out.println(array(p, up)); 
        int arr[]={1,2,3,3};
        List<List<Integer>> ans=duplicate(arr);
        for(List<Integer> list:ans){
            System.out.println(list);
         }
          }
       

      //using only recursion
    public static void name(String p,String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        name(p, up.substring(1));   //take it or ignore it   
        name(p+ch, up.substring(1));


    }

      //using only recursion and arraylist

    public static  ArrayList<String> array(String p,String up) {
        if(up.isEmpty()){
            ArrayList<String>ans=new ArrayList<>();
            ans.add(p);
            return ans;
          }
        char ch=up.charAt(0);
        ArrayList<String> left= array(p+ch, up.substring(1));
        ArrayList<String> right= array(p, up.substring(1));
        ArrayList<String> ascii= array(p+(ch+0), up.substring(1));
        left.addAll(right);
        ascii.addAll(left);
        return ascii;  
    }

     public static void iterate(String p,String up) {
        if(up.length()==0){
            System.out.println(p);
            return;
        }
         char[] chs=up.toCharArray();
        for(int i=0;i<chs.length;i++){
            iterate(p+chs[i], up.substring(i+1));
            iterate(p, up.substring(i+1));
        }
    }

    // without duplicate values

    public static List<List<Integer>> withoutduplicate(int[] arr) {
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

// duplicate subarray questions

public static List<List<Integer>> duplicate(int arr[]) {
    Arrays.sort(arr);
    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());
     int start = 0;
    int end = 0;
    for (int i = 0; i < arr.length; i++) {
        start=0;
         // if current and previous element is same then
            if (i > 0 && arr[i] == arr[i-1]) {
            start = end + 1;
        }
        end = outer.size() - 1;
        int n = outer.size();
        for (int j = start; j < n; j++) {
            List<Integer> internal = new ArrayList<>(outer.get(j));
            internal.add(arr[i]);
            outer.add(internal);
        }
    }
    return outer;

}
 
}
