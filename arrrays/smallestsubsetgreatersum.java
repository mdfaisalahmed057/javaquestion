package arrrays;

import java.util.Arrays;

public class smallestsubsetgreatersum {
    public static void main(String[] args) {
        int arr[] = { 2,17,7,3 };
        System.out.println(ssgs(arr));
    }

    static int ssgs(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length - 1;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[i + 1]) {
                sum = sum + arr[i];
                count++;

            }

        }

        if (sum < n) {
            return 1;
        } else {
            return -1;

        }

    }
}
