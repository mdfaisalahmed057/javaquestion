public class linearsearchrecursion {
    public static void main(String[] args) {
        int arr[]={1,2,39,4,5};
        int n=0;
        int target=39;
        System.out.println(
            check(arr, n,target)
        );
    }
    public static int check(int arr[],int index,int target) {
        if(index==arr.length-1){
            return -1;
        }else if(arr[index]==target){
            return index;
        }
        return check(arr, index+1, target);

       
    
        
    }
    
}
