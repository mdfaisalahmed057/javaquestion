import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,5};
        sort(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++)
            {
              if(arr[j]<arr[j-1]){//1<3
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
              }
             }
        }
    }
 }
