import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// import java.util.ArrayList;
// import java.util.Stack;

// public class nge {
//     public static void main(String[] args) {
        
//         int arr[]={1,3,0,0,1,2,4};
//         Stack<Integer> st=new Stack<>();
//         ArrayList<Integer> ls=new ArrayList<>();


//         for(int i=st.size()-1;i>0;i++){
//             if(st.size()==0){
//                 st.add(-1);

//             }else if(st.size()>0 && st.peek()>arr[i]){
//                 ls.add(st.peek());
//             }
//             else if(st.size()>0 && st.peek()<=arr[i]){
//                 while(st.size()>0 && st.peek()<=arr[i]){
//                     st.pop();
//                 }
//             }
//             if(st.size()==0){
//                 ls.add(-1);
//             }else{
//                 ls.add(st.peek());
//             }
//             st.push(arr[i]);

//         }
//         System.out.println(st);
//     }
    
    
// }

public class nge{
    public static void main(String[] args) {
       int [] nums1 = {4,1,2}; 
       int nums2[] = {1,3,4,2};
       System.out.println(nextGreaterElement(nums1,nums2));
    }
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
}
