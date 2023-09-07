import java.util.Scanner;
public class perfecetsqr{
    public static void main(String[] args) {
      int n=25;
        double ans=Math.sqrt(n);
         double res;
        res=(ans-Math.floor(ans));
         if(res==0){
            System.out.println("perfct sqr");
        }else{
            System.out.println("not a pnum");
        }
    }
}