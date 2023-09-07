 public class peak
{
	// Function to find the peak element
	// arr[]: input array
    public static void main(String[] args) {
        int arr[]={1,2,3};
        // n: size of array a[]
        int n=3;
        int ans =peakElement(arr,n);
        
        System.out.println(ans);
    }
	
	static int peakElement(int[] arr,int n)
    {
        int p=0;
             for(int i=0;i<arr.length;i++){
                if(n==arr[i]){
                    n=arr[i];
                    p=i;
                    System.out.println("index number is"+" "+p );
                    if(n>arr[i]){
                        System.out.println("peak value"+n);
                        return 1;
                    }else{
                        System.out.println("not a peak value"+n);
                    }
                  }
 
            }
            return n;
       //add code here.
    }

 
        
    }
    

