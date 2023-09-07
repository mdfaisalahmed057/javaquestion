package arrrays;

public class minmax {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        minmaxi(arr);
        min(arr);
    }
    static void minmaxi(int arr[]){
        int max=arr[0];
         for(int i=0;i<arr.length-1;i++){
            if(max<arr[i+1]){
                max=arr[i+1];
 
            }

            
        }
        System.out.println(max);

    }
    static void min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(min>arr[i+1]){
                min=arr[i+1];
            }
        }
        System.out.print(min);

    }
}
