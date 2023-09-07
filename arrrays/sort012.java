 
import java.util.ArrayList;
import java.util.Scanner;

public class sort012 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int arr[]={0,1,0,2,2,1};
        System.out.println("enter the size array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        ArrayList<Integer>ls=new ArrayList<>();
       for(int i=0;i<arr.length;i++){
        if(arr[i]<i){
            ls.add(arr[i]);
        }
       }
       for(int i=0;i<arr.length;i++){
        if(arr[i]>i){
            ls.add(arr[i]);
        }
       }
    //    for(int i=0;i<arr.length;i++){
    //     if(arr[i]==2){
    //         ls.add(arr[i]);
    //     }
    //    }
       System.out.println(ls);
        
    }
}
