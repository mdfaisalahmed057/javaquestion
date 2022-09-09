// in selectionsort we put the value to its own index 
/*to make this possible make the  3 function
1 selection sort for sorting
2 for swapping the values of high abd low
3 and find the maximum index in the array through maxindex 

 * 
 */


import java.util.Arrays;
public class selectionsort{
    public static void main(String[] args) {
        int arr[]={12,65,3,5,7,9,1};
        selectionsorts(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void selectionsorts(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=getMAx(arr,0,last);
            swap(arr, maxIndex, last);
        }
    }

    //swap functon
    static void swap(int arr[],int first,int second){
int temp=arr[first];
arr[first]=arr[second];
arr[second]=temp;

    }
// get the maximum value from the index 
     static int getMAx(int[] arr, int start, int end) {
        int max=start;
        for(int i=start;i<end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}