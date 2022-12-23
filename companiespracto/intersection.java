
import java.util.*;

import javax.crypto.spec.PBEKeySpec;

public class intersection {
    public static void main(String[] args) {
        int arr1[] = { 3, 2, 1, 4, 5 };
        int arr2[] = { 5, 3, 2, 8, 9 };
        String s = "abcabcbb";
        int maxLength = str(s);
        System.out.println(maxLength);        
         // name(arr1, arr2);
    }

    public static void name(int arr1[], int arr2[]) {
        HashSet<Integer> has = new HashSet<>();
        for (int i : arr1) {
            has.add(i);
        }
        for (int j : arr2) {
            if (has.contains(j)) {
                System.out.println(j);
            }
        }

    }

    public static int str(String str) {
        HashSet<Character> has = new HashSet<>();
        int start = 0;
        int end = 0;
        int maxlength = 0;
        while (end < str.length()) {
            char c = str.charAt(end);
            if (!has.contains(c)) {
                has.add(c);
                end++;
                maxlength = Math.max(maxlength, end - start);
            } else {
                has.remove(str.charAt(start));
                start++;
            }
        }
        System.out.println(has);
        return maxlength;
    }

}