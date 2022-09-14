package arrrays;

public class smallnum {
    public static void main(String[] args) {
        int n[]={2,4,8,3,5};
        min(n);
    }
    static void min(int arr[]){
        int min=arr[0];//2
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<min){//4<2
                min=arr[i];//min =2;
            }
        }
        System.out.println(min);
    }
    
}
