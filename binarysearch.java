import java.util.Scanner;

// import javax.sound.midi.MidiFileFormat;

public class binarysearch {

    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7,8,9};
        int target=4;
        
         System.out.println(bs(arr, target));
    }

    private static int bs(int[] shelf, int book) {
        int mech = 0;
        int comp = shelf.length-1;
        while(mech<=comp){
            int mid = (mech+comp)/2;
            if(shelf[mid]==book){
                return mid;
            }
            else if(book>shelf[mid]){
                mech=mid+1;

            }
            else{
                comp=mid-1;
            }
        }
        return -1;
    }
    
}