import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class leader {
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
         int n=arr.length;
         int max=arr[n-1];
        ArrayList<Integer>ls=new ArrayList<>();
        ls.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
        if(arr[i]>max){
            ls.add(arr[i]);
            max=arr[i];
        }
        }

     Collections.sort(ls, Collections.reverseOrder());
     System.out.println(ls);

    }
}
