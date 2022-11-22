 
public class oddoreven {
    public static void main(String[] args) {
        int n=11;
        System.out.println(
            odd(n)
        );
    }
    public static boolean odd(int n) {
        return (n&1)==1;
        
    }
}
