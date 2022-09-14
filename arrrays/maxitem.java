package arrrays;
import java.util.Arrays;
public class maxitem {
    
    public static void main(String[] args) {
        int arr[]={1,4,2,8};
        max(arr);
           
    }
    static void max(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>max){
                max=arr[i+1];

            }
             
        }
        System.out.println(max);
        
        }

     
        
    }
