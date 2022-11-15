 
public class fibnewversion {
    public static void main(String[] args) {
        int  a=11;
        int b=5;
        int n=17;
        System.out.println(find(a, b, n));
        
    }
    public static int find(int a,int b,int N) {
        if(N == 0) return a;
        else if (N == 1) return b;
        else if(N == 2) return a ^ b;

        return find(a,b,N%3);
        

        
    }
    
}
