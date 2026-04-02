class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE; 
        int currentSum = 0;

        for (int n: nums) {
            currentSum = Math.max(currentSum + n, n);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
        
    }
}
