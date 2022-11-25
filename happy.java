public class happy {
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
        
    }
    public static boolean isHappy(int n) {
        int rem; int res=n;
        while (res == 1) {
            rem = res % 10;
            int sum1 = rem * rem;
            System.out.println("rem" + sum1);
            int x = res / 10;
            System.out.println(x);
            int sum2 = x * x;
            res = sum1 + sum2;
            return true;
        }
             
 
        return false;

        
    }
    
}
