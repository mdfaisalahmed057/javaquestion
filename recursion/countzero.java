public class countzero {
    public static void main(String[] args) {
        int n=102030;
        int count=0;
        System.out.println(name(n,count));
    }
    public static int name(int n,int count) {
     if(n==0){
        return count;

    }
    int rem=n%10;
    if(rem==0){
        return name(n/2,count+1);   
    }
    return name(n/10, count);
}
}
