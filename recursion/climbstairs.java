public class climbstairs {
    public static void main(String[] args) {
        int n=5;
        System.out.println(stairs(n));
    }
    public static int stairs(int n) {
        if(n==0){
         return 0;
        }
        if(n==1){
        return 1;
        }
        if(n==2){
        return 2;
         }
         System.out.println(n);
         return stairs(n-1)+stairs(n-2);//5//4
        
    }
}
