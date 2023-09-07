import java.util.Arrays;

// import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int arr[]={1,1,4,2,1,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int correct = arr[i] - 1;
            if (arr[i] != correct) {
                swap(arr, i, correct);
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
// package sortings;
// import java.util.Arrays;

// public class cyclicsort {
//     public static void main(String[] args) {
//         int[] arr = {5, 4, 3, 2, 1};
//         sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }

//     static void sort(int[] arr) {
//         int i = 0;
//         while (i < arr.length) {
//             int correct = arr[i] - 1;
//             if (arr[i] != arr[correct]) {
//                 swap(arr, i , correct);
//             } else {
//                 i++;
//             }
//         }
//     }

//     static void swap(int[] arr, int first, int second) {
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }


// }

public class cyclicsort{
    public static void main(String[] args) {
        int arr[]={2,5,2,1,4};
cycle(arr);
System.out.println(Arrays.toString(arr));
    }
    static  void cycle(int arr[]){
        int i=0;
        int n=arr.length-1;
        while(i<n){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
        swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int arr[],int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}