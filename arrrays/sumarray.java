package arrrays;

import java.util.Scanner;

public class sumarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the value of arrays");
        for(int i=1;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        sum(arr);

    }
    static void sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
        sum=sum+i;
        }
        System.out.println("sum  is"+sum);
    }
    
}
