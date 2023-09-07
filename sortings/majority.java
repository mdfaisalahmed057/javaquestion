// import java.util.HashSet;

// // import java.util.Arrays;

// // public class majority {
// //     public static void main(String[] args) {
// //         int arr[]= {2,2,1,1,1,2,2};
// // System.out.println(maj(arr));
// //      }
// //      static int maj(int nums[]){
// //         Arrays.sort(nums);
// //         return nums[nums.length/2];
// //         }

// // }
// public class majority {
//     public static void main(String[] args) {
//         int nums[] = { 4, 1, 2, 1, 2 };
//         System.out.println(maj(nums));

//     }

//     static int maj(int nums[]) {
//         HashSet<Integer> set = new HashSet<Integer>();
//         for (int i : nums) {
//             if (set.contains(i)) {
//                 set.remove(i);
//             } else {
//                 set.add(i);
//             }
//         }
// System.out.println(set);
//         // for (int i : set) {
//         //     return i;
//         // }
//         return -1;
//     }
// }

class majority{
    static int i=name1();
    static int j=name1()+name2();
  

    public static int  name1() {
        System.out.println("hi");
        return 5;
        
    }
    public static int  name2() {
        System.out.println("bye");
        return 10+name1();
        
        
    }
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println(i);
        System.out.println(j);
    }
}