// package arrrays;

// import java.util.ArrayList;
// import java.util.Arrays;

// public class inters {
//     public static void main(String[] args) {
//         int arr1[]={1,2,3,4,5};
//         int  arr2[]={1,2,3};
// int ans=inters(arr1, arr2);
// System.out.println(ans);
//     }
//     static int inters(int arr1[],int arr2[]){
//     ArrayList<Integer>ls=new ArrayList<>();
//         for(int i=0;i<arr1.length;i++){
//             for(int j=0;j<arr2.length;j++){
//                ls.add(arr1[i] );
//                 } 

//             }
//         }

//      }

// }

package arrrays;

// hash set is used to add only unique value  
//
import java.util.HashSet;

public class inters {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3 };
        int ans = interss(arr1, arr2);
        System.out.println(ans);

    }

    static int interss(int arr1[], int arr2[]) {
        HashSet<Integer> union = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            union.add(arr1[i]);

        }
        for (int i = 0; i < arr2.length; i++) {
            union.add(arr2[i]);

        }
        System.out.println(union);
        return union.size();
    }
}


/*
 * hash set examples
 * throught this we can add the element ,delete .search/contain
 * 2.it can Itrator through this we can itrate and print the vaue
 * ...syntax fot itrator...
 * Iterator it=set.iterator();
 * 3.next()this method check weather hashset has some  value in it or not;
 * ...syntax it.next();
 * 
 */

 