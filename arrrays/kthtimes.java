
import java.util.Arrays;

public class kthtimes {
    public static void main(String[] args) {
        int arr[] = {1,3,5,4,7,7,8};
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