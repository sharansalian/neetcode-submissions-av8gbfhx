class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globMax = nums[0], globMin = nums[0];
        int curMax = 0, curMin = 0;
        int total = 0;
        for (int num : nums) {
            curMax = Math.max(curMax + num, num);
            curMin = Math.min(curMin + num, num);

            
            globMax = Math.max(globMax, curMax);
            globMin = Math.min(globMin, curMin);

            total += num;
        }

        return globMax > 0 ? Math.max(globMax, total - globMin) : globMax;
    }
}