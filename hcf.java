public class hcf{
    public static void main(String[] args) {
        int num=36;
        int num2=108;
        int ans=hcf(num,num2);
        System.out.println(ans);
        
    }
    static int hcf(int num,int num2){
        int ans=0;
        for(int i=2;i<num||i<num2;i++){
            if(num%i==0 && num2%i==0){
                ans=i;
            }   

        }
        return ans;
        
    }
}