import java.util.Arrays;

public class selectionsort {
    
    public static void main(String[] args) {
        int arr[]={3,4,8,5,1};
        selectionsorting(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void selectionsorting(int arr[]){
        for(int i=0;i<arr.length;i++){
            int last =arr.length-i-1;
            int res=max(arr, 0, last);
            System.out.println(res);
            
            swap(arr, res, last);
        }

    }
    static int max(int arr[],int start,int end){
        int max=start;
        for(int i=0;i<=end;i++){
            if(arr[i]>arr[max]){
                i=max;
            }
         }
         return max;
    }
    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
