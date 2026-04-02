class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = 0;
        int maxSum = nums[0];

        for (int num: nums) {
            curSum = Math.max(curSum + num, num);
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
    }
}
