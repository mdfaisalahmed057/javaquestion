import java.util.Arrays;

public class mergetwoarr {
   public static void main(String[] args) {
    int arr[]={1,2,3,0,0,0};
    int arr2[]={2,4,5};
    int n=3;
    int m=3;
    
   System.out.println(Arrays.toString(arr));
   System.out.println(Arrays.toString(arr2));
   merge(arr, arr2, m, n);


  
    }
   static void merge(int arr[],int arr2[],int m,int n){
    int ans[]=new int[m+n];
for(int i=0;i<m;i++){
    ans[i]=arr[i];
}
for(int j=0;j<n;j++){
    ans[m+j]=arr2[j];
}
Arrays.toString(ans);
System.out.println(ans);
 
    }
    
}
