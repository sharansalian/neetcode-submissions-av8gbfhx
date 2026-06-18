class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        total = sum(nums) # O(n) pivot mean or balancing point brilliant. 
        leftSum = 0 # 11
         # [1,7,3,6,5,6]
         #        i 
        for i in range(len(nums)):
            rightSum = total - nums[i] - leftSum
            if rightSum == leftSum:
                return i
            leftSum += nums[i]
        
        return -1
