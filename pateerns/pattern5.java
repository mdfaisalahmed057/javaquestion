public class pattern5 {
    public static void main(String[] args) {
        name(3);
    }
    public static void name(int n) {
        for(int i=1;i<=2*n;i++){
            int totalcolsrow=i>n?2*n-i:i;
            for(int j=1;j<=totalcolsrow;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
