import java.util.Scanner;
public class perfecetsqr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double ans=Math.sqrt(n);
        double res;
        res=(ans-Math.floor(ans));
        if(res==n){
            System.out.println("perfct sqr");
        }
    }
}