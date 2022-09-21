public class lcm {
    public static void main(String[] args) {
        int num = 36;
        int num2 = 108;
        int ans = lcm(num, num2);
        System.out.println(ans);

    }

    static int lcm(int num, int num2) {
        int ans = 0;
        for (int i = 2; i < num || i < num2; i++) {
            if (num % i == 0 && num2 % i == 0) {
                ans = i;
            }

        }
        return ans;

    }
}
