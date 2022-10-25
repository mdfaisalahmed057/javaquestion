public class pattern6 {
     
    public static void main(String[] args) {
        e(4);
    }
    public static void name(int n) {
          for(int row=1;row<=n;row++){
            for(int space=0;space<n-row;space++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println("");
          }
    }
    public static void e(int n) {
        int original=n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int atEveryindex=original-Math.min(Math.min(row,col),Math.min(n-row,n-col));
              System.out.print(atEveryindex+" ");

            }
            System.out.println();
        }
        
    }
}
