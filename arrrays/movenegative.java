package arrrays;

import java.util.ArrayList;

//User function Template for Java

class movenegative {
    public static void main(String[] args) {
        int arr[]={1,-3,454,-4,34,-8,4,-6};
        segregateElements(arr);
    }
    static void segregateElements(int arr[])
    {
        // List<Integer>al=new ArrayList<>();
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                al.add(arr[i]);
            }
        } for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                al.add(arr[i]);
            }
        }
        System.out.println(al); 

    }
}