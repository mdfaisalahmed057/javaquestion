import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int arr[]={1,2,0,0,0,3,4,5};
        int n=2;
      zeros(arr);
     }
   
    static void swap(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }

    static void zeros(int arr[]){
        int n=arr.length;
        int temp[]=new int[n];
        for(int i=0;i<arr.length;i++){
         if(arr[i]==0){
            swap(arr);
         }else{
            temp[i]=arr[i];
         }
        }
        System.out.println(Arrays.toString(temp));
    }
}
