import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int arr[]={4,2,5,6,1};
        int n=arr.length;
        bubble(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int arr[],int n) {
        if(n==1){
            return;
        }
        int count=0;
        for(int i=0;i<n-1;i++)
            if (arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                  count = count+1;
            }
             if(count==0)

            return;
            bubble(arr, n-1);
           
        }
}

// class bubblesort
// public class bubblesort extends Thread {
//     static int amount = 0;

//     public static void main(String[] args) {
//         bubblesort thread = new bubblesort();
//         thread.start();
//         System.out.println(amount);
//         amount++;
//         System.out.println(amount);
//     }

//     public void run() {
//         amount++;
//     }
// }
