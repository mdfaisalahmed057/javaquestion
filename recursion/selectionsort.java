import java.util.Arrays;

// import java.util.Arrays;

// public class selectionsort {
//  public static void main(String[] args) {
//     int arr[]={3,43,3,431,1,1,2};
//     name(arr, arr.length-1, 0, 0);
//     System.out.println(Arrays.toString(arr));
//   }  

//   public static void name(int arr[], int row, int c, int max) {

//     if (row == 0) {
//       return;
//     }
//     if (c < row) {
//       if (arr[c] > arr[max]) {
//         name(arr, row, c + 1, c);

//       } else {
//         name(arr, row, c + 1, max);
//       }

//     } else {
//       int temp = arr[max];
//       arr[max] = arr[row - 1];
//       arr[row - 1] = temp;
//       name(arr, row-1, 0, 0);// for the new line 
//     }
//   }
// }

public class selectionsort{
  public static void main(String[] args) {
      int arr[]={3,43,3,431,1,1,2};
    name(arr, arr.length-1, 0, 0);
    System.out.println(Arrays.toString(arr));
   }
  public static void name(int arr[],int row,int col,int max) {
    if(row==0){
      return ;
    }
    if(col<row){
    if(arr[col]>arr[max]){
      name(arr, row, col+1, col);
    }else{
      name(arr, row, col+1, max);
    }
  }else{
    int temp=arr[max];
    arr[max]=arr[row-1];
    arr[row-1]=temp;
    name(arr, row-1, 0, 0);
  }
  }
}