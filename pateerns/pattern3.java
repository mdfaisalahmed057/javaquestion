public class pattern3 {
    public static void main(String[] args) {
        name(4);
        
    }
    public static void name(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
        
    }
    
}
