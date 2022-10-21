import java.util.*;
public class mergeintervals {
    
     public static void main(String[] args) {
        int arr[][]={ {1,3},{3,6},{8,10},{15,18}};
        System.out.println(merge(arr));
    }
    public static int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr1[0]));
        List<int []>output_arr=new ArrayList<>();
        int []current_intervel=intervals[0]; //first adding beg value 
        output_arr.add(current_intervel);
        for(int [] interval:intervals){
            int current_begin=current_intervel[0];
            int current_end=current_intervel[1];
            int next_begin=interval[0];
            int next_end=interval[1];
            if(current_end>=next_begin){
                current_intervel[1]=Math.max(current_end, next_end);// take the max value from the end and beg

            }else{
                current_intervel=interval;
                output_arr.add(current_intervel);
            }
            
        }

        return output_arr.toArray(new int[output_arr.size()][]);
        
    }
 }
