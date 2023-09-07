 
public class findnoapponetwice {
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int num=arr[i];
            int count=0;

            for(int j=0;j<arr.length;i++){
                if(arr[j]==num){
                    count++;
                }
                if(count==1){
                    System.out.println(num);
                 }
            }

        }
    }
}
