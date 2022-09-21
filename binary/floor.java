package binary;

public class floor {
  // floor return largest integer that is smaller then input
    public static void main(String[] args) {
        int arr[]={2,3,4,5,9,10};
        int target=1;
int ans=floore(arr,target);
System.out.println(ans);
    }
    static int floore(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;

            }else{
                return mid;
            }

        }
        return end;
    }
}
