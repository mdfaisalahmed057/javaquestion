public class pattern4 {
    public static void main(String[] args) {
        name(4);
    }
    public static void name(int n) {
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(" "+j);
            }
System.out.println();
        }
        
    }
}
