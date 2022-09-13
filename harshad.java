import java.util.Scanner;
public class harshad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean ans=harshad(num);
        System.out.println(ans);
    }

    static boolean harshad(int num){
        int rev=0;
        int n=num;
        while(num>0){
            int res=num%10;//6
            rev=rev+res;//6
            num=num/10;
        }
        if(n%rev==0){
            return true;
            // System.out.println("number "+num);
        }else{
            // System.out.println("number not"+num);
            return false;

        }
    }
}
