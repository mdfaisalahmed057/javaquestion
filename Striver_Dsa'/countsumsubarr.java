// //brute force approach

// public class countsumsubarr {
//     public static void main(String[] args) {
//         int arr[] = { 3, 1, 2, 4 };
//         int t = 6;
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 int sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     sum = sum + arr[k];
//                 }
//                 if (sum == t) {
//                     count++;
//                 }
//             }

//         }
//         System.out.println(count);
//     }
// }

//bbetter approach

public class countsumsubarr {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 4 };
        int t = 6;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                 if (sum == t) {
                    count++;
                }
            }

        }
        System.out.println(count);

    }
}