package binary;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 32;
        System.out.println(isqr(num));
    }

    static boolean isqr(int num) {
        long start = 1;
        long end = num ;
        while (start <= end) {

            Long mid = start + (end - start) / 2;
 
            if (mid * mid == num) {
                return true;

            } else if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        return false;

    }
}
