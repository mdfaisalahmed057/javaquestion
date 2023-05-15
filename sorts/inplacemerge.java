import java.util.Arrays;

public class inplacemerge {
    public static void main(String[] args) {
        int arr[]={2,1,3,6,5};
        merge(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void merge(int arr[],int s,int e) {
        if(e-s==1){
            return;
        }
        int mid=(e+s)/2;
         merge(arr, s, mid);

         merge(arr, mid, e);
         mergeinplace(arr, s, mid, e);
    }

    public static void mergeinplace(int arr[], int s, int m, int e) {
        int mix[] = new int[e - s];//5
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;

            }
            k++;
        }
        //it ma be possible that one of the arrays is not complete
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;

        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
            
        }   
        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];

        }
    }
    
}
