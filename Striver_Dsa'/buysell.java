public class buysell {
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        int maxsum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int nums = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                int currprofit = arr[j] - nums;

                if (currprofit > maxsum) {
                    maxsum = currprofit;
                }
            }
        }

        System.out.println(maxsum);
    }
}
