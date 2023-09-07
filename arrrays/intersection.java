import java.util.ArrayList;

public class intersection {
    public static void main(String[] args) {
        int arr1[]= {1,2,3,3,4,5,6};
        int arr2[]={3,3,5};
        ArrayList<Integer>ls=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            ls.add(arr1[i]);
        }
       for(int i=0;i<arr2.length;i++){
        if(ls.contains(arr2[i])){
            ans.add(arr2[i]);
        }
      }
      System.out.println(ans);
     }
}
