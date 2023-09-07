import java.util.Arrays;

public class movezero {
    public static void main(String[] args) {
        int arr[]={1,2,3,0,0,4,5};
     for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            swap(arr);
        }
     }
     System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
            int temp=arr[count];
            arr[count]=arr[i];
            arr[i]=temp;
            count++;
            }
        }

    }
}
