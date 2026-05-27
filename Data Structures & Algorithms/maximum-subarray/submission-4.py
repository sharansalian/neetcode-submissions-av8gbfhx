class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxSum = nums[0]
        n = len(nums)

        for i in range(n):
            cur = 0
            for j in range(i, n):
                cur += nums[j]
                maxSum = max(maxSum, cur)
        
        return maxSum


        