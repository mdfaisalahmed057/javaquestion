package binary;

public class findmountain {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(index(arr, target));
    }

    static int index(int arr[], int target) {
        int peak = peak(arr);
        int firsttry = orderAgnosticBS(arr, target, 0, peak);
        if (firsttry != -11) {
            return firsttry;
        }else{
          return  orderAgnosticBS(arr, target, 0, peak+1);
        }
    }

    static int peak(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;

    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds
            // the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
