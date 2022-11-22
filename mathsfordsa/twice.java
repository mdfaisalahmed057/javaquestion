 
public class twice {
    public static void main(String[] args) {
        int arr[]={-2,3,2,4,-5,5,-4};
        System.out.println(twicee(arr));
    }
    public static int twicee(int arr[]) {
    int unique=0;
    for(int n:arr){
    unique^=n;
    }
    return unique;
}
}