
// public It is obvious that the version would looks like the following:
// FFTTTT (The first two are correct version, the rest are bad ones)
// So we can use binary search to find the rightmost F or the leftmost T

// To find the leftmost T

// public int firstBadVersionLeft(int n) {
// 	int i = 1;
// 	int j = n;

// 	while (i < j) {

// 		int mid = i + (j - i) / 2;

// 		if (isBadVersion(mid)) {
// 			j = mid;
// 		} else {
// 			i = mid + 1;
// 		}

// 	}

// 	return i;

// }
// To find the right most F we need to notice that since we are looking for the first bad version not the last correct version, we need to return the (position when the binary search stop) + 1

// public int firstBadVersion(int n) {

// 	if (isBadVersion(1)) {
// 		return 1;
// 	}

// 	int i = 1;
// 	int j = n;

// 	while (i < j) {
// 		int mid = i + (j - i) / 2 + 1;
// 		if (!isBadVersion(mid)) {
// 			i = mid;
// 		} else {
// 			j = mid - 1;
// 		}
// 	}

// 	return j + 1;

// }
// BTW, understanding how to use binary search to find the most left target or the most right target (when the target is duplicated) is very useful to solve binary search related problems. =) {
    
// }


package binary;
public class badverson{
    public static void main(String[] args) {
        int n=4;
        System.out.println(firstBadVersion(n));
        
    }

public static int firstBadVersion(int n) {
    int low = 1, high = n;
    while(low <= high){                     //exit loop when low > high
        int mid = low + (high - low)/2;
        if(isBadVersion(mid)){
            high = mid - 1;
        }else{
            low = mid + 1;
        }
    }
    return low;
}

static boolean isBadVersion(int mid) {
    return isBadVersion(mid);
}
}