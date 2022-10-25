public class pattern5 {
    public static void main(String[] args) {
        name(9);
    }
    public static void name(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-5;j--){
                System.out.print("4");
            }
            System.out.println();
        }
    }
}
