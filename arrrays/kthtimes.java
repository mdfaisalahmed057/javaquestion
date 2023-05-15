
import java.util.Arrays;

public class kthtimes {
    public static void main(String[] args) {
        int arr[] = { 1, 7, 4,4, 3, 4, 8, 7 };
        kth(arr);
    }

    static int kth(int arr[]) {
        Arrays.sort(arr);
        int count =0;
        int ans = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                ans = arr[i];
                count = i;
                break;

            }

        }
        System.out.println(count);
        return count;

    }
}