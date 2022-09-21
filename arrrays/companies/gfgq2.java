package arrrays.companies;

public class gfgq2 {
    public static void main(String[] args) {
        int arr[]={1,2,34};
        int n=2;
        water(arr,n);
        
    }
    static void water(int arr[],int n){
        int max=0;
        int res;
         for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                arr[i]=max;
                System.out.println(max);
            }
            res=max-(n-1);
            System.out.println(res);
        }
     }
}
