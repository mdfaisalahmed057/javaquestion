import java.util.ArrayList;

public class rearrangebysign {
    public static void main(String[] args) {
        int arr[] = {1, 2, -4, -5};
        ArrayList<Integer> plus = new ArrayList<>();
        ArrayList<Integer> minus = new ArrayList<>();
        int ans[] = new int[arr.length];
        int ansIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                plus.add(arr[i]);
            } else {
                minus.add(arr[i]);
            }
        }

        for (int k = 0; k < plus.size(); k++) {
            ans[ansIndex++] = plus.get(k);

            if (k < minus.size()) {
                ans[ansIndex++] = minus.get(k);
            }
        }

        for (int f = 0; f < ans.length; f++) {
            System.out.print(ans[f] + " ");
        }
    }
}


























// mport java.util.*;

// class TUF{

// public static int[] RearrangebySign(int[] A, int n){
    
//   // Define 2 vectors, one for storing positive 
//   // and other for negative elements of the array.
//   ArrayList<Integer> pos=new ArrayList<>();
//   ArrayList<Integer> neg=new ArrayList<>();
  
//   // Segregate the array into positives and negatives.
//   for(int i=0;i<n;i++){
      
//       if(A[i]>0) pos.add(A[i]);
//       else neg.add(A[i]);
//   }
  
//   // Positives on even indices, negatives on odd.
//   for(int i=0;i<n/2;i++){
      
//       A[2*i] = pos.get(i);
//       A[2*i+1] = neg.get(i);
//   }

 
//   return A;
// }    

// public static void main(String args[]) 
// {
//   // Array Initialisation.
//   int n = 4;
//   int A[]= {1,2,-4,-5};


//   int[]ans= RearrangebySign(A,n);
  
//   for (int i = 0; i < n; i++) {
//     System.out.print(ans[i]+" ");
//   }

// }
// }