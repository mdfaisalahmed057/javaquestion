package arrrays;

import java.util.Scanner;

public class subarraysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int tar=12;
        subsum(arr, tar);

        
    }
    static void subsum(int arr[],int tar){
        int sum=0;
        int first=0;
        int second=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+i;
           
            if(sum==tar){

                System.out.println(sum);
                break;
         
            }

        }
    }
    
}
//not a full complete answer
