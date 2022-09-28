package sortings;
// 448. Find All Numbers Disappeared in an Array

import java.util.ArrayList;
import java.util.Arrays;

// Easy

import java.util.List;

 
// 7385

// 408

// Add to List

// Share
// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
public class findallnumdisappeared {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDisappearedNumbers(arr));

    }

    static List<Integer> findDisappearedNumbers(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != correct) {
                swap(arr, i, correct);

            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int ind = 0; ind < arr.length; i++) {
            if (arr[ind] != ind + 1) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
