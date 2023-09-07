import java.util.Arrays;

 
public class insertionsort {
    public static void main(String[] args) {
        int arr[]={2,3,1};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr, j, j-1);
    
                }
            }
           
        }
    }
   static void swap(int arr[],int first,int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
   }
    
}

// class faisal{
//     public static void main(String[] args) {
//         System.out.println("hello");
//     }
// }

 


public class insertionsort{
    public static void main(String[] args) {
        int num=23356;
        int k=4;
 int rem=0;
 while(k>=1){
     rem=num%10;
 num=num/10;
 k--;
     
  }
  System.out.println(rem);
 }
}

