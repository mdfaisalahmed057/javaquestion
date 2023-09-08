import java.util.*;
public class haflsum {
    public static void main(String[] args) {
        int arr[]={2,2,1,3,1,1,3,1,1};
        Arrays.sort(arr);
        int count=0;
        int max=0;
        int i=0;
             int num=arr[i];
            for(int j=0;j<arr.length;j++){
            if(arr[j]==num){
               count++;
            i++;
            max=arr[j];
             }
         }
         if(count>arr.length/2){
            System.out.println(max);
          }else{
            System.out.println("not valid");
          }
     }
}
