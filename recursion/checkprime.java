public class checkprime {
    public static void main(String[] args) {
        int n=14;
        System.out.println(name(n));
        
    }
    public static boolean name(int n) {
        
        if(n==0){
            return false;
        }
        if(n%2==0){
            return true;
        }
      
        return (n%2==0)?name(n):false;
        
    }
}
