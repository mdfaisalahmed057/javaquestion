
import java.util.Scanner;
public class power{
    public static void main(String[] args) {
int res=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1;i<=b;i++){
             res=res*a;

            
        }
        System.out.println(res);

    }
}