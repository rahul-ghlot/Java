public class SlideWindow {
    public static void main(String[] args) {
        int nums [] = {5,6,1,2,6,6,4,3};
        int k = 3;
        int maxSum = maxSumSubarray(nums, k);
        System.out.println(maxSum);
    }

    public static int maxSumSubarray(int nums[], int k){
       int maxSum = 0;

       for(int i=0; i<k; i++){
           maxSum += nums[i];
       }

       int currentSum = maxSum;

       for(int i= k; i<nums.length; i++){
           currentSum += nums[i] - nums[i-k];
           maxSum = Math.max(maxSum, currentSum);
       }

       return maxSum;
    }
}


/**
 * Approach
 * 1. Calculate the sum of first k elements
 * 2. initialize the maximum sum of first k elements
 * 3. Slide the window one element at a time by subtracting the element that is left and adding the new element.
 * 4. update the maximum sum if the new window sum is greater
 */