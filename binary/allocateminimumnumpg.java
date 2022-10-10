import java.util.Arrays;

// // Java program for optimal allocation of pages

// public class allocateminimumnumpg {
// 	// Utility method to check if current minimum value
// 	// is feasible or not.
// 	static boolean isPossible(int arr[], int n, int m,int curr_min)
// 	{
//         //int n= {12, 34, 67, 90}
// 		int studentsRequired = 1;
// 		int curr_sum = 0;

// 		// iterate over all books
// 		for (int i = 0; i < n; i++) {
// 			curr_sum += arr[i];
// 			if (curr_sum > curr_min) {
// 				studentsRequired++; // increment student
// 									// count
// 				curr_sum = arr[i];
//                  // update curr_sum
// 			}
 
// 		}
 

// 		return studentsRequired <= m;
// 	}

// 	// method to find minimum pages
// 	static int findPages(int arr[], int n, int m)
// 	{
// 		int sum = 0;

// 		// return -1 if no. of books is less than
// 		// no. of students
// 		if (n < m)
// 			return -1;

// 		// Count total number of pages
// 		for (int i = 0; i < n; i++)
// 			sum += arr[i];

// 		// initialize start as arr[n-1] pages(minimum answer
// 		// possible) and end as total pages(maximum answer
// 		// possible)
// 		int start = arr[n - 1], //3
//         end = sum;//203
//         System.out.println(end);
// 		int result = Integer.MAX_VALUE;
//  		// traverse until start <= end
// 		while (start <= end) {
// 			// check if it is possible to distribute
// 			// books by using mid is current minimum
// 			int mid = start + (end - start) / 2;//
// 			if (isPossible(arr, n, m, mid)) {
// 				// update result to current distribution
// 				// as it's the best we have found till now.
// 				result = mid;
 
// 				// as we are finding minimum so,
// 				end = mid - 1;//end=34-1
// 			}

// 			else
// 				// if not possible, means pages should be
// 				// increased ,so update start = mid + 1
// 				start = mid + 1;
// 		}
//         System.out.println(result);


// 		// at-last return minimum no. of pages
// 		return result;
// 	}

// 	// Driver Method
// 	public static void main(String[] args)
// 	{

// 		int arr[] = { 12, 34, 67,
// 					90 }; // Number of pages in books

// 		int m = 2; // No. of students

// 		System.out.println("Minimum number of pages = "
// 						+ findPages(arr, arr.length, m));
// 	}
// }

// // This code is contributed by Aditya Kumar (adityakumar129)

public class allocateminimumnumpg{

  public static void main(String[] args) {
    int arr[]={3,4,1,2}  ;
    System.out.println( search(arr));

    }
    static int search(int nums[]){
        int start=0;
        int end=nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;
             
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }

         }
        return start;
        
    }
}