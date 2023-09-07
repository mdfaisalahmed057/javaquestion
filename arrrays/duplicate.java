import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicate {
    public static void main(String[] args) {
        int nums[] = {1,2,2,3};
        System.out.println(optimal(nums));
    }

    static boolean containsDuplicate(int[] nums) {
        Set<Integer> distinct = new HashSet<Integer>();
        for (int num : nums) {
            if (distinct.contains(num)) {
                return true;
            }
            distinct.add(num);//1.2/3
        }
        return false;
    }
    //optimal approach
    static int optimal(int[] arr){
        int i=0;//1
        for(int j=1;j<arr.length-1;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }

}
