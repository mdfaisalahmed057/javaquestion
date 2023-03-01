public class bitodec{
    public static void main(String[] args) {
        int num=101010;
        bitodeci(num);
        
    }
    static void bitodeci( int num){
        double sum=0;
        double p=0;
        while(num>0){
            int rem=num%10;//0
            double ans=rem*Math.pow(2, p);//2
            sum=sum+ans;
            num=num/10;
            p++;
        }
        System.out.println(sum);
    }
}