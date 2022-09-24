// Given a non-negative integer x, compute and return the square root of x.

// Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

// Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

// Example 1:

// Input: x = 4
// Output: 2

package binary;
// public class squarert {

//     public static void main(String[] args) {
//         int x=36;
//         System.out.println( mySqrt(x));

import java.lang.Thread.State;

//     }
//     static int mySqrt(int x) {
//         if(x <= 1) return x;
//         int start = 0;
//         int end = x/2;

//         while(start < end) {
//             // start is not always moving and hence we can get stuck in infinite loop with mid calculation
//             // Adding 1 to mid everytime to ensure we always move the mid
//             int mid = (start + (end-start)/2) + 1;
//             // System.out.println(mid);

//             // use division instead of multiplication to avoid overflow
//             int div = x/mid;
//             if(div == mid) return mid;
//             if(div > mid) start = mid;
//             else end = mid-1;
//         }

//         return start;
//     }
// }

// public class squarert {
//     public static void main(String[] args) {
//         int x = 32;
//         System.out.println(sqrt(x));

//     }

//     static int sqrt(int x) {
//         int start = 1;
//         int end = x / 2;
//         while (start < end) {
//             int mid = (start + (end - start) / 2) + 1;
//             int div = x / mid;
//             System.out.println(div);

//             if (div == mid)
//                 return mid;
//             if (div > mid) {
//                 start = mid;
//             } else {
//                 end = mid - 1;

//             }
//         }
//         return start;

//     }
// }




public class squarert {
    public static void main(String[] args) {
        int x=32;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        int start = 1;
        int end = x;
        int ans = 0;
        while(start <= end){
            int mid = start + (end-start)/2;
			//instead of mid*mid we are giving x/mid to tackle overflow of integer range when multiplying with bigger numbers
            if(mid <= x/mid){
                ans = mid;
                System.out.println(ans);
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
}