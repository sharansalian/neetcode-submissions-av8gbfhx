class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxCount = 0
        count = 0
        for n in nums: 
            if n == 0:
                count = 0
            else:
                count += 1
            maxCount = max(maxCount, count)

        
        return maxCount