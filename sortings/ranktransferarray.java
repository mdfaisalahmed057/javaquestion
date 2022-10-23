// 1331. Rank Transform of an Array
import java.util.*;
public class ranktransferarray {
    public static void main(String[] args) {
        int arr[]={40,10,20,30};
        System.out.println(arrayRankTransform(arr));
    }
    public static int[] arrayRankTransform(int[] arr) {
         HashMap<Integer,Integer>ans=new HashMap<>();
         int res[]=new int [arr.length];
         int copy[]=arr.clone();
         Arrays.sort(copy);//10,20,30,40

         int k=1;
         for(int i=0;i<arr.length;i++){
                ans.put(copy[i],k);
        
     }
    for(int i=0;i<arr.length;i++)
        res[i]=ans.get(arr[i]);
        System.out.println(Arrays.toString(res));
              return res;
    
    }
    
}
