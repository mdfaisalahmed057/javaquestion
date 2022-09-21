public class dectobina {
    public static void main(String[] args) {
        int x=4;
        int ans=sqrt(x);
        System.out.println(ans);
        
    }
    public static  int sqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }
    
}
