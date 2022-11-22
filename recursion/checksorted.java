public class checksorted {
    public static void main(String[] args) {
        int arr[]={1,2,39,4,5};
        int n=0;
        System.out.println(
            check(arr, n)
        );
    }
    public static boolean check(int arr[],int index) {
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&& check(arr, index+1);
       
    
        
    }
    
}
