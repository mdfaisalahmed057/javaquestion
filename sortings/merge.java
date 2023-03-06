import java.lang.reflect.Array;
import java.util.Arrays;

// public class merge {
//     public static int[] main(String[] args) {
//         int num1[] = { 1, 2, 3, 0, 0, 0 };
//         int num2[] = { 2, 5, 6 };

//         for (int i = 0; i < num1.length; i++) {
//             for (int j = 0; j < num1.length; j++) {
//                 if (num1[i] == 0) {
//                     num1[i] = num2[j];
//                 }
//             }
//         }
//         return num1;

//     }

// }
    // static void second(int num1[]){
    //     for(int i=0;i<num1.length;i++){
    //         for(int j=1;j<num1.length-i;j++){
    //             if(num1[j]<num1[j-1]){
    //                 int temp=num1[j];
    //                 num1[j]=num1[j-1];
    //                 num1[j-1]=temp;
    //             }
    //         }
    //     }
    // }


    // public class merge {
    //     public static void main(String[] args) {
    //         int[] num1 = {1, 2, 3, 0, 0, 0};
    //         int[] num2 = {2, 5, 6};
            
    //     for (int i = 0; i < num1.length; i++) {
    //         for (int j = 0; j < num2.length; j++) {
    //             if (num1[i] == 0) {
    //                 num1[i] = num2[j];
    //             } 
    //         }
    //     }
   
    //     }
    // }

    import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        
        int m = 3; // Number of non-zero elements in num1
        
        // Merge num2 into num1 starting from the last element
        int i = m - 1;
        int j = num2.length - 1;
        int k = m + num2.length - 1;
        
        while (i >= 0 && j >= 0) {
            if (num1[i] > num2[j]) {
                num1[k--] = num1[i--];
            } else {
                num1[k--] = num2[j--];
            }
        }
        
        // Copy the remaining elements from num2 to num1
        while (j >= 0) {
            num1[k--] = num2[j--];
        }
        
        // Sort the merged array
        Arrays.sort(num1);
        
        // Print the sorted array
        System.out.println(Arrays.toString(num1));
    }
}



