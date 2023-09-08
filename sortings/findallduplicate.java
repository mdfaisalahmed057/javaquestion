 import java.util.ArrayList;
import java.util.List;
// // https://leetcode.com/problems/find-all-duplicates-in-an-array/
<<<<<<< HEAD


=======
>>>>>>> 8e28f23980cde7795fe372443e6c3fc44bde0975
public class findallduplicate {
    public static void main(String[] args) {
        int arr[]={3,2,4,1,5,4,3};
        System.out.println(findDuplicates(arr));
    }
    static   List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
<<<<<<< HEAD
        List<Integer> ans = new ArrayList<>();
        System.out.println(ans);
=======

        List<Integer> ans = new ArrayList<>();
>>>>>>> 8e28f23980cde7795fe372443e6c3fc44bde0975
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                ans.add(arr[index]);
            }
        }
<<<<<<< HEAD
         return ans;
=======

        return ans;
>>>>>>> 8e28f23980cde7795fe372443e6c3fc44bde0975
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

<<<<<<< HEAD
=======
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

>>>>>>> 8e28f23980cde7795fe372443e6c3fc44bde0975


// public class findallduplicate{
//     public static void main(String[] args) {
//     int arr[]={3,2,4,1,5,4,3};
<<<<<<< HEAD
=======

        
>>>>>>> 8e28f23980cde7795fe372443e6c3fc44bde0975
//     }
//     static   List<Integer> findDuplicates(int[] arr) {
//         int i=0;
//         while(i<arr.length){
//             int correct=arr[i]-1;
<<<<<<< HEAD
//         }
//     }    
=======

//         }
//     }

    
>>>>>>> 8e28f23980cde7795fe372443e6c3fc44bde0975
// }