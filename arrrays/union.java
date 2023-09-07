import java.util.ArrayList;
import java.util.HashSet;

public class union {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        int arr2[] = {2,3,4,4,5,11,12};
      HashSet<Integer>s=new HashSet<>();
      ArrayList<Integer>ls=new ArrayList<>();
      for(int i=0;i<arr1.length;i++){
     s.add(arr1[i]);
      }
        for(int j=0;j<arr2.length;j++){
     s.add(arr2[j]);
      }
 for(int it:s){
    ls.add(it);
 }
 System.out.println(ls);
}
}
