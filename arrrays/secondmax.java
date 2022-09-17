package arrrays;

public class secondmax {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
int ans=max(arr);

System.out.println(ans-1);// this will take the second last element in the array
    }

    static int max(int arr[]) {
        int max =arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (max < arr[i + 1]) {
                max = arr[i + 1];
            }
        }

         
        return max;
    }

}
