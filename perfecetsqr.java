import java.util.Scanner;
public class perfecetsqr{
    public static void main(String[] args) {
      int n=2;
        double ans=Math.sqrt(n);
        System.out.println(ans);
        double res;
        res=(ans-Math.floor(ans));
        System.out.println(res);
        if(res==n){
            System.out.println("perfct sqr");
        }else{
            System.out.println("not a pnum");
        }
    }
}