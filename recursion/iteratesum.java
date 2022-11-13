public class iteratesum {
    public static void main(String[] args) {
        int n=4;
        System.out.println(name(n));
    }
    public static int name(int n) {
        if(n<=0){
            return 0;
        }
     return n+name(n-1);
        
    }
    
}
